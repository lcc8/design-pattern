package singleton;

public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck uniqueInstance = new SingletonDoubleCheck();

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonDoubleCheck.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }
}
