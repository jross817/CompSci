package RossCorp;

import java.util.Random;

public class RandomPhone {
    public static void main(String[] args) {
        Random truth = new Random();
        Random number = new Random();
        int num1 = number.nextInt(8);
        int num2 = 10 + number.nextInt(78);
        int num456 = 100 + truth.nextInt(743);
        int num7890 = 1000 + truth.nextInt(10000);

        System.out.println(num1 + num2 + "-" + num456 + "-" + num7890 );

    }
}
