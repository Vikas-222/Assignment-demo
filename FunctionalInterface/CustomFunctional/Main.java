package com.company.CustomFunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(1,"Vikas");
        Person p2 = new Person(2,"Arpan");
        Person p3 = new Person(3,"Krushit");
        Person p4 = new Person(4,"Vinay");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Function<List<Person>,List<Person>> f1 = p -> p;        //returns all persons details
        System.out.println(f1.apply(list));

        Function<Integer,Person> f2 = (n) -> list.get(n);       //returns one person details
        System.out.println(f2.apply(2));

        Predicate<List<Person>> predicate1 = l -> l.isEmpty();
        System.out.println("List is empty :"+ predicate1.test(list));
        if(predicate1.test(list) == true){
            System.out.println("List is empty");
        }else{
            System.out.println("if List is empty then print :"+list);
        }

        System.out.println("Previous list :"+list);
        Consumer<Integer> c1 = n -> {if(n%2 == 0){
            list.get(n).setName("User");
            System.out.println("Name changed to User :"+list.get(n));
        }
        else{
            System.out.println("Odd records");
        }
        };

        c1.accept(2);
//        c1.accept(3);

        Supplier<List<Person>> supplier = () -> list;

        System.out.println("Supplier's get method :"+supplier.get());
    }
}
