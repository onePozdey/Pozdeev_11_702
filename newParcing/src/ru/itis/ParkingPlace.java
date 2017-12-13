package ru.itis;

import java.time.LocalTime;

public class ParkingPlace {
    private int num;
    private int count = 0;
    private Cars[] autos = new Cars[10];
    private LocalTime beginTime = LocalTime.parse("07:00:00");
    private LocalTime finishTime = LocalTime.parse("23:30:00");

    public Cars[] getCars(){
        return autos;
    }
    public ParkingPlace(int num){
        this.num = num;
    }

    void putCar(Cars car){
        for (int i = 0; i < autos.length; i++){
            if (autos[i] == null){
                autos[i] = car;
                break;
            }
        }
        count++;

    }

    public void letIn(Cars car) {
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            if (count <= autos.length - 1) {
                putCar(car);
            } else {
                Cars[] newCars = new Cars[autos.length * 2];
                for (int i = 0; i < autos.length; i++) {
                    newCars[i] = autos[i];
                }
                autos = null;//Лишнее?
                autos = newCars;
                putCar(car);
            }

            System.out.println(car + " drove in");
        } else {
            System.out.println("Parking doesn't work");
        }
    }

    public void letOut(Cars car) {
        boolean carWasHere = false;
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            for (int i = 0; i < autos.length; i++){
                if (car.equals(autos[i])){
                    autos[i] = null;
                    count--;
                    System.out.println(car + " drove out");
                    carWasHere = true;
                    break;
                }

            }
            if (!carWasHere){
                System.out.println(car + " is not in " + this);

            }

        } else {
            System.out.println("Parking doesn't work");

        }
    }
    @Override
    public String toString() {
        return "Parking №" + num;
    }
}
