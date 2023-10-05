package DZOOP3;

public class Worker extends Employee {

    private int age;
    
    public Worker(String surName,String name, double salary, int age){
        super(surName,name,salary);
        this.age = age;
        
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%s %s; Рабочий; Среднемесячная зарплата: %2f (руб.)",
        surName, name, calculateSalary());

    }
}
