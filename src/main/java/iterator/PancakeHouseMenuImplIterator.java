package iterator;

import iterator.iterator.PancakeHouseIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuImplIterator {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenuImplIterator() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, and sausage", false, 2.99);
        addItem("Blueberry Pancake", "Pancake with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public ArrayList<MenuItem> getMenuItems(){
//        return menuItems;
//    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
