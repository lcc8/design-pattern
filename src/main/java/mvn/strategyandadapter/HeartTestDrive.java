package mvn.strategyandadapter;

import mvn.controller.ControllerInterface;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel model = new HeartModel();
        ControllerInterface controller = new HeartController(model);

    }
}
