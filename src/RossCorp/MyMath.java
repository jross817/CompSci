package RossCorp;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        System.out.println("Please enter a integer");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        System.out.println("Please enter a double");
        double s = scan.nextDouble();
        System.out.println("Please enter in a power (1- infinity)");
        double p = scan.nextDouble();

        if(t==t){ //postibe integer
            System.out.println("The absolute value of " + t + " is " + t);
        }


       if(s==s) {
            System.out.println("The absolute value of " + s + " is " + absDouble(s));

        }

        System.out.println("The square root of " + t + " is " + root(t));

        System.out.println(s + " to the " + p + " power is " + power(s,p)  );

        System.out.println("The cubic root of " + t + " is " + CubeRt(t));
        System.out.println(true);

    }
    static double root (int t){ // Square root of an integer
       double squareRoot =  Math.sqrt(t);
       return squareRoot;
    }

    static double absInt (int t) { //Absolute value of an negative integer

        int absValN = t * -1;
        return absValN;
    }

    static double absDouble (double s){ //Absolute value of a negative double
            double absValN = Math.abs(s);
            return absValN;

    }
    static double power (double s, double p) { //Raised power
        double powerTo = Math.pow(s,p);
        return powerTo;
    }
    static double CubeRt (int t) { //Cubic Root
        double cubeRoot = Math.cbrt(t);
        return cubeRoot;
    }
}
