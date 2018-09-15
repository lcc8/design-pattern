package factory.pizzastore;

import factory.ingredients.Recipes;
import factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(Recipes recipes) {
        switch(recipes){
            case CHEESE:
//                return new CheesePizza();
//            case VEGGIE:
//                return new ChicagoVeggiePizzaStore();
//            case CLAM:
//                return new ChicagoClamPizzaStore();
//            case PEPPERONI:
//                return new ChicagoPepperoniPizzaStore();
                default:
                    return null;
        }
    }
}
