package components;

public class MusicPlayer {

	String info;

	public MusicPlayer(String info) {
		super();
		this.info = info;
	}

	public void play() {
		System.out.println(info + " Music playing..");
	}

	public void pause() {
		System.out.println(info + " Music paused.");
	}

	public void playNext() {
		System.out.println(info + " Playing next song..");
	}

	public void playPrevious() {
		System.out.println(info + " Playing previous song..");
	}
}
