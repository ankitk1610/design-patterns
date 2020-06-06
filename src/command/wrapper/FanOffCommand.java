package command.wrapper;

import command.component.Fan;

public class FanOffCommand implements Command {

	Fan fan;

	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.switchOff();
	}

}
