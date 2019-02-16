package proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    private volatile ImageIcon imageIcon;
    private final URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        }else{
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if(!retrieving){
                retrieving = true;

                retrievalThread = new Thread(() -> {
                    setImageIcon(new ImageIcon(imageURL, "CD Cover"));
                    c.repaint();
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else{
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }else{
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
    }
}
