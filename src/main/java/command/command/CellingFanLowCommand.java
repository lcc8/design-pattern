package command.command;

import command.reciever.CellingFan;

public class CellingFanLowCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanLowCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.low();
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
