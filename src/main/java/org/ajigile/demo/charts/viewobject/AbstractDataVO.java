package org.ajigile.demo.charts.viewobject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.ajigile.demo.charts.dataset.AbstractDataset;
import org.ajigile.demo.charts.dataset.Report1Dataset;
import org.springframework.stereotype.Component;


public abstract class AbstractDataVO {


	//protected String type;
	protected Set<String> labels; // X-axis series label
	protected List<AbstractDataset> datasets;
	
	//private Set<String> datasetLabels; // in BO: regions name
	
	public AbstractDataVO() {
		this.labels = new LinkedHashSet<>();
		this.datasets = new ArrayList<>();
		//this.datasetLabels = new LinkedHashSet<>();
		
	}
	

//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	
	
	public Set<String> getLabels() {
		return labels;
	}
	public List<AbstractDataset> getDatasets() {
		return datasets;
	}
	
	
	public abstract void addData(String region, String serie, Number value);
	
	
	
}
