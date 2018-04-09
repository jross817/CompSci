package RossCorp;

public class StarWars {
    public static void main(String[] args) {

        String phrase = (" Star wars is cool ");
        String reply = ("indeed ");


        System.out.println(phrase);
        System.out.println(phrase.toUpperCase() + reply);
        System.out.println(reply + phrase);
        System.out.println(reply + phrase.replace('a','*'));


    }
}

