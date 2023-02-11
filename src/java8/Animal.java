package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Animal {

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//  constructor/getters/setters


    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();

        // add the member of list
        list.add(new Animal(1, "Cat"));
        list.add(new Animal(2, "Dog"));
        list.add(new Animal(3, "Fox"));
       // list.add(new Animal(1, "Lion"));

        Map<Integer, Animal> map = list.stream()
                .collect(Collectors.toMap(Animal::getId, Function.identity()));

        // Handle Duplicate Keys

        Map<Integer, Animal> map3 = list.stream()
                .collect(Collectors.toMap(Animal::getId, Function.identity(),(oldv,newv)->oldv));

        System.out.println(map3);
        //Preserve List Order
        Map<Integer, String> map2 = list.stream()
                .collect(Collectors.toMap(Animal::getId, Animal::getName, (x, y)
                -> x + ", " + y,
                LinkedHashMap::new));

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list3 = Arrays.asList(8, 9, 10,11, 12, 13, 14);

        List<List<Integer>> listList = Arrays.asList(list2, list3);


        List<Integer> collect = list2.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = listList.stream().flatMap(x -> x.stream().filter(y -> y % 2 == 0)).collect(Collectors.toList());

        System.out.println(collect1);
    }

}
