package projetc_command.com.infotel.command;
import java.util.ArrayList;
import java.util.List;

public class CommandWorker {

	List<Command> commands;
	int currentIndex;

	public CommandWorker() {
		commands = new ArrayList<Command>();
		currentIndex = 0;
	}

	public void previous() {
		currentIndex--;
	}

	public void next() {
		currentIndex++;
	}

	public void play() {
		commands.get(currentIndex).execute();
	}

	public void addCommand(Command command) {
		commands.add(command);
	}
}