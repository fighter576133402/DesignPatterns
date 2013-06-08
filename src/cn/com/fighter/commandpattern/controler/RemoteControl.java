package cn.com.fighter.commandpattern.controler;

import cn.com.fighter.commandpattern.command.Command;
import cn.com.fighter.commandpattern.command.commandImpl.NoCommand;

public class RemoteControl {
	Command [] onCommands;
	Command [] offCommands;
	Command undoCommand;//ǰһ���������¼������
	public RemoteControl(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i = 0;i < 7;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand ; //һ��ʼû����ν��ǰһ��������Խ������ó�NoCommand����
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
		System.out.println();
	}
	
	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed(){
		undoCommand.undo();
	}
	
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------Remote Control------\n");
		for(int i = 0 ; i < onCommands.length;i++){
			stringBuffer.append("[slot " + i+"]" +onCommands[i].getClass().getName()+ "   " +offCommands[i].getClass().getName() +"\n");
		}
		return stringBuffer.toString();
	}
}
