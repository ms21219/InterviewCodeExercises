package com.example.interview.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.interview.model.ExerciseModel;
import com.example.interview.repository.ExerciseRepository;
import au.com.bytecode.opencsv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;


@Service
public class ExerciseService {

	@Autowired
	private ExerciseRepository repo;

	String line = "";

	public void putNaceDetails() {

		int iteration = 0;
		try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/file.csv"),
				CSVParser.DEFAULT_SEPARATOR, CSVParser.DEFAULT_QUOTE_CHARACTER)) {

			List<String[]> data = reader.readAll();

			reader.close();

			for (String[] line : data) {
				LinkedList<String> data1 = new LinkedList<String>();
				if (iteration == 0) {
					iteration++;
					continue;
				}
				for (int i = 0; i < line.length; i++) {
					System.out.print(line[i] + " ");
					data1.add(line[i] + " ");
				}
				ExerciseModel e = new ExerciseModel();
				int order = Integer.parseInt(data1.get(0).trim());
				e.setOrders(order);
				e.setLevel(data1.get(1));
				e.setCode(data1.get(2));
				e.setParent(data1.get(3));
				e.setDescription(data1.get(4));
				e.setItemIncl(data1.get(5));
				e.setItemAlsoIncl(data1.get(6));
				e.setRulings(data1.get(7));
				e.setItemExcl(data1.get(8));
				e.setReference(data1.get(9));
				repo.save(e);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<ExerciseModel> getNaceDetails(int orders) {
		return (List<ExerciseModel>) repo.getData(orders);
	}

	public List<ExerciseModel> getAllNaceDetails() {
		return (List<ExerciseModel>) repo.findAll();
	}
}
