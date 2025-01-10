public class Food {
    private static final int energy = 10;
    private static double price = 50;
    
    public void setPrice(double price) {
        if (Food.price > price){
            System.out.println("Cannot update the food price.");
        }
        else {
            Food.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getEnergy() {
        return energy;
    }
}
