package day43.task.models;

import day43.task.models.TesterBaseSalary;

public class MiddleTesterSalary extends TesterBaseSalary {
    @Override
    public int getSalary () {
        return  super.getSalary() + 10000;
    }
}

