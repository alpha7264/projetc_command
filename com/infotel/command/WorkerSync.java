package projetc_command.com.infotel.command;

public class WorkerSync implements Worker {


	@Override
	public void run() {
		System.out.println("Exécution synchrone");
		action1();
		action2();
		
	}

	@Override
	public void action1() {
		System.out.println("Action 1");
		
	}

	@Override
	public void action2() {
		System.out.println("Action 2");
		
	}

}
