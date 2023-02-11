package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class  Person {
    private  String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        List<Person> employees = new ArrayList<>();
        employees.add(new Person("Gauri", 23));
        employees.add(new Person("Gauri", 33));
        employees.add(new Person("Meli", 45));
        employees.add(new Person("Manoj", 32));


        employees.sort((p1, p2) -> {
            if (p1.getName().equals(p2.getName())) {
                return p1.getAge() - p2.getAge();
            } else {
                return p1.getName().compareTo(p2.getName());
            }
        });

        employees.sort(Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge));

        employees.stream().sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                .collect(Collectors.toList());

    } 
}