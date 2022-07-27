package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testSingleton(){
        //Given
        Instructors instance = Instructors.getInstance();
        //When
        int actual = instance.count();
        int expected = 3;
        //Then
        Assert.assertEquals(expected, actual);
    }
}
