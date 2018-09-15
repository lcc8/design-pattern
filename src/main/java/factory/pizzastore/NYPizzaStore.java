package factory.pizzastore;

import factory.ingredients.Recipes;
import factory.ingredientsfactory.NYPizzaIngredientFactory;
import factory.ingredientsfactory.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(Recipes recipes) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (recipes){
            case CHEESE:
                return new CheesePizza(pizzaIngredientFactory);
//            case VEGGIE:
//                return new NYStyleVeggiePizza();
            case CLAM:
                return new ClamPizza(pizzaIngredientFactory);
//            case PEPPERONI:
//                return new NYSStylePepperoniPizza();
             default:
                return null;
        }
    }
}
