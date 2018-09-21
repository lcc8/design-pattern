package singleton.threadtest;

public class Test {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();

    }

}
