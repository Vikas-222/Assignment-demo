package com.company;

public class StringExample {

    static void join(String str) {
        System.out.println(str += str);
    }


    public static void main(String[] args) {
        System.out.println("---------------String--------------------");
        String string = "Hello";                            //store in String pool in heap memory
        System.out.println("Original String " + string);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 80; i++) {
            string += i;
        }
        System.out.println("concat string " + string);
        long end = System.currentTimeMillis();

        System.out.println("time taken by string to concat : " + (end - start) + "ms");

        String s = new String("   Hello    ");        //store in heap memory with new memory allocated
        System.out.println(s+" from new keyword");
        System.out.println("Trim method remove extra spaces from start and end:"+ s.trim());
        System.out.println(" ");


//        StringBuffer methods
        System.out.println("---------------StringBuffer--------------------");
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Initial String of StringBuffer :" + stringBuffer);

        start = System.currentTimeMillis();
        for (int i = 0; i < 80; i++) {
            stringBuffer.append(i);                       //0-20 append to stringbuffer
        }
        System.out.println("String buffer after append " + stringBuffer);

        end = System.currentTimeMillis();

        System.out.println("time taken by StringBuffer to concat : " + (end - start) + "ms");

        System.out.println("capacity " + stringBuffer.capacity());       //capacity = number of characters in stringbuffer
        System.out.println("");


        System.out.println("---------------StringBuilder--------------------");
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("Initial String of StringBuilder :" + stringBuilder);

        start = System.currentTimeMillis();
        for (int i = 0; i < 80; i++) {
            stringBuilder.append(i);                       //0-20 append to stringbuffer
        }
        System.out.println("StringBuilder after append " + stringBuilder);

        end = System.currentTimeMillis();

        System.out.println("time taken by StringBuilder to concat : " + (end - start) + "ms");
        System.out.println(" ");

        System.out.println("capacity :" + stringBuilder.capacity());

        System.out.println("delete method :" + stringBuilder.delete(5, 160));

        System.out.println(stringBuilder.insert(4, "World"));

        char[] charArray = new char[]{'a','b','c'};
        stringBuilder.append(charArray);            //overload append method

        System.out.println("character array concat to stringBuilder :"+stringBuilder);

        stringBuilder.reverse();
        System.out.println("Reverse stringbuilder :"+stringBuilder);



    }

}
