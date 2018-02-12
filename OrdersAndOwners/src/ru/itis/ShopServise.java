package ru.itis;

import java.util.ArrayList;
import java.util.Objects;

public class ShopServise {

    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> id = new ArrayList<>();
    ArrayList<String> surnames = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<>();
    ArrayList<String> cities = new ArrayList<>();
    ArrayList<Integer> sameCity = new ArrayList<>();

    ArrayList<Integer> orderID = new ArrayList<>();
    ArrayList<Integer> ownerID = new ArrayList<>();
    ArrayList<String> orderName = new ArrayList<>();
    ArrayList<Double> weight = new ArrayList<>();
    ArrayList<Integer> sameWeight = new ArrayList<>();

    public void cityFinder(String needCity) {
        for (int i = 0; i < this.cities.size(); i++) {
            if (this.cities.get(i).equals(needCity)) {
                sameCity.add(i);
            }
        }
        for (int i = 0; i < sameCity.size(); i++) {
            System.out.println(this.names.get(sameCity.get(i)));
        }
    }

    public void weightFinder(Double needWeight) {
        for (int i = 0; i < this.weight.size(); i++) {
            if (this.weight.get(i).equals(needWeight)) {
                sameWeight.add(i);
            }
        }
        for (int i = 0; i < sameWeight.size(); i++) {
            System.out.println(this.orderName.get(sameWeight.get(i)));
        }
    }

    public void theBestOrderer() {
        int max[] = new int[id.size()];
        for (int i = 0; i < max.length; i++) {
            max[i] = 0;
        }
        for (int i = 0; i < this.id.size(); i++) {
            for (int j = 0; j < this.orderID.size(); j++) {
                if (Objects.equals(id.get(i), ownerID.get(j))) max[i]++;
            }
        }
        int maxOreders = 0;
        for (int i = 0; i < max.length; i++) {
            if (maxOreders < max[i]) {
                maxOreders = max[i];
            }
        }
        for (int i = 0; i < max.length; i ++){
            if (max[i] == maxOreders) System.out.println(names.get(i));
        }
    }
}
