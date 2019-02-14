package command;

import command.command.Command;

public class RemoteInvokerWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteInvokerWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
//        onCommands[slot] = onCommand;
//        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        if (!(onCommands[slot] instanceof NoCommand)) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    public void offButtonWasPressed(int slot) {
        if (!(onCommands[slot] instanceof NoCommand)) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ----- remote Control ------ \n");
        for (int i = 0; i < onCommands.length; i++) {
            if (!(onCommands[i] instanceof NoCommand)) {
                stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "      " + offCommands[i].getClass()
                                                                                                                        .getName() + "\n");
            }
        }
        return stringBuffer.toString();
    }
}
