package br.com.bytebank.bank.model;

public class LifeInsurance implements Taxable {

	private double lifeInsuranceTax;
	
	@Override
	public double getTaxValue() {
		return 42;
	}

	
}
