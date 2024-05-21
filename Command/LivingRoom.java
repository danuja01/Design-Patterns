package Command;

public class LivingRoom implements Light {

	@Override
	public void on() {
		System.out.println("Living Room Lights ON");
		
	}

	@Override
	public void off() {
		System.out.println("Living Room Lights OFF");
		
	}
	
}
