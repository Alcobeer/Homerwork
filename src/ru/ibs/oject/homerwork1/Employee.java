package ru.ibs.oject.homerwork1;

public abstract class Employee {
    int id_employee;
    int salary;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
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
