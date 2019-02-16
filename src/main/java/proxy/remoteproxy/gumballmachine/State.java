package proxy.remoteproxy.gumballmachine;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuater();
    void turnCrank();
    void dispense();
    void refill();
}
