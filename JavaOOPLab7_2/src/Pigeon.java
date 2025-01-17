public class Pigeon extends Bird {
    private static int numberOfPigeon;

    public Pigeon(){
        this(0.0,0.0,0.0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        numberOfPigeon += 1;
    }

    public void eat(String food){
        if(food.equals("worm")){
            setWeight(getWeight()+0.5);
        }
        else if (food.equals("seed")){
            setWeight(getWeight()+0.2);
        }
        else {
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }

    @Override
    public void fly(){
        this.setWeight(getWeight()-0.25);
        if (this.getWeight() >= 5){
            System.out.println("Fly Fly");
        }
        else {
            System.out.println("I'm hungry.");
        }
    }

    @Override
    public void landing(){
        this.setWeight(getWeight()-0.5);
        if (this.getWeight() >= 5){
            System.out.println("Landing");
        }
        else {
            System.out.println("I'm hungry.");
        }
    }

    @Override
    public void takeOff(){
        this.setWeight(getWeight()-0.5);
        if (this.getWeight() >= 5){
            System.out.println("Take Off");
        }
        else {
            System.out.println("I'm hungry.");
        }
    }

    @Override
    public String toString(){
        return "Pigeon "+getWeight()+String.format(" kg and %.1f cm. There are %d pigeons.", getHeight(), numberOfPigeon);
    }
}
