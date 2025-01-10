public class Seller extends Employee {
    public Food sell(Employee e){
        Food food = new Food();
        if (e.getWallet().getBalance() >= food.getPrice()){
            return food;
        }
        else {
            System.out.println("Your monry is not enough.");
            return null;
        }
    }
}
