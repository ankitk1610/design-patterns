package command.wrapper;

import command.component.MusicPlayer;

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
