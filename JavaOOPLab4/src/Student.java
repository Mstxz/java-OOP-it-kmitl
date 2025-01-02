/*Lab 4 - Student */
public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade(){
        double s = (mScore*0.4)+(fScore*0.4)+ 20;
        if(s>=80){
            System.out.println("Your grade is A");
        }
        else if((80>s)&(s>=70)){
            System.out.println("Your grade is B");
        }
        else if((70>s)&(s>=60)){
            System.out.println("Your grade is C");
        }
        else if((60>s)&(s>=50)) {
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("Your grade is F");
        }
    }
}
