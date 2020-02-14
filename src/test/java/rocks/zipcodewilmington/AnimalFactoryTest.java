package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        AnimalFactory af1 = new AnimalFactory();
        String expectedDogName = "Mimi";
        Date expectedBday = new Date();
        Dog newDog = af1.createDog(expectedDogName,expectedBday);
        Assert.assertEquals(expectedDogName,newDog.getName());
        Assert.assertEquals(expectedBday,newDog.getBirthDate());
    }
    public void testCreateCat(){
        AnimalFactory af1 = new AnimalFactory();
        String expectedCatName = "Caramel";
        Date expectedBday = new Date();
        Cat newCat = af1.createCat(expectedCatName,expectedBday);
        Assert.assertEquals(expectedCatName,newCat.getName());
        Assert.assertEquals(expectedBday,newCat.getBirthDate());
    }
}
