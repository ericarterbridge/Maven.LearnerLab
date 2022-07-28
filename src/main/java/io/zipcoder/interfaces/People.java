package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> {

    List<E> personList = new ArrayList<>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(E person : personList){
            if (person.getId() == id){
                return person;
            }
        }return null;
    }

    public boolean contains(Person person){
        for (Person item : personList){
            if (item == person){
                return true;
            }
        }return false;
    }

    public void remove(Person person){
        for (int i = 0; i< personList.size(); i++){
            if (personList.get(i) == person){
                personList.remove(personList.get(i));
            }
        }
    }

    public void remove(long id){
        for (int i = 0; i < personList.size(); i++){
            if (personList.get(i).getId() == id){
                personList.remove(personList.get(i));
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] toArray();


//    @Override
//    public Iterator<E> iterator() {
//        return null;
//    }
}
