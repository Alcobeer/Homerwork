package ru.ibs.oject.homerwork1;

public class Intern extends Employee{
    private String nameOfTheSupervisingDeveloper;
    private float experienceInSfera;

    public Intern(String name, String nameOfTheSupervisingDeveloper, int age, float experienceInSfera) {

        this.nameOfTheSupervisingDeveloper = nameOfTheSupervisingDeveloper;
        this.experienceInSfera = experienceInSfera;
    }


    public String getNameOfTheSupervisingDeveloper() {
        return nameOfTheSupervisingDeveloper;
    }

    public void setNameOfTheSupervisingDeveloper(String nameOfTheSupervisingDeveloper) {
        this.nameOfTheSupervisingDeveloper = nameOfTheSupervisingDeveloper;
    }

    public float getExperienceInSfera() {
        return experienceInSfera;
    }

    public void setExperienceInSfera(float experienceInSfera) {
        this.experienceInSfera = experienceInSfera;
    }

    public void careaUp(float exp){
        if(exp>1)
            System.out.println("Congratulations you are being promoted");
        else
            System.out.println("Wait 1 year, pleasure");
    }
    @Override
    public void welcome (String name){
        System.out.println("Welcome, dear " + name);
        System.out.println("Это сообщение выведено в классе  стажёр");
    }
}
