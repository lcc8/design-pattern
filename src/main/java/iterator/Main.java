package iterator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }

}
