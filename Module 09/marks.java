import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks:");
        int n = sc.nextInt();

        if(n>=80) System.out.println("faad diye guru");
        else if(n>=60) System.out.println("thik thak hai");
        else if(n>40) System.out.println("bekar hai");
        else System.out.println("fail ho gaya mc");
    }
}
