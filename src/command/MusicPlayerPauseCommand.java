package command;

import command.component.MusicPlayer;

public class MusicPlayerPauseCommand implements Command {

	MusicPlayer musicPlayer;

	public MusicPlayerPauseCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.pause();
	}

}
