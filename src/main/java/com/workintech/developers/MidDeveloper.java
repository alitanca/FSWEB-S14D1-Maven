package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 2000);
        System.out.println("MidDeveloper is implementing features. New salary: " + getSalary());
    }
}
