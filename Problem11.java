
public class Problem11 {

    public static void main(String []args){

        AnimalPoweredVehicle1 bullockCart = new AnimalPoweredVehicle1();

        AnimalPoweredVehicle1 charriot = new AnimalPoweredVehicle1();

        HumanPoweredVehicle1 cycle = new HumanPoweredVehicle1();

    }
}


class Vehicle1{
    String name;
}

class AnimalPoweredVehicle1 extends Vehicle1{
    int animalCount;
}

class HumanPoweredVehicle1 extends Vehicle1{
    int wheelCount;
}

class MachinePoweredVehicle1 extends Vehicle1{
    String name;
    String year;
    String vin;

}