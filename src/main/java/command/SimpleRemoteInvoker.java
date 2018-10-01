package command;

import command.command.Command;

public class SimpleRemoteInvoker {
    Command slot;

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
