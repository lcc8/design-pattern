package factory.ingredientsfactory;

import factory.ingredients.Sauce;
import factory.ingredients.Cheese;
import factory.ingredients.Clams;
import factory.ingredients.Dough;
import factory.ingredients.Pepperoni;
import factory.ingredients.Veggie;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
