package com.gla;

public class Person {
    protected int id;
    protected String name;
    protected String department;
    protected Category category;
    public Person(int id, String name,String department,Category category){
        this.id = id;
        this.name = name;
        this.department = department;
        this.category = category;
    }
}
