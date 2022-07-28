package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        //Given
        Instructors instructor = Instructors.getInstance();
        Students student = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        //When
        Teacher teacher = (Teacher) instructor.findById(201);
        Student student1 = (Student) student.findById(101);
        double expected = 10;
        zipCodeWilmington.hostLecture(teacher, 40);
        double actual = student1.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
