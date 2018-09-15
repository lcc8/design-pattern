package factory.ingredientsfactory;

import factory.ingredients.FreshClams;
import factory.ingredients.Garlic;
import factory.ingredients.MarinaraSauce;
import factory.ingredients.RedPepper;
import factory.ingredients.ReggianoCheese;
import factory.ingredients.Sauce;
import factory.ingredients.Cheese;
import factory.ingredients.Clams;
import factory.ingredients.Dough;
import factory.ingredients.Pepperoni;
import factory.ingredients.SlicedPepperoni;
import factory.ingredients.ThinCrustDough;
import factory.ingredients.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = new Veggie[]{new Garlic(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
