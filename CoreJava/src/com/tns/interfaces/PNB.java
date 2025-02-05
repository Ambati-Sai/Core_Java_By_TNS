package com.tns.interfaces;

public class PNB implements Bank {

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 6.5f;
	}
	public static void main(String[] args) {
		PNB r = new PNB();
		System.out.println("PNB rate of interest:"+r.rateofinterest());
		SBI s = new SBI();
		System.out.println("SBI rate of interest:"+s.rateofinterest());
		
	}

}
