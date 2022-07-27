package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Given
        Person person = new Person(1034, "Tony");
        //When
        String expectedName = "Tony";
        long expectedID = 1034;
        String actualName = person.getName();
        long actualID = person.getId();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testSetName(){
        //Given
        Person person = new Person(1984, null);
        //When
        person.setName("Thurston");
        String expectedName = "Thurston";
        //Then
        Assert.assertEquals(expectedName, person.getName());
    }

}
