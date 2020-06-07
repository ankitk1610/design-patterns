package adapter;

public class HDMIToUSBAdapter implements USB {

	HDMI hdmi;
	
	
	public HDMI getHdmi() {
		return hdmi;
	}


	public void setHdmi(HDMI hdmi) {
		System.out.println("An HDMI Player connected via USB");
		this.hdmi = hdmi;
	}


	@Override
	public void signal() {
		// TODO Auto-generated method stub
		System.out.println("HDMI to USB Adapter.. Playing via USB");
		
		hdmi.display();
	}

}
