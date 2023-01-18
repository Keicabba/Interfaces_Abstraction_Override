public class Car extends Vehicle {
    int numberOfDoors;
    double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("this car have "+ numberOfDoors + " doors");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("this car does brum brum XD");
    }

    public Car (int wheels, int doors, double price) {
        type = "car";
        numberOfWheels = wheels;
        numberOfDoors = doors;
        carPrice = price;
    }
}
