package ru.itis;

public class Auto {
    String number;
    String model;
    String color;
    int power;
    int mileage;

    public Auto(String model, int power, String color, String number, int mileage) {
        setModel(model);
        setPower(power);
        setColor(color);
        setNumber(number);
        this.mileage = mileage;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(String model) {
        return this.model;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber(String number) {
        return this.number;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color) {
        return this.color;
    }

    public void setPower(int power) {
        if(power > 0) {
            this.power = power;
        }
    }
    public int getPower(int power) {
        return this.power;
    }

    void bigRide(int ride) {
        this.mileage += ride;
    }


}
