package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Human max = new Human();
        max.name = "Max";
        max.age = 17;
        max.height = 1.69;

        System.out.println(max.name + " " + max.age + " " + max.height);

        max.ЕщеНаГодБлижК_Смерти();
        max.ЕщеНаГодБлижК_Смерти();
        max.ЕщеНаГодБлижК_Смерти();
        max.ЕщеНаГодБлижК_Смерти();
        max.ЕщеНаГодБлижК_Смерти();
        max.ЕщеНаГодБлижК_Смерти();
        max.grow();

        System.out.println(max.name + " " + max.age + " " + max.height);
    }
}
