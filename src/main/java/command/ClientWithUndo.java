package command;

import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.reciever.Light;

public class ClientWithUndo {

    public static void main(String[] args) {
        RemoteInvokerWithUndo remoteInvokerWithUndo = new RemoteInvokerWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        remoteInvokerWithUndo.setCommand(0, lightOnCommand, lightOffCommand);

        remoteInvokerWithUndo.onButtonWasPressed(0);
        remoteInvokerWithUndo.offButtonWasPressed(0);
        System.out.println(remoteInvokerWithUndo);

        remoteInvokerWithUndo.undoButtonWasPressed();
        remoteInvokerWithUndo.offButtonWasPressed(0);
        remoteInvokerWithUndo.onButtonWasPressed(0);
        System.out.println(remoteInvokerWithUndo);

        remoteInvokerWithUndo.undoButtonWasPressed();
    }
}
