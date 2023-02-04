import java.sql.SQLOutput;

public class Problem12 {

    public static void main(String []args){

        AnimalPoweredVehicle bullockCart = new AnimalPoweredVehicle();
        System.out.println(bullockCart.move(20));
        MachinePoweredVehicle car = new MachinePoweredVehicle();
        System.out.println(bullockCart.move(100));
        HumanPoweredVehicle cycle = new HumanPoweredVehicle();
        System.out.println(bullockCart.move(10));
        System.out.println(car.str);
        System.out.println(bullockCart.str);

    }
}


class Vehicle {
    String name;
    int speed;

    public int move(int speed) {
        return speed;
    }
}

    class AnimalPoweredVehicle extends Vehicle {
        int animalCount;
        String str= "backward"+" "+"forward";

    }

    class HumanPoweredVehicle extends Vehicle {
        int wheelCount;
        String str= "backward"+" "+"forward";

    }

    class MachinePoweredVehicle extends Vehicle {
        String name;
        String year;
        String vin;

        String str= "forward";

    }
