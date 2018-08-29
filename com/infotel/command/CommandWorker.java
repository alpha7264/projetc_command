package projetc_command.com.infotel.command;
import java.util.ArrayList;
import java.util.List;

public class CommandWorker {

	List<Worker> workers;
	int currentIndex;

	public CommandWorker() {
		workers = new ArrayList<Worker>();
		currentIndex = 0;
	}

	public void previous() {
		currentIndex--;
	}

	public void next() {
		currentIndex++;
	}

	public void play() {
		workers.get(currentIndex).run();
	}

	public void addCommand(Worker worker) {
		workers.add(worker);
	}
}