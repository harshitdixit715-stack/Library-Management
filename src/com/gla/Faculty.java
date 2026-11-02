package com.gla;

public class Faculty extends Person {
    private String department;
    public Faculty(int id, String name,String department,Category category){
        super(id,name,department,category);
        this.department = department;
    }
}
