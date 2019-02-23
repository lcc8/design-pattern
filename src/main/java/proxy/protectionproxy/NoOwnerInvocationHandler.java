package proxy.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NoOwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public NoOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                return method.invoke(personBean, args);
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }

        return null;
    }

    public PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new NoOwnerInvocationHandler(personBean));
    }
}
