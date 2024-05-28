package DesignPatterns.Bridge;

public class Main {
	public static void main(String[] args) {
		RemoteController rmc = new RemoteControllerImpl(new LGTV());
		rmc.on();
		rmc.tune(15);
		
		RemoteController rmc1 = new RemoteControllerImpl(new SonyTV());
		rmc1.on();
		rmc1.tune(11);
	}
}
