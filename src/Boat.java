public class Boat extends Vehicle {
double maxKnotsSpeed;
int boatKilosWeight;


    @Override
    public void doVehicleSound() {
        System.out.println("This boat does glu glu glu");
    }
    public Boat(double speed, int weight){
        type = "Boat";
        maxKnotsSpeed = speed;
        boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed(){
        return ("Tis boat weight is " + boatKilosWeight + "Kg and can reach " + maxKnotsSpeed + "Km/h");
    }
}
