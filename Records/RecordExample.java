package com.company.Records;

public record RecordExample(String name,int rollno) {

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
