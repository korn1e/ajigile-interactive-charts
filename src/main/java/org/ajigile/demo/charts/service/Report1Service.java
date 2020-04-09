package org.ajigile.demo.charts.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.ajigile.demo.charts.dataset.Report1Dataset;
import org.ajigile.demo.charts.entity.Report1;
import org.ajigile.demo.charts.repository.Report1Repository;
import org.ajigile.demo.charts.viewobject.Report1DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Report1Service {

	@Autowired
	private Report1Repository report1Repository;
	
	public Report1DataVO getReport1Dataset(Integer from, Integer to) {
		
		
		Report1DataVO result = new Report1DataVO();
		
		Iterable<Report1> report1 =  report1Repository.findAllByYearBetweenOrderByYearAscFileTypeAsc(from, to);
		
		StreamSupport.stream(report1.spliterator(), false).forEach(rpt -> result.addData(rpt.getFileType(), rpt.getYear()+"", rpt.getTotalSize()));
				
		return result;
	}
}
