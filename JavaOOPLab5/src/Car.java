public class Car extends Vehicle {
    private String typeEngine;

    public String getTypeEngine(){
        return typeEngine;
    }

    public void setCarInfo(int s, String t, String y) {
        this.setFuel(s);
        this.setTopSpeed(t);
        this.typeEngine = y;
    }

    public void setTypeEngine(String t){
        this.typeEngine = t;
    }

    public void move(){
        int curr_fuel = getFuel();
        if (curr_fuel <= 50){
            System.out.println("Please add fuel.");
        }
        else {
            System.out.println("Move.");
            setFuel(curr_fuel - 50);
        }
    }

    public void showCarInfo(){
        System.out.println("Car engine is "+typeEngine+".");
        this.showInfo();
    }
}
