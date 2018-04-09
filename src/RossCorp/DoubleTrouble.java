package RossCorp;

public class DoubleTrouble {
    public static void main(String[] args) {
        Double x= new Double(5);
        Double y= new Double(3);
        Double z= new Double(7);

        System.out.println(x.compareTo(x));
        System.out.println(y.compareTo(y));
        System.out.println(z.compareTo(z));
        System.out.println(z.compareTo(x));
        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(z));
    }
}
