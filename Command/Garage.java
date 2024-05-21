package Command;

public class Garage implements Light {

	@Override
	public void on() {
		System.out.println("Garage Lights ON");
		
	}

	@Override
	public void off() {
		System.out.println("Garage Lights OFF");
		
	}

}
