package day43.task.models;

import day43.task.models.TesterBaseSalary;

public class SeniorTesterSalary extends TesterBaseSalary {
    @Override
    public int getSalary () {
        return  super.getSalary() + 100000;
    }
}