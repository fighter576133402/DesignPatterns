package cn.com.fighter.commandpattern.command.commandImpl;

import cn.com.fighter.commandpattern.command.Command;
import cn.com.fighter.commandpattern.entity.Light;

public class LightOnCommand implements Command{

	Light light;
	public LightOnCommand(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}