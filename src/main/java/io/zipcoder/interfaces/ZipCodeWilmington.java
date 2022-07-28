package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private Students students;
    private Instructors instructors;

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] learners = students.personList.toArray(new Learner[0]);
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = instructors.findById(id);
        Learner[] learners = students.personList.toArray(new Learner[0]);
        instructor.lecture(learners, numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyTimeMap = new HashMap<>();
        for (Student student : students.personList){
            studyTimeMap.put(student, student.getTotalStudyTime());
        } return studyTimeMap;

    }
}
