package ADelegate;

public class DelegateTest {
    public static void main(String[] args) {
        Cook cook = new Cook();

        cook.setCooking(new Cocktail());
        cook.cooking();
        cook.setCooking(new Soup());
        cook.cooking();
        cook.setCooking(new Cutlet());
        cook.cooking();
}
}

interface CookingInterface{
    void cooking();
}

class Cocktail implements CookingInterface{

    @Override
    public void cooking() {
        System.out.println("Preparing cocktail");
    }
}
class Soup implements CookingInterface{

    @Override
    public void cooking() {
        System.out.println("Preparing soup");
    }
}
class Cutlet implements CookingInterface{

    @Override
    public void cooking() {
        System.out.println("Preparing cutlet");
    }
}

class Cook {
   private CookingInterface cookingInterface;

    public void setCooking(CookingInterface cookingInterface) {
        this.cookingInterface = cookingInterface;
    }

    void cooking(){
      cookingInterface.cooking();
    }
}
