public abstract class Bird implements Flyable {
    private double height;
    private double weight;
    private double wingSize;

    public Bird(){
        this(0.0, 0.0, 0.0);
    }

    public Bird(double wingSize, double weight, double height){
        this.wingSize = wingSize;
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWingSize() {
        return wingSize;
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat(double food){
        if (food < 0){
            System.out.println("Input cannot be negative number.");
        }
        else {
            this.weight += food;
        }
    }
}
