package RossCorp;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a max");
        int max = scan.nextInt();
        System.out.println("Please enter a min");
        int min = scan.nextInt();
        System.out.println("Please enter an interval");
        int interval = scan.nextInt();

        while(max>min){
            System.out.println((max - interval));

            max = max - interval;

        }
    }
}
