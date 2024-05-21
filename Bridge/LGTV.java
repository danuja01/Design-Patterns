package Bridge;

public class LGTV implements TV {

	@Override
	public void on() {
		System.out.println("LG TV ON");
	}

	@Override
	public void off() {
		System.out.println("LG TV OFF");
		
	}

	@Override
	public void tune(int chnl) {
		System.out.println("Switched to chanel " + chnl);
		
	}

}
