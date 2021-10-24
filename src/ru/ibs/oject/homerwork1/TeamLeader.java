package ru.ibs.oject.homerwork1;

public class TeamLeader extends Employee implements Manager{
    String name;
    int age;
    int experience;



    public TeamLeader(String name, int age, int experience) {
        this.name = name;
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

    public void cool(int exp){
        System.out.println("You are cool , you TeamLeader "+ exp+ "year");
    }
    @Override
    public void plan( int plan){
        System.out.println("План на месяц : plan");
    }

}
