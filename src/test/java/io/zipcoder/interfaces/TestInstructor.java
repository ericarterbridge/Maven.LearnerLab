package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(44, "Pam");
        //When

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(44, "Pam");
        //When

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //Given
        Student student = new Student(15, "Mark");
        Instructor instructor = new Instructor(44, "Pam");
        //When
        instructor.teach(student, 45);
        double expected = 45;
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testLecture(){
        //Given
        Student student0 = new Student(00, "Larry");
        Student student1 = new Student(01, "Mo");
        Student student2 = new Student(02, "Curly");
        Instructor instructor = new Instructor(99, "Jim");
        //When
        Student[] students = {student0, student1, student2};
        instructor.lecture(students, 99);
        double expected = 33;
        double actual = student0.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0.1);
    }
}
