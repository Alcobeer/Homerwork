package ru.ibs.oject.homerwork1;

public class Developer extends Employee{
    private String project;
    private int experienceInSfera;
    private boolean statusProject;


    public Developer(String project, int age, int experienceInSfera, boolean statusProject) {
        this.project = project;
        this.experienceInSfera = experienceInSfera;
        this.statusProject = statusProject;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getExperienceInSfera() {
        return experienceInSfera;
    }

    public void setExperienceInSfera(int experienceInSfera) {
        this.experienceInSfera = experienceInSfera;
    }

    public boolean isStatusProject() {
        return statusProject;
    }

    public void setStatusProject(boolean statusProject) {
        this.statusProject = statusProject;
    }

    //Методы класса


    public String performance(String name,String project,boolean statusProject){
    String performance = this.getSentence()  + name ;
    if(statusProject) {
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
        System.out.println(welcome);
        System.out.println(" это сообщение выведено в классе прогер");
    }


    // перегрузка метода welcome
    public void welcome(String name, int age){
        System.out.println("Hello, you name is "+ name+ " .You is "+ age+" old.");
    }


}
