public class Problem13 {
    public static void main(String[] args) {
       car2D alto = new car2D();
        System.out.println(alto.noOfDoors);

    }

}
class Vehicle2{
    String name;
}

class AnimalPoweredVehicle2 extends Vehicle2{
    int animalCount;
}

class HumanPoweredVehicle2 extends Vehicle1{
    int wheelCount;
}

class MachinePoweredVehicle2 extends Vehicle1{
    String name;
    String year;
    String vin;

}

class car extends MachinePoweredVehicle2{
    int noOfDoors=0;

    int getnoOfDoors() {
        return(noOfDoors);
    }

//
}


class car2D extends car{
    int noOfDoors=2;
    public void setnoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}
class car4D extends car{
    int noOfDoors=4;
    public void setnoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}