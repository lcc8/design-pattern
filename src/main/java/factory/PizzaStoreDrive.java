package factory;

import factory.pizza.Pizza;
import factory.pizzastore.ChicagoPizzaStore;
import factory.pizzastore.NYPizzaStore;
import factory.pizzastore.PizzaStore;
import factory.ingredients.Recipes;

public class PizzaStoreDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(Recipes.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();

//        pizza = chicagoStore.orderPizza(Recipes.CHEESE);
//        System.out.println("Joel ordered a " + pizza.getName());
//        System.out.println();
    }
}
