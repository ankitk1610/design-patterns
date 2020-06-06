package strategy;

public class Bird {
	private FlyBehaviour flyBehaviour;

	private String type;

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void fly() {
		flyBehaviour.fly();
	}
	
	public void tweet() {
		System.out.println("I am a " + type + " bird! twt twt..");
	}
}
