package command.wrapper;

import command.component.MusicPlayer;

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
