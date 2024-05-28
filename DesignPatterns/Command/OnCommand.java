package DesignPatterns.Command;

public class OnCommand implements Command {
	
	Light light;

	public OnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
			light.on();
	}

}
