package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testSingleton(){
        //Given
        Students instance = Students.getInstance();
        //When
        int actual = instance.count();
        int expected = 4;
        //Then
        Assert.assertEquals(expected, actual);
    }
}
