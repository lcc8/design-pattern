package singleton;

public class ChocolateBoilet {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilet uniqueChocolateBoilet;

    private ChocolateBoilet() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilet getInstance(){
        if(uniqueChocolateBoilet == null){
            uniqueChocolateBoilet = new ChocolateBoilet();
        }

        return uniqueChocolateBoilet;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            // fill up
            System.out.println("Fill up");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // bring content to boil
            boiled = true;
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}
