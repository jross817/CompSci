package RossCorp;

public class RootBeer {
    public static void main(String[] args) {
        int RB = 99;
        int min = 3;

        while(RB>=min){
            System.out.println(RB + " bottles of rootbeer on the wall, " + RB + " bottles of rootbeer, take one down, pass it around " + (RB - 1) + " of rootbeer on the wall.");
            RB--;
        }

    }
}
