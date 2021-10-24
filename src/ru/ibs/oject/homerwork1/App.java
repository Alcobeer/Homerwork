// Работа выполнена Пастуховым Матвеем из города Нижний Новгород

package ru.ibs.oject.homerwork1;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] string){
        Developer Ivan = new Developer("Иван","Игра",25,3,true);
        Intern Matvey=new Intern("Матвей","Иван", 22, 0.5f);
        TeamLeader Kolia=new TeamLeader("Коля", 32, 10);
        Ivan.setAge(30);
        System.out.println(Ivan.getAge());
        System.out.println(Ivan.getName());
        Ivan.performance("Иван","Игра", true);
        Ivan.welcome("Иван");

        HashSet<Employee> employees= new HashSet<Employee>();
        employees.add(Ivan);
        employees.add(Matvey);
        employees.add(Kolia);
        //можно и так
        //employees.add(new Developer("Боря>","Игра",56,3,true));
        System.out.println(employees);

        ArrayList<HashSet<Employee>> employees_list = new ArrayList<>();
        employees_list.add(employees);
        System.out.println(employees_list);




    }
}
