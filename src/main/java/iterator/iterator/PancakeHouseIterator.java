package iterator.iterator;

import iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size()){
            return false;
        }

        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;

        return menuItem;
    }

}
