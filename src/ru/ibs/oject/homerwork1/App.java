// Работа выполнена Пастуховым Матвеем из города Нижний Новгород

package ru.ibs.oject.homerwork1;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] string){
        Developer Ivan = new Developer("Игра",25,3,true);
        Ivan.setName("Иван");
        Ivan.setAge(25);
        Ivan.setSalary(60000);
        Intern Matvey=new Intern("Матвей","Иван", 22, 35000,2.5f);
        TeamLeader Kolia=new TeamLeader("Коля", 10,5,35,12000);
        Ivan.setAge(30);
//        System.out.println(Ivan.getAge());
//        System.out.println(Ivan.getName());
//        Ivan.performance("Иван","Игра", true);
//
//        Ivan.welcome("Иван");
//        Matvey.welcome("Матвей");
//        Kolia.welcome("Коля");

        HashSet<Employee> employees= new HashSet<Employee>();
        employees.add(Ivan);
        employees.add(Matvey);
        employees.add(Kolia);
        System.out.println(employees);
        for(Employee e : employees){
            System.out.println(e.getClass());
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println(e.getSalary());
        }


        ArrayList<Employee> employeeArrayList=new ArrayList<Employee>();
        for(Employee e : employees){
            employeeArrayList.add(e);
        }
        System.out.println(employeeArrayList.get(0));
        System.out.println(employeeArrayList.get(1));


        System.out.println(employeeArrayList.get(1).getName());
        for(int e=0;e<employeeArrayList.size() ; e++ ){

            System.out.println(employeeArrayList.get(e).getClass());
            System.out.println(employeeArrayList.get(e).getName());
            System.out.println(employeeArrayList.get(e).getAge());
            System.out.println(employeeArrayList.get(e).getSalary());
        }






    }
}
