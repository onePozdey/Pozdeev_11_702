package ru.itis;

public class Cars {
    private ParkingPlace parkingPlace;
    private int num;

    public Cars(int num){
        this.num = num;
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(ParkingPlace parkingPlace) {
        if (parkingPlace != null) {
            this.parkingPlace = parkingPlace;
        }
    }

    public boolean in(ParkingPlace parkingPlace){
        Cars[] autos = parkingPlace.getCars();
        for(int i = 0; i < autos.length; i++){
            if (this.equals(autos)){
                return true;
            }
        }
        return false;
    }

    public void driveIn(ParkingPlace parkingPlace){
        parkingPlace.letIn(this);
        if (this.in(parkingPlace)){
            setParkingPlace(parkingPlace);
            this.parkingPlace = parkingPlace;
        }
    }

    public void driveOut(){
        if (parkingPlace != null) {
            parkingPlace.letOut(this);
        }
    }

}
