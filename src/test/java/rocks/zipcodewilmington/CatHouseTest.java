package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        String name = "Miso";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);
        CatHouse.getNumberOfCats();

        Integer actualNumOfCat = CatHouse.getNumberOfCats();
        Integer expectedNumOfCat = 1;
        Assert.assertEquals(expectedNumOfCat,actualNumOfCat);
    }


    @Test
    public void testAddCat(){
        CatHouse.clear();

        String name = "Miso";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);

        String name2 = "Caramel";
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        Integer expectedNumOfCat = 2;
        Assert.assertEquals(expectedNumOfCat, CatHouse.getNumberOfCats());
    }

    @Test
    public void testRemoveByCat(){
        Date birthDate = new Date();
        CatHouse.clear();

        String name = "Miso";
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);

        String name2 = "Caramel";
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Snowy";
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        Integer idOfTheCat = animal2.getId();
        CatHouse.remove(animal2);
        Integer expectedNumOfCat = 2 ;

        Assert.assertEquals(expectedNumOfCat, CatHouse.getNumberOfCats());
        Assert.assertEquals(null, CatHouse.getCatById(idOfTheCat));
    }

    @Test
    public void testRemoveById(){
        Date birthDate = new Date();
        CatHouse.clear();

        String name = "Miso";
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);

        String name2 = "Caramel";
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Snowy";
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        Integer idOfTheCat = animal2.getId();
        CatHouse.remove(idOfTheCat);
        Integer expectedNumOfCat = 2 ;

        Assert.assertEquals(expectedNumOfCat, CatHouse.getNumberOfCats());
        Assert.assertEquals(null, CatHouse.getCatById(idOfTheCat));
    }

    @Test
    public void testGetCatByID(){
        Date birthDate = new Date();
        CatHouse.clear();

        String name = "Miso";
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);

        String name2 = "Caramel";
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Snowy";
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        Cat expectedAnimal = animal2;
        Assert.assertEquals(expectedAnimal, CatHouse.getCatById(animal2.getId()));

    }


}
