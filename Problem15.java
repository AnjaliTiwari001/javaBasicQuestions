public class Problem15 {
    public static void main(String[] args) {
        autoTransmissionCar tiago = new autoTransmissionCar();
        autoTransmissionCar nexon = new autoTransmissionCar();
        autoTransmissionCar punch = new autoTransmissionCar();
        tiago.move();
        nexon.move();

    }

}
class Vehicle15{
    String name;


    public void move() {
        System.out.println("speed is being displayed1");
    }
}

class AnimalPoweredVehicle15 extends Vehicle15{
    int animalCount;
}

class HumanPoweredVehicle15 extends Vehicle15{
    int wheelCount;
}

class MachinePoweredVehicle15 extends Vehicle15{
    String name;
    String year;
    String vin;

}
class autoTransmissionCar extends MachinePoweredVehicle15{
    public static boolean Switch = false;
    public static void setSwitch(boolean Switch)
    {
        autoTransmissionCar.Switch=Switch;
    }

    public void move() {
        if (Switch)
        {
            System.out.println("Speed is being displayed");}

        else
        {
            System.out.println("Sorry speed not available");
        }
    }



}
class manualTransmissionCar extends MachinePoweredVehicle15{


}

