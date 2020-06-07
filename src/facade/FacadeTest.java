package facade;

import components.Fan;
import components.Light;
import components.MusicPlayer;

public class FacadeTest {
	public static void main(String[] args) {
		
		
		Light light = new Light("Room");
		Fan fan = new Fan("Room");
		MusicPlayer musicPlayer = new MusicPlayer("Room");
		
		
		System.out.println("Switching On Light..");
		light.swtichOn();
		System.out.println("Switching On Fan..");
		fan.switchOn();
		System.out.println("Playing Music..");
		musicPlayer.play();
		
		System.out.println("Yo had to press 3 Buttons..");
		
		System.out.println("Here, take a facade, ans simpy press button!");
		RoomSetupFacade facade = new RoomSetupFacade(fan, light, musicPlayer);
		System.out.println("set up room called..");
		facade.setupRoom();
		System.out.println("Voila! All done with one press only!!");
		
		
	}
}
