package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    People people = new People();
    Person person0 = new Person(15, "Larry");
    Person person1 = new Person(16, "Patty");
    Person person2 = new Person(17, "Ryan");

    @Test
    public void testAdd(){
        //Given
        people.add(person0);
        //When
        Person expected = person0;
        Person actual = people.findById(15);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        //Given
        people.add(person0);
        people.add(person1);
        people.add(person2);
        //When
        Assert.assertEquals(3, people.count());
        people.remove(person2);
        //Then
        Assert.assertFalse(people.contains(person2));
    }

    @Test
    public void testRemoveById(){
        //Given
        people.add(person0);
        people.add(person1);
        people.add(person2);
        //When
        Assert.assertEquals(3, people.count());
        people.remove(17);
        //Then
        Assert.assertFalse(people.contains(person2));
    }

    @Test
    public void testRemoveAll(){
        //Given
        people.add(person0);
        people.add(person1);
        people.add(person2);
        //When
        Assert.assertEquals(3, people.count());
        people.removeAll();
        //Then
        Assert.assertEquals(0, people.count());
    }

    @Test
    public void testFindById(){
        //Given
        people.add(person0);
        people.add(person1);
        people.add(person2);
        //When
        Assert.assertEquals(3, people.count());
        //Then
        Assert.assertEquals(person2, people.findById(17));
    }

    @Test
    public void testToArray(){
        people.add(person0);
        people.add(person1);
        people.add(person2);
        //When
        Person[] expectedArray = {person0, person1, person2};
        //Then
        Assert.assertArrayEquals(expectedArray, people.toArray());
    }
}
