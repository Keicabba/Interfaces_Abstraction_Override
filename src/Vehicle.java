public abstract class Vehicle {
    String type;
    int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("This is a " + type + " with " + numberOfWheels + " wheels");
    }
    public abstract void doVehicleSound();

}
