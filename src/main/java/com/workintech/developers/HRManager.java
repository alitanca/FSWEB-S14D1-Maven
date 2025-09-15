package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[0];
    private MidDeveloper[] midDevelopers = new MidDeveloper[0];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[0];

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 1500);
        System.out.println("HRManager is managing hiring. New salary: " + getSalary());
    }


    public void addEmployee(JuniorDeveloper dev) {
        addAtFirstEmptySlot(dev);
    }
    public void addEmployee(MidDeveloper dev) {
        addAtFirstEmptySlot(dev);
    }
    public void addEmployee(SeniorDeveloper dev) {
        addAtFirstEmptySlot(dev);
    }


    public void addEmployee(JuniorDeveloper dev, int index) {
        juniorDevelopers = ensureCapacity(juniorDevelopers, index);
        if (juniorDevelopers[index] != null) {
            System.out.println("Warning: Junior slot " + index + " is occupied. Not overwriting.");
            return;
        }
        juniorDevelopers[index] = dev;
    }

    public void addEmployee(MidDeveloper dev, int index) {
        midDevelopers = ensureCapacity(midDevelopers, index);
        if (midDevelopers[index] != null) {
            System.out.println("Warning: Mid slot " + index + " is occupied. Not overwriting.");
            return;
        }
        midDevelopers[index] = dev;
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        seniorDevelopers = ensureCapacity(seniorDevelopers, index);
        if (seniorDevelopers[index] != null) {
            System.out.println("Warning: Senior slot " + index + " is occupied. Not overwriting.");
            return;
        }
        seniorDevelopers[index] = dev;
    }


    private void addAtFirstEmptySlot(JuniorDeveloper dev) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = dev;
                return;
            }
        }
        juniorDevelopers = Arrays.copyOf(juniorDevelopers, juniorDevelopers.length + 1);
        juniorDevelopers[juniorDevelopers.length - 1] = dev;
    }

    private void addAtFirstEmptySlot(MidDeveloper dev) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = dev;
                return;
            }
        }
        midDevelopers = Arrays.copyOf(midDevelopers, midDevelopers.length + 1);
        midDevelopers[midDevelopers.length - 1] = dev;
    }

    private void addAtFirstEmptySlot(SeniorDeveloper dev) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = dev;
                return;
            }
        }
        seniorDevelopers = Arrays.copyOf(seniorDevelopers, seniorDevelopers.length + 1);
        seniorDevelopers[seniorDevelopers.length - 1] = dev;
    }

    private <T> T[] ensureCapacity(T[] arr, int index) {
        if (index < 0) {
            System.out.println("Warning: Negative index not allowed.");
            return arr;
        }
        if (index < arr.length) return arr;
        return Arrays.copyOf(arr, index + 1);
    }


    public JuniorDeveloper[] getJuniorDevelopers() { return juniorDevelopers; }
    public MidDeveloper[] getMidDevelopers() { return midDevelopers; }
    public SeniorDeveloper[] getSeniorDevelopers() { return seniorDevelopers; }
}
