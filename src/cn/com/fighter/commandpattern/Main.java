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
		//创建设备如果位置不同那么要用工厂创建到合适的位置
		Light light = new Light();
		CeilingFan ceilingFan = new CeilingFan("Living room");
		//创建所有设备的打开命令对象
		LightOnCommand liOnCommand = new LightOnCommand(light);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		//创建所有设备的关闭命令对象
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		//一个数组用来记录开启命令，一个数组用来记录关闭命令
		Command[] partyOn = {liOnCommand,ceilingFanHighCommand};
		Command[] partyOff ={lightOffCommand,ceilingFanOffCommand};
		//然后创建两个对应的宏来持有他们
		MacroCommand macroCommandOff = new MacroCommand(partyOff);
		MacroCommand macroCommandOn = new MacroCommand(partyOn);
		//将宏命令指定一个按钮
		remoteControl.setCommand(0, macroCommandOn, macroCommandOff);//现在把命令加载到遥控器的插槽中
		//按下那个按钮测试
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//		System.out.println(remoteControl);
		
	}

}
