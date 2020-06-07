package adapter;

public class HDMIPlayer implements HDMI {

	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void display() {
		System.out.println(type + " Playing through HDMI Player");
	}

}
