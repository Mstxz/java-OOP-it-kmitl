public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t){
        this.setFuel(s);
        this.setTopSpeed(t);
    }

    public void fly(){
        int curr_fuel = getFuel();
        if (curr_fuel <= 200){
            System.out.println("Please add fuel.");
        }
        else {
            System.out.println("Fly.");
            setFuel(curr_fuel - 200);
        }
    }

    public void showPlaneInfo(){
        System.out.print("Plane detail is, ");
        showInfo();
    }
}
