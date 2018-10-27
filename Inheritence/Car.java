public class Car extends Vehicle {
    //we put the constraint that a Vehicle has a speed limit
    //and also 4 gears max
    int maxGears;
    int maxSpeed;

    public void setGears(int gears){
        this.maxGears = gears;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

}
