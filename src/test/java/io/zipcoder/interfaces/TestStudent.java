package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(1984, "Larry");
        //When

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(1984, "Larry");
        //When

        //Then
        Assert.assertTrue((student instanceof Person));
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(1984, "Larry");
        //When
        student.learn(50);
        double expected = 50;
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0.1);
    }
}
