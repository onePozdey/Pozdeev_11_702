package ru.itis;

import java.time.LocalTime;

import static ru.itis.WorkingHours.*;


public class ParkingPlace {


    //TODO create an array for cars
    private Cars[] placeForCar;
    int amount = 0;
    boolean time;

    //TODO realize LocalTime
    /*public static void isRightTime(boolean time, LocalTime beginTime, LocalTime finishTime) {
        if(LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            time = true;
        } else {
            time = false;
        }
    }
    */

    //TODO to host cars
    void  host(Cars car) {
        /*if() {
            this.placeForCar[amount] = car;
            amount++;
            System.out.println("Your car has been parked");
        } else {
            System.err.println("Carpark is not working");
        }*/
        this.placeForCar[amount] = car;
        amount++;
        System.out.println("Your car has been parked");
    }
    //TODO to release cars
    void releasing() {

    }
}
