package command;

public class CommandWorker extends Command {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				System.out.println("");
			}
		};
		t.start();
	}
}
