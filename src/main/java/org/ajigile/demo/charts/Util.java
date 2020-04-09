package org.ajigile.demo.charts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.StreamSupport;

import javax.annotation.PostConstruct;

import org.ajigile.demo.charts.entity.Report1;
import org.ajigile.demo.charts.repository.Report1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.SyslogOutputStream;

@Component
public class Util {

	@Autowired
	private Report1Repository report1Repository;
	
	@PostConstruct
	public void testData() {
		System.out.println("TEST DATA !!!!!!!!!!!!!!!!!!!!!");
		List<Report1> list = report1Repository.findAllByOrderByYearAscFileTypeAsc();
		list.stream().forEach(r -> System.out.println(r.getYear() + "," + r.getFileType() + "," + r.getTotalSize()));
	}
}
