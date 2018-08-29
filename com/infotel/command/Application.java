package projetc_command.com.infotel.command;

public class Application {

	public static void main(String[] args) {
		
		CommandWorker cw = new CommandWorker();
		cw.addCommand(new WorkerAsync());
		cw.addCommand(new WorkerSync());
		cw.play();
		cw.next();
		cw.play();
		
		
	}
}
