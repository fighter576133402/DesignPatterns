package cn.com.fighter.commandpattern.controler;

import cn.com.fighter.commandpattern.command.Command;

public class SimpleRemoteControl {

	Command slot;

	public void setSlot(Command slot) {
		this.slot = slot;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
