package DZOOP3;

public abstract class Employee implements Comparable<Employee>{

    protected String name;

    protected String surName;

    protected double salary;

    public abstract double calculateSalary();

    public abstract int getAge();

    public Employee(String surName,String name, double salary){
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }
    
    @Override
    public int compareTo(Employee o){
        
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

}
