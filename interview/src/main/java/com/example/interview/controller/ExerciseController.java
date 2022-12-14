package com.example.interview.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.interview.service.ExerciseService;
import com.example.interview.model.ExerciseModel;



@RestController
public class ExerciseController {
	
	@Autowired
	public ExerciseService es;

	@PostMapping("/putNaceDetails")
	public ResponseEntity<String> putNaceDetails() {
		String message = "";

			try {
				es.putNaceDetails();
				message = "Uploaded the file successfully";

				//return new ResponseEntity<>(HttpStatus.OK);
				return ResponseEntity.status(HttpStatus.OK).body(message);
			} catch (Exception e) {
				message = "Could not upload the file: ";
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
			}
	}

	@GetMapping("/getNaceDetails/{orders}")
	public ResponseEntity<List<ExerciseModel>> getNaceDetails(@PathVariable int orders) {
		try {
			List<ExerciseModel> data = es.getNaceDetails(orders);

			if (data.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/getallNaceDetails")
	public ResponseEntity<List<ExerciseModel>> getallNaceDetails() {
		try {
			List<ExerciseModel> data = es.getAllNaceDetails();

			if (data.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/deleteAllNaceDetails")
	public ResponseEntity<String> deleteAllNaceDetails() {
		String message = "";
		try {
			es.deleteAllNaceDetails();
			message = "All Record Removed";
			return ResponseEntity.status(HttpStatus.OK).body(message);
		} catch (Exception e) {
			message = "Issue while Removing The Records";
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
