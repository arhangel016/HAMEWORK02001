package com.company;

public class Mother extends  Grandmother{
    private int money ;
    private String animal ;

    public Mother(Info info, int age, String name, EList list, int money, String animal) {
        super(info, age, name, list);
        this.money = money;
        this.animal = animal;
    }

    public int getMoney() {
        return money;
    }

    public String getAnimal() {
        return animal;
    }

    public final void getTop(String title , EList list , int salary){
        System.out.println(getName() + " work to the -   " + title + "\nprevious phone  - " + list + "\nSalary is - " + salary);
    }
    public void getTop(EList list){
        System.out.println("previous phone  - " + list);
    }
    public void getTop(){
        System.out.println("Name - " + getName() + "\nage - " + getAge() + "\nPhone - " + getList() + "\njob - " + getInfo().getJob() + "\nhouse - " + getInfo().getTitleHouse() + "\nmoney - "+ getMoney() + "\nAnimal - " + getAnimal() );
    }
}

