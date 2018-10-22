package adapter.duck;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("duck says...");
        testDuck(mallarDuck);

        System.out.println("TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
