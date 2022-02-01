package java.fruitBowl;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Bowl {

    private Shape shape;
    public List<Fruit> fruits;

    public Bowl() {
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruit... addFruits){
        for (Fruit fruit : addFruits) {
            fruits.add(fruit);
        }

    }
    public Bowl getAllApplesBowl(){

        Bowl bowlOfApples = new Bowl();
        for (Fruit fruit : fruits) {
            if(fruit instanceof Apple)
            {
             bowlOfApples.addFruit(fruit);
            }
        }
        return bowlOfApples;
    }

    public int getCount(){
       return fruits.size();
        }

   public Bowl getAllOrangesBowl(){
       Bowl bowlOfOranges = new Bowl();
       for (Fruit fruit : fruits) {
           if(fruit instanceof Orange)
           {
               bowlOfOranges.addFruit(fruit);
           }
       }
       return bowlOfOranges;
    }
    public Bowl getAllBananasBowl(){
        Bowl bowlOfBananas = new Bowl();
        for (Fruit fruit : fruits) {
            if(fruit instanceof Banana)
            {
                bowlOfBananas.addFruit(fruit);
            }
        }
        return bowlOfBananas;
    }
}
