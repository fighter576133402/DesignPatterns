package cn.com.fighter.commandpattern.command.commandImpl;

import cn.com.fighter.commandpattern.command.Command;
import cn.com.fighter.commandpattern.entity.CeilingFan;

public class CeilingFanLowCommand implements Command {

	CeilingFan ceilingFan;
	int prevSpeed;
	public CeilingFanLowCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		switch (prevSpeed) {
		case CeilingFan.HIGH:
			ceilingFan.high();
			break;

		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			break;
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
		case CeilingFan.OFF:
			ceilingFan.off();
			break;
		}
	}


}
