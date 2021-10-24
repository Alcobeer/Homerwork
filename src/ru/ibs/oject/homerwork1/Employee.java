package ru.ibs.oject.homerwork1;

public abstract class Employee {
    private int idEmployee;
    private String name;
    private int salary;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     public void welcome (String name){
         System.out.println("Welcome, dear" + name);
     }
}
