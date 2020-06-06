package strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Bird sparrow = new Bird();
		sparrow.setType("Simple Sparrow");
		sparrow.setFlyBehaviour(new FlyNormally());
		sparrow.tweet();
		sparrow.fly();

		Bird rocket = new Bird();
		rocket.setType("Rocket");
		rocket.setFlyBehaviour(new FlyWithRocketBooster());
		rocket.tweet();
		rocket.fly();

		Bird hybrid = new Bird();
		hybrid.setType("Hybrid");
		hybrid.setFlyBehaviour(new FlyNormally());
		hybrid.tweet();
		System.out.println("I will fly normally");
		hybrid.fly();
		System.out.println("Rocket Booster!!!");
		hybrid.setFlyBehaviour(new FlyWithRocketBooster());
		hybrid.fly();

	}
}
