package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;
    private Iterator iterator;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Iterator<MenuComponent> createIterator(){
//        if(iterator == null) {
//            iterator = menuComponents.iterator();
//        }
//        return iterator;

        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }

        return iterator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------");

        Iterator<MenuComponent> menuComponentIterator = menuComponents.iterator();
        while(menuComponentIterator.hasNext()){
            MenuComponent menuComponent = menuComponentIterator.next();
            menuComponent.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }
}
