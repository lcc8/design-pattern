package factory.ingredientsfactory;

import factory.ingredients.MozzarellaCheese;
import factory.ingredients.PlumTomatoSauce;
import factory.ingredients.Sauce;
import factory.ingredients.Cheese;
import factory.ingredients.Clams;
import factory.ingredients.Dough;
import factory.ingredients.FrozenClams;
import factory.ingredients.Pepperoni;
import factory.ingredients.SlicedPepperoni;
import factory.ingredients.Spinach;
import factory.ingredients.ThickCrustDough;
import factory.ingredients.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = new Veggie[]{new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
