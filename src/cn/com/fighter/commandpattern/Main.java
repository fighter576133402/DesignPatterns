package cn.com.fighter.commandpattern;

import cn.com.fighter.commandpattern.command.Command;
import cn.com.fighter.commandpattern.command.MacroCommand;
import cn.com.fighter.commandpattern.command.commandImpl.CeilingFanHighCommand;
import cn.com.fighter.commandpattern.command.commandImpl.CeilingFanOffCommand;
import cn.com.fighter.commandpattern.command.commandImpl.LightOffCommand;
import cn.com.fighter.commandpattern.command.commandImpl.LightOnCommand;
import cn.com.fighter.commandpattern.controler.RemoteControl;
import cn.com.fighter.commandpattern.entity.CeilingFan;
import cn.com.fighter.commandpattern.entity.Light;

public class Main {
	public static void main(String [] args) {
		RemoteControl remoteControl = new RemoteControl();
		//�����豸���λ�ò�ͬ��ôҪ�ù������������ʵ�λ��
		Light light = new Light();
		CeilingFan ceilingFan = new CeilingFan("Living room");
		//���������豸�Ĵ��������
		LightOnCommand liOnCommand = new LightOnCommand(light);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		//���������豸�Ĺر��������
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		//һ������������¼�������һ������������¼�ر�����
		Command[] partyOn = {liOnCommand,ceilingFanHighCommand};
		Command[] partyOff ={lightOffCommand,ceilingFanOffCommand};
		//Ȼ�󴴽�������Ӧ�ĺ�����������
		MacroCommand macroCommandOff = new MacroCommand(partyOff);
		MacroCommand macroCommandOn = new MacroCommand(partyOn);
		//��������ָ��һ����ť
		remoteControl.setCommand(0, macroCommandOn, macroCommandOff);//���ڰ�������ص�ң�����Ĳ����
		//�����Ǹ���ť����
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//		System.out.println(remoteControl);
		
	}

}
