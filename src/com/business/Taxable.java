package com.business;

public interface Taxable {

	
		//Since this is an interface all variables are static by default
		double TAX_RATE = 0.18;

	//This will calculate the price after taxes
		public double getTax(double amount);

	

}
