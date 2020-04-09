package org.ajigile.demo.charts.dataset;

import java.util.Arrays;
import java.util.List;



//@Component
public class Report1Dataset extends AbstractDataset{

	
	public Report1Dataset(String region) {
		super();
		setLabel(region);
	}

	public Report1Dataset(String region, String backgroundColor) {
		super();
		setLabel(region);
		setBackgroundColor(backgroundColor);
		setBorderColor(backgroundColor);
	}

	@Override
	public void addData(Number value) {
		getData().add(value);	
	}
	
	
	
}
