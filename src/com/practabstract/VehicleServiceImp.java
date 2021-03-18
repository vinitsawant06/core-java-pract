package com.practabstract;


public class VehicleServiceImp {
    static AutoVehicle autoVehicle = new AutoVehicle();
    static BikeVehicle bikeVehicle = new BikeVehicle();
    static BusVehicle busVehicle = new BusVehicle();

    static final int autoWheels = autoVehicle.numberOfWheels();
    static final int bikeWheels = bikeVehicle.numberOfWheels();
    static final int busWheels = busVehicle.numberOfWheels();

    public static void main(String[] args) {
        System.out.println("Wheels of auto: "+autoWheels);
        System.out.println("Wheels of Bike: "+bikeWheels);
        System.out.println("Wheels of Bus: "+busWheels);
    }
}
