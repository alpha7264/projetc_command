package projetc_command.com.infotel.command;

import java.util.concurrent.CompletableFuture;

public class WorkerAsync implements Worker {

	@Override
	public void run() {
		System.out.println("Exécution asynchrone " + Thread.currentThread());
		CompletableFuture.runAsync(() -> action1());
		CompletableFuture.supplyAsync(() -> 5);
		
		CompletableFuture.runAsync(() -> action2());
		CompletableFuture.supplyAsync(() -> 5);
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
