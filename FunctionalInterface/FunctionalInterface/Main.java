package com.company.FunctionalInterface;

public class Main{


    //Before Anonymous class and Lambda expressions this is how we used
//    @Override
//    public void EvenOdd(int n) {
//        if(n%2 == 0){
//            System.out.println(n +" is Even number");
//        }
//        else{
//            System.out.println(n +" is Odd number");
//        }
//    }



    public static void main(String[] args) {

        //Using anonymous class
        NumberProcess num1 = new NumberProcess() {
            @Override
            public void EvenOdd(int n) {
                if (n % 2 == 0) {
                    System.out.println(n + " is even");
                } else {
                    System.out.println(n + " is odd");
                }
            }
        };
        num1.EvenOdd(23);
        num1.method1();
        NumberProcess.method2();


        //Using Lambda expression and anonymous class
        NumberProcess num2 = (int n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };
        num2.EvenOdd(26);
        num2.method1();
        NumberProcess.method2();


        //if we don't use Lambda expression or Anonymous class
//        Main m1 = new Main();
//        m1.EvenOdd(23);
//        m1.method1();
//        NumberProcess.method2();

    }
}
