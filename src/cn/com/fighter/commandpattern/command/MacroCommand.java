package cn.com.fighter.commandpattern.command;

public class MacroCommand implements Command {
	Command[] commands;
	public MacroCommand(Command[] commands){
		this.commands = commands;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int size = commands.length;
		for(int i = 0 ; i<size ;i++){
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		int size = commands.length;
		for(int i = 0 ; i<size ;i++){
			commands[i].undo();
		}
	}

}
