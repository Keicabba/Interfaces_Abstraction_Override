public class Test {
    public static void main(String[] args) {
        Car Car1 = new Car(4,4,254.00);
        Boat Boat1 = new Boat (90.5, 900);

        Car1.showVehicleDetails();
        Car1.doVehicleSound();
        Boat1.showVehicleDetails();
        Boat1.doVehicleSound();
        System.out.println(Boat1.getBoatWeightAndSpeed());
    }
}
