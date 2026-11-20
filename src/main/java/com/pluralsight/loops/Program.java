package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Bobert","Robert",40));
        peopleList.add(new Person("Milton","Jones",23));
        peopleList.add(new Person("Johnny","Smith",83));
        peopleList.add(new Person("Edward","Kingsley", 62));
        peopleList.add(new Person("Jacob","McIntosh",13));
        peopleList.add(new Person("Eric","Watkins", 34));
        peopleList.add(new Person("Synthia","Jefferies",49));
        peopleList.add(new Person("Monica","Havens",26));
        peopleList.add(new Person("Johnny","Peters",58));
        peopleList.add(new Person("Walter", "Kingsley", 102));
    }
}
