package command.wrapper;

import components.MusicPlayer;

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
