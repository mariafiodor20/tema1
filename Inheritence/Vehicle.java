public class Vehicle {
    public String steering_wheel;
    public int gear;
    public int speed;

    public void handSteering(String direction){
        this.steering_wheel = direction;
    }

    public void changeGear(int gear){
        this.gear = gear;
    }

    public void increaseSpeed(){
        this.speed += 10;
    }

    public void decreaseSpeed(){
        this.speed -= 10;
    }
}
