package command;

import java.util.Scanner;

public class RemoteControllerTest {
	public static void main(String[] args) {

		RemoteController remote = new RemoteController();
		remote.setUp();

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Press any button perform task, -1 to exit, 99 for Undo");
				int input = scanner.nextInt();
				if (input == -1) {
					break;
				} else if (input == 99) {
					remote.undoPressed();
				} else {
					remote.buttonPressed(input);
				}
			}
		}
	}

}
