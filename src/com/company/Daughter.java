package com.company;

 public final class  Daughter extends Mother{
private String nameSchool;
private int countFriends ;

  public Daughter(Info info, int age, String name, EList list, int money, String animal, String nameSchool, int countFriends) {
   super(info, age, name, list, money, animal);
   this.nameSchool = nameSchool;
   this.countFriends = countFriends;
  }

     public String getNameSchool() {
         return nameSchool;
     }

     public int getCountFriends() {
         return countFriends;
     }

     @Override
     public void getTop() {
         super.getTop();
         System.out.println("Name school - " + getNameSchool() + "\nFriends - " + getCountFriends());
     }
 }
