package ru.itis;    // made with the help of Diana Masalimova

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File owners = new File("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\OrdersAndOwners\\owners.txt");
        File orders = new File("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\OrdersAndOwners\\orders.txt");

        Scanner ownerReader = new Scanner(owners);
        Scanner orderReader = new Scanner(orders);
        Scanner scannerCity = new Scanner(System.in);
        Scanner scannerWeight = new Scanner(System.in);

        System.out.println("Enter the city");
        String needCity = scannerCity.next();
        System.out.println("Enter the order's weight");
        Double needWeight = scannerWeight.nextDouble();
        ShopServise shops = new ShopServise();

        while(ownerReader.hasNext()){
            shops.id.add(ownerReader.nextInt());
            shops.surnames.add(ownerReader.next());
            shops.names.add(ownerReader.next());
            shops.ages.add(ownerReader.nextInt());
            shops.cities.add(ownerReader.next());
        }
        while (orderReader.hasNext()){
            shops.orderID.add(orderReader.nextInt());
            shops.ownerID.add(orderReader.nextInt());
            shops.orderName.add(orderReader.next());
            shops.weight.add(orderReader.nextDouble());
        }

        shops.cityFinder(needCity);
        System.out.println("-----");
        shops.weightFinder(needWeight);
        System.out.println("-----");
        shops.theBestOrderer();
    }
}
