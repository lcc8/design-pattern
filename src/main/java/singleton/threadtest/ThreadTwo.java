package singleton.threadtest;

import singleton.ChocolateBoilet;

public class ThreadTwo implements Runnable{

    @Override
    public void run() {
        ChocolateBoilet chocolateBoilet = ChocolateBoilet.getInstance();
        System.out.println(chocolateBoilet);
        chocolateBoilet.fill();
        chocolateBoilet.boil();
        chocolateBoilet.drain();
    }
}
