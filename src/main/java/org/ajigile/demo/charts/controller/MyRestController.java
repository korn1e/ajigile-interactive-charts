package org.ajigile.demo.charts.controller;

import org.ajigile.demo.charts.service.Report1Service;
import org.ajigile.demo.charts.viewobject.Report1DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {

	@Autowired
	private Report1Service report1Service;

	@GetMapping(path="/query", produces=MediaType.APPLICATION_JSON_VALUE)
	public Report1DataVO query(@RequestParam(name="from", defaultValue="2000") String from, @RequestParam(name="to", defaultValue="3000") String to) {
		
		return report1Service.getReport1Dataset(Integer.parseInt(from), Integer.parseInt(to));
	}
	
}
