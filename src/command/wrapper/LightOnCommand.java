package command.wrapper;

import command.component.Light;

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
