package ru.ibs.oject.homerwork1;

public class Developer extends Employee{
    String name;
    String project;
    int age;
    int experience;
    boolean status_project;

    public Developer(String name) {
        this.name = name;
    }


    public Developer(String name, String project, int age, int experience, boolean status_project) {
        this.name = name;
        this.project = project;
        this.age = age;
        this.experience = experience;
        this.status_project = status_project;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isStatus_project() {
        return status_project;
    }

    public void setStatus_project(boolean status_project) {
        this.status_project = status_project;
    }

    //Методы класса


    public String performance(String name,String project,boolean status_project){
    String performance = this.getSentence()  + name ;
    if(status_project) {
        String performance_up = this.getInf() + project;
        System.out.println(performance +performance_up);
    }else
        System.out.println(performance);
     return performance;
}
    private String getSentence() {
        return "Hello world! My name is ";
    }
    private String getInf() {
        return " I'm work on  ";
    }
    @Override
    public void welcome(String name){
        String welcome = this.getSentence() + name;
        System.out.println(welcome+ "это класс прогер");
    }


    // перегрузка метода welcome
    public void welcome(String name, int age){
        System.out.println("Hello, you name is "+ name+ " .You is "+ age+" old.");
    }

}