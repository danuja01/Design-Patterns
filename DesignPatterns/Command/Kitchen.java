package DesignPatterns.Command;

public class Kitchen implements Light {

	@Override
	public void on() {
		System.out.println("Kitchen Lights ON");
		
	}

	@Override
	public void off() {
		System.out.println("Kitchen Lights OFF");
		
	}

}
