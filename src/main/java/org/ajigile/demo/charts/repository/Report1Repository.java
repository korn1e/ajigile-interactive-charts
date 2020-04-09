package org.ajigile.demo.charts.repository;

import java.util.List;

import org.ajigile.demo.charts.entity.Report1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Report1Repository extends CrudRepository<Report1, Long> {

	public List<Report1> findAllByOrderByYearAscFileTypeAsc();
	public List<Report1> findAllByYearBetweenOrderByYearAscFileTypeAsc(Integer from, Integer to);
	
}
