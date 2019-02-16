package proxy.gumballmonitor;

import proxy.gumballmachine.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
//        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
//                "rmi://boulder.mightygumball.com/gumballmachine",
//                "rmi://127.0.0.1/seattle/gumballmachine"};
//
//        GumballMonitor[] gumballMonitor = new GumballMonitor[location.length];
//
//        for(int i = 0; i < location.length; i++){
//            try{
//                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
//
//                gumballMonitor[i] = new GumballMonitor(machineRemote);
//                System.out.println(gumballMonitor[i]);
//
//            } catch (RemoteException e) {
//                e.printStackTrace();
//            } catch (NotBoundException e) {
//                e.printStackTrace();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for(int i = 0; i < gumballMonitor.length; i++){
//            gumballMonitor[i].report();
//        }


        GumballMonitorTestDrive gumballMonitor = new GumballMonitorTestDrive();
        gumballMonitor.go();

    }

    private void go() {
        {
            try {
                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/seattle/gumballmachine");
                String s = machineRemote.sayHello();
                System.out.println(s);

                GumballMonitor gumballMonitor = new GumballMonitor(machineRemote);
                gumballMonitor.report();
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
