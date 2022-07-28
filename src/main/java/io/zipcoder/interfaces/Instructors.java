package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    public static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        this.add(new Instructor(201, "Kris"));
        this.add(new Instructor(202, "Karen"));
        this.add(new Instructor(203, "Dolio"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }
}
