package factory.pizzastore;

import factory.pizza.Pizza;
import factory.ingredients.Recipes;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(Recipes recipes) {
        switch(recipes){
//            case CHEESE:
//                return new CaliforniaCheesePizzaStore();
//            case VEGGIE:
//                return new CaliforniaVeggiePizzaStore();
//            case CLAM:
//                return new CaliforniaClamPizzaStore();
//            case PEPPERONI:
//                return new CaliforniaPepperoniPizzaStore();
            default:
                return null;
        }
    }
}
