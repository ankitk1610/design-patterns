package facade;

import components.Fan;
import components.Light;
import components.MusicPlayer;

public class RoomSetupFacade {

	Fan fan;
	Light light;
	MusicPlayer musicPlayer;

	public RoomSetupFacade(Fan fan, Light light, MusicPlayer musicPlayer) {
		super();
		this.fan = fan;
		this.light = light;
		this.musicPlayer = musicPlayer;
	}
	
	public void setupRoom() {
		light.swtichOn();
		fan.switchOn();
		musicPlayer.play();
	}

}
