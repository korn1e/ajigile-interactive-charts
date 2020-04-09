package org.ajigile.demo.charts.viewobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ajigile.demo.charts.dataset.AbstractDataset;
import org.ajigile.demo.charts.dataset.Report1Dataset;
import org.springframework.stereotype.Component;

//@Component
public class Report1DataVO extends AbstractDataVO {

	public Report1DataVO() {
		super();
	}
	
//	public Report1DataVO(String type) {
//		super();
//		super.type = type;
//	}
//	
//	
	List<String> backgroundColor = Arrays.asList("rgba(0,0,0,1)", 
												"rgba(255,0,0,1)", 
												"rgba(0,255,0,1)", 
												"rgba(0,0,255,1)", 
												"rgba(255,255,0,1)");
	int c = 0;
	
	public void addData(String region, String serie, Number value) {
		
		
		
		labels.add(serie);
		if(datasets.size() == 0) {
			c = c>=backgroundColor.size() ? 0 : c;
			AbstractDataset ds = new Report1Dataset(region, backgroundColor.get(c++));
			datasets.add(ds);
		} 
		
		boolean found = false;
		AbstractDataset ds = datasets.stream()
								//.peek(d -> System.out.println(region))
								.filter(d -> d.getLabel().equals(region))
								//.peek(d -> System.out.println(region + " : " + d.getLabel()))
								.findFirst().orElse(null);
//								.orElseGet(() -> {return new Report1Dataset(region);});
	
		if(ds == null) {
			ds = new Report1Dataset(region, backgroundColor.get(c++));
			datasets.add(ds);
		}
		
		ds.addData(value);
		//ds.getBackgroundColor().add(backgroundColor.get(c));
		
		
	}
}
