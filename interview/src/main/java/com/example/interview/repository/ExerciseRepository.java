package com.example.interview.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.interview.model.ExerciseModel;

@Repository()
public interface ExerciseRepository extends CrudRepository<ExerciseModel, Integer> {

	@Query(value = "SELECT * from exercisedb.nace ed where ed.orders = ?1", nativeQuery = true)
	public List<ExerciseModel> getData(int orders);
}