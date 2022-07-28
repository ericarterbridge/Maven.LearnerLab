package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    public static final Students INSTANCE = new Students();

    private Students(){
        this.add(new Student(101, "JD"));
        this.add(new Student(102, "Todd"));
        this.add(new Student(103, "Octavia"));
        this.add(new Student(104, "Thina"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}
