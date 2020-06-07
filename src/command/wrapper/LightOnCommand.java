package command.wrapper;

import components.Light;

public class LightOnCommand implements Command {
	
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.swtichOn();
	}

}
