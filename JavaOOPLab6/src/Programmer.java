public class Programmer extends Employee {
    private int happiness;

    public void coding(String str){
        if (getEnergy() >= 30){
            System.out.println("Your code is "+str);
            this.happiness -= 30;
            setEnergy(getEnergy() - 30);
        }
        else {
            System.out.println("Error Error Error");
        }
    }

    public void coding(char str){
        coding(String.valueOf(str));
    }

    public int getHappiness(){
        return happiness;
    }

    public void setHappiness(int happiness){
        this.happiness = Math.max(happiness, 0);
    }
}
