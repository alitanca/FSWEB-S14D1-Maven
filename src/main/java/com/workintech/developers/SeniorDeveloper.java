package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 4000);
        System.out.println("com.workintech.developers.SeniorDeveloper is designing systems. New salary: " + getSalary());
    }
}
