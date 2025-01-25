package com.company.Records;

public record RecordExample(String name,int rollno) {

//    Record constructor behaviour is different from the constructors in normal classes.
//    By default records have an all arguments constructor which is called canonical constructor.
//    it is created by compiler if we don't create it then



//    In fact the compact constructor isn’t an additional constructor, rather its container that contains
//    some code for validations / handle the defensive copies of mutable objects and is being injected to the normal canonical constructor.
//    This compact constructor doesn’t initialise the values.
    public RecordExample{
        if(name == ""){
            name = "Vikas";
        }
        if(rollno == 0){
            rollno = 1;
        }
    }

    public static void main(String[] args) {
        RecordExample record1 = new RecordExample("",2);
        System.out.println("Name is :"+record1.name());
        System.out.println("Roll no is :"+record1.rollno());

        RecordExample record2 = new RecordExample("Arpan",0);
        System.out.println("Name is :"+record2.name());
        System.out.println("Roll no is :"+record2.rollno());
    }
}
