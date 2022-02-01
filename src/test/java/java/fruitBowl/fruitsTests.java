package java.fruitBowl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fruitsTests {

    @Test
    public void shouldSegregateApples() {
        

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Bowl mixedFruit= new Bowl();
        mixedFruit.addFruit(apple1,apple2,banana1,banana2,orange1,orange2);

        Bowl bowlOfApples = mixedFruit.getAllApplesBowl();

        Assert.assertEquals(bowlOfApples.getCount(),2);
    }

    @Test
    public void shouldSegregateOranges(){
        //Arrange
        Apple apple1=new Apple();
        Apple apple2=new Apple();
        Orange orange1=new Orange();
        Orange orange2=new Orange();
        Orange orange3=new Orange();
        Banana banana1=new Banana();

        Bowl mixedFruit = new Bowl();
        mixedFruit.addFruit(apple1,apple2,orange1,orange2,orange3,banana1);

        //Act
        Bowl bowlOfOrange=mixedFruit.getAllOrangesBowl();

        //Assert
        Assert.assertEquals(bowlOfOrange.getCount(),3);

    }

    @Test
    public void shouldSegregateBanana(){
        //Arrange
        Apple apple1=new Apple();
        Apple apple2=new Apple();
        Orange orange1=new Orange();
        Orange orange2=new Orange();
        Orange orange3=new Orange();
        Banana banana1=new Banana();

        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addFruit(apple1,apple2,orange1,orange2,orange3,banana1);

        //Act
        Bowl bowlFullOfBanana=mixedFruitBowl.getAllBananasBowl();

        //Assert
        Assert.assertEquals(bowlFullOfBanana.getCount(),1);

    }
}
