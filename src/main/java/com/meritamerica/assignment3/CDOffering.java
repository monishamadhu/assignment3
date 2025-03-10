package com.meritamerica.assignment3;

public class CDOffering {
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return this.term;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public static CDOffering readFromString(String cdOfferingDataString) throws java.lang.NumberFormatException{
		//expecting like this: 1,0.018
		CDOffering cd = null;

		if(cdOfferingDataString.indexOf(',')!=-1) {
			int term = Integer.parseInt(cdOfferingDataString.substring(0, cdOfferingDataString.indexOf(',')));  
			double rate = Double.parseDouble(cdOfferingDataString.substring(cdOfferingDataString.indexOf(',')+1));
			cd = new CDOffering(term,rate);
		} 
		else {
			throw new NumberFormatException();
		}

		return cd;
	}

	public String writeToString() {
		String cdString = this.getTerm() + "," + this.getInterestRate();
		return cdString;
	}

	private int term;
	private double interestRate;

}
