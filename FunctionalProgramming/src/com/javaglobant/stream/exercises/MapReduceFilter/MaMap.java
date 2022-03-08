package com.javaglobant.stream.exercises.MapReduceFilter;

import com.javaglobant.stream.exercises.MapReduceFilter.Model.City;
import com.javaglobant.stream.exercises.MapReduceFilter.Model.Person;

import java.util.List;

public class MaMap {
    public static void main(String[] args) {
        Person pe01 = new Person("Jose", (byte) 21);
        Person pe02 = new Person("Alisson", (byte) 16);
        Person pe03 = new Person("Luis", (byte) 23);
        Person pe04 = new Person("Englis", (byte) 19);
        Person pe05 = new Person("Alice", (byte) 20);
        Person pe06 = new Person("Edy", (byte) 2);

        List<Person> people = List.of(pe01,pe02,pe03,pe04,pe05);
        long count = people.stream()
                .map(person -> person.getAge())
                .filter(aByte -> aByte > 19)
                .count();

        System.out.println(count);

        City newYork = new City("New York", pe01, pe02);
        City london = new City("London", pe03, pe05);
        City santaMarta = new City("Santa Marta", pe04, pe06);

        List<City> cities = List.of(newYork, london, santaMarta);

        long objectStream =
                cities
                    .stream()
                    .flatMap(city -> city.getPeople().stream())
                    .count();

        System.out.println(objectStream);

        cities
            .stream()
            .flatMap(city -> city.getPeople().stream())
            .map(person -> person.getName())
            .forEach(person -> System.out.println(person));


    }
}
