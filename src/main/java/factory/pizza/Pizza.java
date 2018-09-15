package factory.pizza;

import factory.ingredients.Sauce;
import factory.ingredients.Cheese;
import factory.ingredients.Clams;
import factory.ingredients.Dough;
import factory.ingredients.Pepperoni;
import factory.ingredients.Veggie;

public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggie[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public String toString() {
        String pizza = dough.getName() + ", " +  sauce.getName();
        if(veggies != null){
            for(Veggie veggie : veggies){
                pizza = pizza + ", " + veggie.getName();
            }
        }

        if(cheese != null){
            pizza = pizza + ", " + cheese.getName();
        }

        if(pepperoni != null){
            pizza = pizza + ", " + pepperoni.getName();
        }

        if(clam != null){
            pizza = pizza + ", " + clam.getName();
        }

        return pizza;
    }
}
