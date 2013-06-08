package cn.com.fighter.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String ip = "192.168.0.130";
		String ip = "127.0.0.1";
		String[] location = {"rmi://ip/gumballmachine",
                "rmi://ip/gumballmachine",
                "rmi://ip/gumballmachine"}; 
		GumballMonitor[] gumballMonitor = new GumballMonitor[location.length];
		
		for(int i = 0 ; i < location.length;i++){
			try {
				GumballMachineRemote gumballMachineRemote = (GumballMachineRemote)Naming.lookup(location[i]);
				gumballMonitor[i] = new GumballMonitor(gumballMachineRemote);
				System.out.println(gumballMonitor[i]);
			
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		for(int i=0; i < gumballMonitor.length; i++) {
			gumballMonitor[i].report();
		}
	}

}
