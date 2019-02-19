package proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

public class LoadingState implements State {
    private ImageProxy imageProxy;

    public LoadingState(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }
}
