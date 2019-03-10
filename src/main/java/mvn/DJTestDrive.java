package mvn;

import mvn.controller.BeatController;
import mvn.controller.ControllerInterface;
import mvn.model.BeatModel;
import mvn.model.BeatModelInterface;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
