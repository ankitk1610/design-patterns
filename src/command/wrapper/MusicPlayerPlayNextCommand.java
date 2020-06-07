package command.wrapper;

import components.MusicPlayer;

public class MusicPlayerPlayNextCommand implements Command {
	
	MusicPlayer musicPlayer;

	public MusicPlayerPlayNextCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public void execute() {
		musicPlayer.playNext();
	}

}
