package ru.ibs.oject.homerwork1;

public class Intern extends Employee{
    String name;
    String nameDev;
    int age;
    float experience;

    public Intern(String name, String nameDev, int age, float experience) {
        this.name = name;
        this.nameDev = nameDev;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getNameDev() {
        return nameDev;
    }

    public void setNameDev(String nameDev) {
        this.nameDev = nameDev;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public void careaUp(float exp){
        if(exp>1)
            System.out.println("Congratulations you are being promoted");
        else
            System.out.println("Wait 1 year, pleasure");
    }
}
