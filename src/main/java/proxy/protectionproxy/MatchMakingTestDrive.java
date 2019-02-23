package proxy.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

    private PersonBean joe;

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    private void drive() {
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("Bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Bowling, Go");
        }catch (Exception e){
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getProxy(InvocationHandler invocationHandler, PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), invocationHandler);
    }

    private void initializeDatabase() {
        joe = new PersonBeanImpl();
        joe.setName("Joe");
    }

    private PersonBean getOwnerProxy(PersonBean joe) {
        return (PersonBean) Proxy.newProxyInstance(joe.getClass().getClassLoader(), joe.getClass().getInterfaces(), new OwnerInvocationHandler(joe));
    }


    private PersonBean getNonOwnerProxy(PersonBean joe) {
        return (PersonBean) Proxy.newProxyInstance(joe.getClass().getClassLoader(), joe.getClass().getInterfaces(), new NoOwnerInvocationHandler(joe));
    }

}
