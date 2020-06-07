package command.wrapper;

import components.MusicPlayer;

public class MusicPlayerPlayCommand implements Command {

	MusicPlayer musicPlayer;

	public MusicPlayerPlayCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.play();
	}

}
