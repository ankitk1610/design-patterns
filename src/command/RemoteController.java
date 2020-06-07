package command;

import java.util.ArrayList;
import java.util.List;

import command.wrapper.Command;
import command.wrapper.FanOffCommand;
import command.wrapper.FanOnCommand;
import command.wrapper.LightOffCommand;
import command.wrapper.LightOnCommand;
import command.wrapper.MusicPlayerPauseCommand;
import command.wrapper.MusicPlayerPlayCommand;
import command.wrapper.MusicPlayerPlayNextCommand;
import command.wrapper.MusicPlayerPlayPreviousCommand;
import components.Fan;
import components.Light;
import components.MusicPlayer;

public class RemoteController {

	List<Command> commands = new ArrayList<Command>();
	Command undo;
	public void setUp() {
		
		System.out.println("Setting up..");
		Light light = new Light("Drawing Room");
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		Fan fan = new Fan("Drawing Room");
		FanOnCommand fanOnCommand = new FanOnCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);

		MusicPlayer musicPlayer = new MusicPlayer("JBL");
		MusicPlayerPlayCommand musicPlayerPlayCommand = new MusicPlayerPlayCommand(musicPlayer);
		MusicPlayerPauseCommand musicPlayerPauseCommand = new MusicPlayerPauseCommand(musicPlayer);
		MusicPlayerPlayNextCommand mPlayerPlayNextCommand = new MusicPlayerPlayNextCommand(musicPlayer);
		MusicPlayerPlayPreviousCommand musicPlayerPlayPreviousCommand = new MusicPlayerPlayPreviousCommand(musicPlayer);

		commands.add(0, lightOnCommand);
		commands.add(1, lightOffCommand);
		commands.add(2, fanOnCommand);
		commands.add(3, fanOffCommand);
		commands.add(4, musicPlayerPlayCommand);
		commands.add(5, musicPlayerPauseCommand);
		commands.add(6, mPlayerPlayNextCommand);
		commands.add(7, musicPlayerPlayPreviousCommand);
		
		System.out.println("Set up finished..");
	}

	public void buttonPressed(int i) {
		System.out.println("Button Pressed at Location : " + i);
		commands.get(i).execute();
		int undoButton = i%2 == 0 ? i+1 : i -1;
		undo = commands.get(undoButton);
		System.out.println("Undo Button work same as Button no.: " + undoButton);
		
	}
	public void undoPressed() {
		System.out.println("Undo Pressed..");
		undo.execute();
	}
	
}
