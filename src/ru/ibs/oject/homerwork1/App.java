// Работа выполнена Пастуховым Матвеем из города Нижний Новгород

package ru.ibs.oject.homerwork1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] string){
        Developer ivan = new Developer("Игра",25,3,true);
        ivan.setName("Иван");
        ivan.setAge(25);
        ivan.setSalary(60000);
        Intern matvey=new Intern("Матвей","Иван", 22, 35000,2.5f);
        TeamLeader kolia=new TeamLeader("Коля", 10,5,35,12000);
        ivan.setAge(30);
//        System.out.println(ivan.getAge());
//        System.out.println(ivan.getName());
//        ivan.performance("Иван","Игра", true);
//
//        ivan.welcome("Иван");
//        matvey.welcome("Матвей");
//        kolia.welcome("Коля");

       // HashSet<Employee> employees= new HashSet<>();
        Set<Employee> employees= new HashSet<>();
        employees.add(ivan);
        employees.add(matvey);
        employees.add(kolia);
        System.out.println(employees);
        for(Employee e : employees){
            System.out.println(e.getClass());
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println(e.getSalary());
        }


        //ArrayList<Employee> employeeArrayList = new ArrayList<>(employees);
        List<Employee> employeeArrayList=new ArrayList<>(employees);

        System.out.println(employeeArrayList.get(0));
        System.out.println(employeeArrayList.get(1));


        System.out.println(employeeArrayList.get(1).getName());
        for (Employee employee : employeeArrayList) {

            System.out.println(employee.getClass());
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            System.out.println(employee.getSalary());
        }






    }
}
