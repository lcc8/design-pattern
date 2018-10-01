package command;

import command.command.CellingFanHighCommand;
import command.command.CellingFanOffCommand;
import command.command.Command;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.command.MacroCommand;
import command.command.StereoOffCommand;
import command.command.StereoOnWithCDCommand;
import command.reciever.CellingFan;
import command.reciever.Light;
import command.reciever.Stereo;

public class ClientWithMacroCommand {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        CellingFan cellingFan = new CellingFan("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        Command[] onCommands = new Command[]{lightOnCommand, stereoOnWithCDCommand, cellingFanHighCommand};
        Command[] offCommands = new Command[]{lightOffCommand, stereoOffCommand, cellingFanOffCommand};

        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);

        RemoteInvokerWithUndo remoteInvokerWithUndo = new RemoteInvokerWithUndo();
        remoteInvokerWithUndo.setCommand(0, macroOnCommand, macroOffCommand);

        System.out.println(remoteInvokerWithUndo);

        System.out.println("Macro on");
        remoteInvokerWithUndo.onButtonWasPressed(0);

        System.out.println("Macro off");
        remoteInvokerWithUndo.offButtonWasPressed(0);

    }
}
