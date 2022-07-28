package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(new Instructor(201, "Kris")),
    KAREN(new Instructor(202, "Karen")),
    DOLIO(new Instructor(203, "Dolio"))
    ;

    final Instructor instructor;
    double timeWorked;
    Educator(Instructor instructor){
        this.instructor = instructor;
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
