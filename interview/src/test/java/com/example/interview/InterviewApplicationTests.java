package com.example.interview;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.interview.model.ExerciseModel;
import com.example.interview.repository.ExerciseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class InterviewApplicationTests {

	@Autowired
	ExerciseRepository repo;
	
	@Test
	public void testCreate() {
		ExerciseModel model = new ExerciseModel();
		model.setId(1L);
		model.setOrders(1);
		model.setLevel("test");
		model.setCode("test");
		model.setParent("test");
		model.setDescription("test");
		model.setItemIncl("test");
		model.setItemAlsoIncl("test");
		model.setRulings("test");
		model.setItemExcl("test");
		model.setReference("test");
		assertNotNull(repo.getData(1));
	}

}
