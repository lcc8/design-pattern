package command;

import command.command.CellingFanHighCommand;
import command.command.CellingFanMediumCommand;
import command.command.CellingFanOffCommand;
import command.reciever.CellingFan;

public class ClientWithFan {
    public static void main(String[] args) {
        RemoteInvokerWithUndo remoteInvokerWithUndo = new RemoteInvokerWithUndo();

        CellingFan cellingFan = new CellingFan("Living Room");

        CellingFanMediumCommand cellingFanMediumCommand = new CellingFanMediumCommand(cellingFan);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        remoteInvokerWithUndo.setCommand(0, cellingFanMediumCommand, cellingFanOffCommand);
        remoteInvokerWithUndo.setCommand(1, cellingFanHighCommand, cellingFanOffCommand);

        remoteInvokerWithUndo.onButtonWasPressed(0);
        remoteInvokerWithUndo.offButtonWasPressed(0);
        System.out.println(remoteInvokerWithUndo);
        remoteInvokerWithUndo.undoButtonWasPressed();

        remoteInvokerWithUndo.onButtonWasPressed(1);
        System.out.println(remoteInvokerWithUndo);
        remoteInvokerWithUndo.undoButtonWasPressed();
    }
}
