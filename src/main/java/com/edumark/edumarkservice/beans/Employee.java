package com.edumark.edumarkservice.beans;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String name;
    private int id;

    public Employee(int id, String name) {
        super();
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
}
