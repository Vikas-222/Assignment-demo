package com.company;

public class StringExample {

    static void join(String str){
        System.out.println(str += str);
    }


    public static void main(String[] args) {
        String str1 = "Hello";

        System.out.print("concat string :");
        join(str1);

        //concatenation does not change original string
        System.out.println("Original string does not changed: "+str1);


//        StringBuffer methods
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("String buffer before concat :"+stringBuffer);

        stringBuffer.append(" World");

        System.out.println("capacity "+ stringBuffer.capacity());

        System.out.println("String buffer after concat :"+stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("String builder before concat :"+stringBuffer);


//        StringBuilder methods
        stringBuilder.append(100.101);

        System.out.println("String builder after concat :"+stringBuilder);

        System.out.println("capacity :"+stringBuilder.capacity());

        System.out.println("delete method :"+stringBuilder.delete(2,5));

        System.out.println(stringBuilder.insert(2,"llo"));

    }

}
