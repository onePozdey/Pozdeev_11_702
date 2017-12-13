package ru.itis;

public class Main {

    public static void main(String[] args) {
            Cars car1 = new Cars(1);
            Cars car2 = new Cars(2);

            ParkingPlace parkingPlace1 = new ParkingPlace(1);
            ParkingPlace parkingPlace2 = new ParkingPlace(2);

            Cars[] carsInParkingPlace1 = parkingPlace1.getCars();

            car1.driveIn(parkingPlace1);
            car2.driveIn(parkingPlace1);

            showArray(carsInParkingPlace1);

            Cars car3 = new Cars(3);

            car2.driveOut();
            car3.driveIn(parkingPlace1);

            showArray(carsInParkingPlace1);


            car1.driveOut();
            car2.driveOut();

            showArray(carsInParkingPlace1);

            car1.driveIn(parkingPlace1);

            showArray(carsInParkingPlace1);


        }

        static void showArray(Cars[] autos){
            for(int i = 0; i < autos.length; i++){
                System.out.print(autos[i] + " ");
            }
            System.out.println("");
        }
}
