package com.company.GenericExample;

public class GenericDemo<T> {

    T value1;
    T value2;

    public GenericDemo(T value1) {
        this.value1 = value1;
    }

    //Constructor overloading
    public GenericDemo(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public static void main(String[] args) {

//        String
        GenericDemo<String> genericDemo1 = new GenericDemo<>("Hello", "World");
        String value1 = genericDemo1.getValue1();
        String value2 = genericDemo1.getValue2();

        System.out.println("String value1 is " + value1 + " and value2 is " + value2);

//        Integer
        GenericDemo<Integer> genericDemo2 = new GenericDemo<>(1);
        Integer value3 = genericDemo2.getValue1();

        System.out.println("Integer value is " + value3);


//        Float
        GenericDemo<Float> genericDemo3 = new GenericDemo<Float>(10.1010f);
        float value4 = genericDemo3.getValue1();

        System.out.println("Float value is " + value4);

//        Double
        GenericDemo<Double> genericDemo4 = new GenericDemo<>(199.999);
        double value5 = genericDemo4.getValue1();

        System.out.println("Integer value is " + value5);

    }
}
