public class Lambo extends Car {

    public void setGears(){
        this.maxGears = 4;
    }

    public void setMaxSpeed(){
        this.maxSpeed = 250;
    }


    @Override
    public void changeGear(int gear){
        if(gear < 4)
            this.gear = gear;
    }

}
