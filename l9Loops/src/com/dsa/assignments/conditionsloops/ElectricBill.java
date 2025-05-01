package com.dsa.assignments.conditionsloops;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units = 250;
		System.out.println("Your EB Bill is : "+calculateBill(units));
	}
	
	static double  calculateBill(int units) {
		double priceUnder100 =2.5;
		double priceUnder200 =3.7;
		double priceAbove200 =5;
		
		if(units <= 100) {
			return units * priceUnder100;
		}else if(units > 100 && units <= 200) {
			return (100 * priceUnder100) + ((units-100)*priceUnder200);
		}else {
			return (100 * priceUnder100) + (100*priceUnder200)+ ((units-200)*priceAbove200);
		}
		
	}

}
