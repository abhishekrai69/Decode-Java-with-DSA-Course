import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (score > 33) {
            System.out.println(“Pass”);
            } else {
            System.out. println(“Fail”);
            }
            if(score > 80) {
                System.out.println(“A”);
                } else if (score > 60) {
                System.out.println(“B”);
                } else if (score > 40) {
                System.out.println(“C”);
                } else {
                System.out.println(“D”);
                }
    }
    
}
