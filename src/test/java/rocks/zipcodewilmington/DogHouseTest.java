package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        DogHouse.getNumberOfDogs();

        Integer actualNumOfDog = DogHouse.getNumberOfDogs();
        Integer expectedNumOfDog = 1;
        Assert.assertEquals(expectedNumOfDog,actualNumOfDog);
    }


    @Test
    public void testAddDog(){
        DogHouse.clear();
        Date birthDate = new Date();

        String name = "Milo";
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        String name2 = "Ammy";
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        Integer expectedNumOfDog = 2;
        int idOfFirstDog = animal.getId();
        int idOfSecondDog = animal2.getId();
        Assert.assertEquals(expectedNumOfDog, DogHouse.getNumberOfDogs());
        Assert.assertEquals(animal, DogHouse.getDogById(idOfFirstDog));
        Assert.assertEquals(animal2, DogHouse.getDogById(idOfSecondDog));

    }

    @Test
    public void testRemoveByDog(){
        Date birthDate = new Date();
        DogHouse.clear();

        String name = "Ume";
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        String name2 = "Ammy";
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Hayabusa";
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        Integer idOfTheDog = animal2.getId();
        DogHouse.remove(animal2);
        Integer expectedNumOfDog = 2 ;

        Assert.assertEquals(expectedNumOfDog, DogHouse.getNumberOfDogs());
        Assert.assertNull(DogHouse.getDogById(idOfTheDog));
    }

    @Test
    public void testRemoveById(){
        Date birthDate = new Date();
        DogHouse.clear();

        String name = "Milo";
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        String name2 = "Max";
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Fido";
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        Integer idOfTheDog = animal2.getId();
        DogHouse.remove(idOfTheDog);
        Integer expectedNumOfDog = 2 ;

        Assert.assertEquals(expectedNumOfDog, DogHouse.getNumberOfDogs());
        Assert.assertNull(DogHouse.getDogById(idOfTheDog));
    }

    @Test
    public void testGetDogByID(){
        Date birthDate = new Date();
        DogHouse.clear();

        String name = "Milo";
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        String name2 = "Max";
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Fido";
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        Assert.assertEquals(animal2, DogHouse.getDogById(animal2.getId()));

    }


}
