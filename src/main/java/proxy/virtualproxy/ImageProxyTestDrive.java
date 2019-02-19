package proxy.virtualproxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {

    private ImageComponent imageComponent;

    private JFrame jFrame = new JFrame("CD Cover Viewer");
    private JMenuBar jMenuBar;
    private JMenu jMenu;
    Hashtable cds = new Hashtable();

    public ImageProxyTestDrive() throws MalformedURLException {
        cds.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("karama", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");

        URL initialURL = new URL((String) cds.get("Buddha Bar"));
        jMenuBar = new JMenuBar();
        jMenu = new JMenu("Favourite CDs");
        jMenuBar.add(jMenu);
        jFrame.setJMenuBar(jMenuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            jMenu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                jFrame.repaint();
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        jFrame.getContentPane().add(imageComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800,600);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    private URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
