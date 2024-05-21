package Command;

public class OffCommand implements Command{
	Light light;

	public OffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
	
}
