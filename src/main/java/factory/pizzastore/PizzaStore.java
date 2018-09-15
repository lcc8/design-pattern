package factory.pizzastore;

import factory.ingredients.Recipes;
import factory.pizza.Pizza;

public abstract class PizzaStore {

    public final Pizza orderPizza(Recipes recipes){
        Pizza pizza = createPizza(recipes);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    protected abstract Pizza createPizza(Recipes recipes);

}
