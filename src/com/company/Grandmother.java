package com.company;

public class Grandmother {
    private Info inf;
    private int age;
    private String name;
    private EList list;

    public Grandmother(Info info, int age, String name, EList list) {
        inf = info;
        this.age = age;
        this.name = name;
        this.list = list;
    }



    public Info getInfo() {
        return inf;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public EList getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Grandmother{" +
                "inf=" + inf +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
