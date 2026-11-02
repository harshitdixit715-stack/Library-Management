package com.gla;

public class Student extends Person {
    private Branch branch;
    public Student(int id , String name, Branch branch,String department,Category category){
        super(id,name,department,category);
        this.branch  = branch;
    }
}
