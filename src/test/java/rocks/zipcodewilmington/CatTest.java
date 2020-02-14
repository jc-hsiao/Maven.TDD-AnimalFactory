package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void createCatTest(){
        String expectedName = "Miso";
        Date expectedDate = new Date();
        Integer expectedId = 120;
        Cat myCat = new Cat(expectedName,expectedDate,expectedId);

        Assert.assertEquals(expectedName, myCat.getName());
        Assert.assertEquals(expectedDate, myCat.getBirthDate());
        Assert.assertEquals(expectedId, myCat.getId());
    }

    @Test
    public void CatSpeakTest(){
        String expectedAnswer = "meow!";
        Cat Cat = new Cat(null, null, null);
        Assert.assertEquals(expectedAnswer, Cat.speak());
    }

    @Test
    public void setCatBdayTest(){
        Cat Cat = new Cat(null, null, null);
        Date expectedDate = new Date();
        Cat.setBirthDate(expectedDate);
        Assert.assertEquals(expectedDate, Cat.getBirthDate());
    }

    @Test
    public void CatEatTest(){
        Cat Cat = new Cat(null, null, null);
        Food someFood = new Food();
        Cat.eat(someFood);
        Integer expectedNumOfMeal = 1;
        Assert.assertEquals( expectedNumOfMeal , Cat.getNumberOfMealsEaten());
    }

    @Test
    public void getCatIDTest(){
        Integer expectedId = 100;
        Cat Cat = new Cat(null, null, expectedId);
        Assert.assertEquals( expectedId,Cat.getId());
    }

    @Test
    public void checkAnimalInhertTest(){
        Cat Cat = new Cat(null, null, null);
        Assert.assertTrue( Cat instanceof Animal);
    }

    @Test
    public void checkMammalInhertTest(){
        Cat Cat = new Cat(null, null, null);
        Assert.assertTrue( Cat instanceof Mammal);

    }
}
