package com.company;

public class Main {

    public static void main(String[] args) {
        Mother mother = new Mother(new Info("Home", "Doctor"), 30, "Roza", EList.Iphone, 100000, "not");
        Daughter daughter1 = new Daughter(new Info("Home", "Not"), 10, "Kate", EList.Xiaomi, 1000, "dog", "Razakov", 10);
        Daughter daughter2 = new Daughter(new Info("Home", "Not"), 7, "Kate", EList.Samsung, 10, "cat", "Razakov", 0);
            mother.getTop(EList.Huawei);
            mother.getTop();
            mother.getTop("Hospital",EList.Huawei , 70000);
        System.out.println("----------------");
            daughter1.getTop();
        System.out.println("----------------");
        daughter2.getTop();
    }
}
