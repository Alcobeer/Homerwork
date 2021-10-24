package ru.ibs.oject.homerwork1;

public class TeamLeader extends Employee implements Manager{
    private int experienceInSfera;
    private int countOfProgeckt;


    public TeamLeader(String name,int experienceInSfera, int countOfProgeckt) {
        this.experienceInSfera = experienceInSfera;
        this.countOfProgeckt = countOfProgeckt;
    }

    public int getCountOfProgeckt() {
        return countOfProgeckt;
    }

    public void setCountOfProgeckt(int countOfProgeckt) {
        this.countOfProgeckt = countOfProgeckt;
    }

    public int getExperienceInSfera() {
        return experienceInSfera;
    }

    public void setExperienceInSfera(int experienceInSfera) {
        this.experienceInSfera = experienceInSfera;
    }

    public void cool(int exp){
        System.out.println("You are cool , you TeamLeader "+ exp+ "year");
    }
    @Override
    public void plan( int plan){
        System.out.println("План на месяц : plan");
    }
    @Override
    public void welcome (String name){
        System.out.println("Welcome, dear " + name);
        System.out.println("Это сообщение выведено в классе  тимлида");
    }

}
