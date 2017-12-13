package ru.itis;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String model = reader.nextLine();
        int power = reader.nextInt();
        String color = reader.nextLine();
        String number = reader.nextLine();
        int ride = reader.nextInt();
        int mileage = 0;

        Auto car = new Auto(model, power, color, number, mileage);
        car.setModel(model);
        car.setPower(power);
        car.setColor(color);
        car.setNumber(number);

        car.getModel(model);
        car.getPower(power);
        car.getColor(color);
        car.getNumber(number);
        car.bigRide(ride);

        System.out.println("Your car model is " + car.model);
        System.out.println("Your car power is " + car.power + "h.p.");
        System.out.println("Your car color is " + car.color);
        System.out.println("Your car number is " + car.number);
        System.out.println("Your car has driven " + car.mileage + "km");
    }
}
