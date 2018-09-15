package observer.jbutton;

import javax.swing.*;

public class SwingObserverExample {

    JFrame jFrame;

    public static void main(String[] args) {

        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();

    }

    private void go() {

        jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener((event) -> System.out.println("Evil: Do it!"));
        jButton.addActionListener((event) -> System.out.println("Angel: Don't do it!"));
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

}
