package command;

import command.command.GarageDoorDownCommand;
import command.command.GarageDoorOpenCommand;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.command.StereoOffCommand;
import command.command.StereoOnWithCDCommand;
import command.reciever.GarageDoor;
import command.reciever.Light;
import command.reciever.Stereo;

public class Client {

    public static void main(String[] args) {

        // Simple way
//        SimpleRemoteInvoker remote = new SimpleRemoteInvoker();
//
//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//
//        GarageDoor garageDoor = new GarageDoor();
//        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
//
//        remote.setCommand(lightOnCommand);
//        remote.buttonWasPressed();
//
//        remote.setCommand(garageDoorOpenCommand);
//        remote.buttonWasPressed();

        // Remote way
        RemoteInvokerWithUndo remoteInvokerWithUndo = new RemoteInvokerWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kichenRoomLight = new Light("Kitchen");

        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightivingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kichenRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kichenRoomLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteInvokerWithUndo.setCommand(0, lightivingRoomLightOn, livingRoomLightOff);
        remoteInvokerWithUndo.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteInvokerWithUndo.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);
        remoteInvokerWithUndo.setCommand(3, garageDoorOpenCommand, garageDoorDownCommand);

        System.out.println(remoteInvokerWithUndo);

        remoteInvokerWithUndo.onButtonWasPressed(0);
        remoteInvokerWithUndo.offButtonWasPressed(0);
        remoteInvokerWithUndo.onButtonWasPressed(1);
        remoteInvokerWithUndo.offButtonWasPressed(1);
        remoteInvokerWithUndo.onButtonWasPressed(2);
        remoteInvokerWithUndo.offButtonWasPressed(2);
        remoteInvokerWithUndo.onButtonWasPressed(3);
        remoteInvokerWithUndo.offButtonWasPressed(3);

    }
}
