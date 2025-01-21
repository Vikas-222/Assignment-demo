package com.company.List;

public class Student {

    private String sname;

    public Student(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    @Override
    public String toString() {
        return "sname='" + sname + '\'';
    }


}
