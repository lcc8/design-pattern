package proxy.gumballmachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            GumballMachine gumballMachine = new GumballMachine(args[0], count);
            String name = args[0] + "/gumballmachine";
            System.out.println("register: " + name);
            Naming.rebind(name, gumballMachine);
            } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
