package com.company;

import java.lang.*;

sealed class Human permits Manish, Vartika, Anjali {
    public void printName() {
        System.out.println("Default");
    }
}

non-sealed class Manish extends Human {
    public void printName() {
        System.out.println("Manish Sharma");
    }
}

sealed class Vartika extends Human {
    public void printName() {
        System.out.println("Vartika Dadheech");
    }
}

final class Anjali extends Human {
    public void printName() {
        System.out.println("Anjali Sharma");
    }
}

non-sealed class VartikChild extends Vartika {
    public void printName() {
        System.out.println("Vartika Dadheech");
    }
}

public class SealedExample {
    public static void main(String[] args) {
        Human h1 = new Anjali();
        Human h2 = new Vartika();
        Human h3 = new Manish();
        Human h4 = new VartikChild();

        h1.printName();
        h2.printName();
        h3.printName();
        h4.printName();
    }

}
