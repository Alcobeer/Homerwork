package ru.ibs.oject.homerwork1;

public class Intern extends Employee{
    String name;
    String name_dev;
    int age;
    float experience;

    public Intern(String name, String name_dev, int age, float experience) {
        this.name = name;
        this.name_dev = name_dev;
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

    public String getName_dev() {
        return name_dev;
    }

    public void setName_dev(String name_dev) {
        this.name_dev = name_dev;
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
