package com.example.domain;

public class SalesTax {

	private double taxRate;
	private String state;
	
	private double result;
	 
	public void setResult(double result) {
		this.result = result;
	}
	public double getResult() {
		return result;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
