package org.ajigile.demo.charts.dataset;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractDataset {

	protected String borderColor = "rgba(0,0,0,1)"; //rgba : default black
	protected String backgroundColor = "rgba(0,0,0,1)";
	protected Integer borderWidth = 1; // default 1
	protected boolean fill = false;
	
	protected String label;
	protected List<Number> data;
	
	protected AbstractDataset() {
//		this.borderColor.add("rgba(0,0,0,1)");
//		this.borderColor.add("rgba(255,0,0,1)"); // red
//		this.borderColor.add("rgba(0,255,0,1)"); //green
//		this.borderColor.add("rgba(0,0,255,1)"); // blue
//		this.borderColor.add("rgba(255,255,0,1)"); // yellow
//		
//		this.backgroundColor.add("rgba(0,0,0,1)");
//		this.backgroundColor.add("rgba(255,0,0,1)"); // red
//		this.backgroundColor.add("rgba(0,255,0,1)"); //green
//		this.backgroundColor.add("rgba(0,0,255,1)"); // blue
//		this.backgroundColor.add("rgba(255,255,0,1)"); // yellow
		
		
		this.label = "(not-set)";
		this.data = new ArrayList<>();
	}
	
	
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
//		for(int i=0;i<10;i++) {
//			this.borderColor.add(borderColor.get(0));
//		}
		this.borderColor = borderColor;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}


	public void setBackgroundColor(String backgroundColor) {
//		for(int i=0;i<10;i++) {
//			this.backgroundColor.add(backgroundColor.get(0));
//		}
		this.backgroundColor = backgroundColor;
	}


	public Integer getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<Number> getData() {
		return data;
	}
	public void setData(List<Number> data) {
		this.data = data;
	}
	
	public abstract void addData(Number value);
	
}
