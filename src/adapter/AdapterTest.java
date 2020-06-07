package adapter;

public class AdapterTest {
	public static void main(String[] args) {
			HDMIPlayer hdmiPlayer = new HDMIPlayer();
			hdmiPlayer.setType("Simple HDMI Player");
			
			hdmiPlayer.display();
			
			HDMIToUSBAdapter hdmiToUSBAdapter = new HDMIToUSBAdapter();
			
			hdmiToUSBAdapter.setHdmi(hdmiPlayer);
			hdmiToUSBAdapter.signal();
	}
}
