package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

//    private Menu pancakeHouseMenu;
//    private Menu dinerMenu;
//    private Menu cafeMenu;

    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dineMenu;
//        this.cafeMenu = cafeMenu;

        this.menus = menus;
    }

    public void printMenu(){
//        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//
//        System.out.println("Menu\n----\nBREAKFAST");
//        printMenu(pancakeIterator);
//        System.out.println("\nLUNCH");
//        printMenu(dinerIterator);
//        System.out.println("\nDINER");
//        printMenu(cafeIterator);

        Iterator<Menu> menuIterator = menus.iterator();

        while(menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
