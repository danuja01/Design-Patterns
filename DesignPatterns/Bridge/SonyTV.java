package DesignPatterns.Bridge;

public class SonyTV implements TV {

	@Override
	public void on() {
		System.out.println("Sony TV ON");
	}

	@Override
	public void off() {
		System.out.println("Sony TV OFF");
		
	}

	@Override
	public void tune(int chnl) {
		System.out.println("Switched to chanel " + chnl);
		
	}


}
