package singleton;

public class SingletonJVMCreation {
    private static SingletonJVMCreation uniqueInstance = new SingletonJVMCreation();

    private SingletonJVMCreation() {
    }

    public static SingletonJVMCreation getInstance(){
        return uniqueInstance;
    }
}
