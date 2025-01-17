public class Ship extends Vehicle implements Floatable {
    public Ship(){
        fuel = 0.0;
    }

    public Ship(double fuel){
        this.fuel = fuel;
    }

    @Override
    public void fl0at(){
        if(this.fuel >= 50){
            this.fuel -= 50;
            System.out.println("Ship moves");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }

    @Override
    public void honk(){
        System.out.println("Shhhhh");
    }

    public void move(){
        fl0at();
    }

    public void move(int distance){
        for(int i=0;i < distance;i++){
            fl0at();
            if (this.fuel < 50){
                break;
            }
        }
    }

    @Override
    public void startEngine(){
        if(this.fuel >= 10){
            this.fuel -= 10;
            System.out.println("Engine starts");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }

    @Override
    public void stopEngine(){
        System.out.println("Engine stops");
    }
}
