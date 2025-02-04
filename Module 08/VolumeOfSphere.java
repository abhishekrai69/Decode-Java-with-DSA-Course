import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius: ");

        double r = sc.nextDouble();
        double v = (4 * 3.1415 * r * r * r)/3;

        System.out.println(v);
    }   
}

