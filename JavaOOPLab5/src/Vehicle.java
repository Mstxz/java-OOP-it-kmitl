public class Vehicle {
    private int fuel;
    private String topSpeed;

    protected int getFuel(){
        return fuel;
    }

    protected void setFuel(int i){
        this.fuel = i;
    }

    protected String getTopSpeed(){
        return topSpeed;
    }

    protected void setTopSpeed(String n){
        this.topSpeed = n;
    }

    public void showInfo(){
        System.out.println("Fuel is " + fuel + " litre and Top Speed is " + topSpeed + " m/s.");
    }
}
