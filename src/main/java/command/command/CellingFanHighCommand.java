package command.command;

import command.reciever.CellingFan;

public class CellingFanHighCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanHighCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CellingFan.HIGH:
                cellingFan.high();
                break;
            case CellingFan.MEDIUM:
                cellingFan.medium();
                break;
            case CellingFan.LOW:
                cellingFan.low();
                break;
            case CellingFan.OFF:
                cellingFan.off();
                break;
        }
    }
}
