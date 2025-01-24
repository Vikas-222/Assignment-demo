package com.company.FunctionalInterface;

@FunctionalInterface
public interface NumberProcess {

    void EvenOdd(int n);

    default void method1(){
        System.out.println("default method called");
    }

    static void method2(){
        System.out.println("static method called");
    }

}
