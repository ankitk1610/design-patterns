package command;

import command.component.MusicPlayer;

public class MusicPlayerPlayPreviousCommand implements Command {
	
	MusicPlayer musicPlayer;

	public MusicPlayerPlayPreviousCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.playPrevious();
	}

}
