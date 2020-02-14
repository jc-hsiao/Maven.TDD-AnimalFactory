package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void createDogTest(){
        String expectedName = "Coffee";
        Date expectedDate = new Date(2016,3,10);
        Integer expectedId = 100;
        Dog myDog = new Dog(expectedName,expectedDate,expectedId);

        Assert.assertEquals(expectedName, myDog.getName());
        Assert.assertEquals(expectedDate, myDog.getBirthDate());
        Assert.assertEquals(expectedId, myDog.getId());
    }

    @Test
    public void dogSpeakTest(){
        String expectedAnswer = "bark!";
        Dog dog = new Dog(null, null, null);
        Assert.assertEquals(expectedAnswer, dog.speak());
    }

    @Test
    public void setDogBdayTest(){
        Dog dog = new Dog(null, null, null);
        Date expectedDate = new Date(2020,1,1);
        dog.setBirthDate(expectedDate);
        Assert.assertEquals(expectedDate, dog.getBirthDate());
    }

    @Test
    public void dogEatTest(){
        Dog dog = new Dog(null, null, null);
        Food someFood = new Food();
        dog.eat(someFood);
        Integer expectedNumOfMeal = 1;
        Assert.assertEquals( expectedNumOfMeal , dog.getNumberOfMealsEaten());
    }

    @Test
    public void getDogIDTest(){
        Integer expectedId = 100;
        Dog dog = new Dog(null, null, expectedId);
        Assert.assertEquals( expectedId,dog.getId());
    }

    @Test
    public void checkAnimalInhertTest(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue( dog instanceof Animal);
    }

    @Test
    public void checkMammalInhertTest(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue( dog instanceof Mammal);

    }

}
