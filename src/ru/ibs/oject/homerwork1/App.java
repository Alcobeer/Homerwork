// Работа выполнена Пастуховым Матвеем из города Нижний Новгород

package ru.ibs.oject.homerwork1;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] string){
        Developer ivan = new Developer("Игра",25,3,true);
        ivan.setName("Иван");
        ivan.setAge(25);
        ivan.setSalary(60000);
        Developer hristian= new Developer("Механника прыжков через себя",25,4,true);
        hristian.setName("Христиан");
        hristian.setSalary(70000);
        Intern matvey=new Intern("Матвей","Иван", 22, 35000,2.5f);
        Intern oleg = new Intern("Олег", "Иван",20,40000,0.7f);
        Intern ignat = new Intern ("Игнат","Христиан",19,35000,0.3f);
        Intern ann= new Intern("Аня","Христиан", 23, 34500,0.1f);
        TeamLeader kolia=new TeamLeader("Коля", 10,5,35,120000);
        TeamLeader kostia=new TeamLeader("Костя",15,3,37,120000);

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
//      Попытаться заполнить это автоматически

        employees.add(matvey);
        employees.add(kolia);
        employees.add(hristian);
        employees.add(ann);
        employees.add(oleg);
        employees.add(ignat);
        employees.add(kostia);
        employees.add(ivan);


//        System.out.println(employees);
//        for(Employee e : employees){
//            System.out.println(e.getClass());
//            System.out.println(e.getName());
//            System.out.println(e.getAge());
//            System.out.println(e.getSalary());
//        }


        //ArrayList<Employee> employeeArrayList = new ArrayList<>(employees);
        List<Employee> employeeArrayList=new ArrayList<>(employees);

//        System.out.println(employeeArrayList.get(2).getName());
//        System.out.println(employeeArrayList.get(3).getName());


//        System.out.println(employeeArrayList.get(1).getName());
//        for (Employee employee : employeeArrayList) {
//
//            System.out.println(employee.getClass());
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//            System.out.println(employee.getSalary());
//        }



//------------задание 2-----------------
        List<Employee> filterSalary=employeeArrayList
                .stream()
                .filter(n->n.getAge()>25)
                // от сортировки можно избавиться, но раз уж написал, то пусть будет
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        filterSalary.forEach(System.out::println);


        ///--------Задание 3-----------------
        List<String> filterName=employeeArrayList
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        filterName.forEach(System.out::println);



//----------------------второе дз про анонимный класс---------------------
        //--- экзэмпляр анонимного класса сотрудник Егорка
        var egorka = new Employee() {
            private String dolznost= "Уборщик";
            private int prise;
            private int countTimeInWeek;


            //-------гетеры и сетеры-----------
            public String getDolznost() {
                return dolznost;
            }

            public void setDolznost(String dolznost) {
                this.dolznost = dolznost;
            }

            public int getPrise() {
                return prise;
            }

            public void setPrise(int prise) {
                this.prise = prise;
            }

            public int getCountTimeInWeek() {
                return countTimeInWeek;
            }

            public void setCountTimeInWeek(int countTimeInWeek) {
                this.countTimeInWeek = countTimeInWeek;
            }
            //-----собственные методы----------
            public void сleaning(){
                System.out.println("Cleaning successful");
            }
            public int salary(){
                int day= this.countTimeInWeek;
                int pay=this.prise;
               return   day * pay;
            }
        };
        egorka.setName("Егорка");
        egorka.setDolznost("Уборщик");
        egorka.setPrise(1200);
        egorka.setCountTimeInWeek(3);
        egorka.сleaning();
        System.out.println("Нужно заплатить "+ egorka.getName() +
                " за работу  в должности "+ egorka.getDolznost() +
                " его зарплату = " +egorka.salary()  );


    }
}
