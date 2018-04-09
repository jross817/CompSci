package RossCorp;
import java.util.Random;


public class RandomReverse {
    public static void main(String[] args) {


        int [] RandomArray = new int [10];
        Random rand = new Random();

            for (int ran = 0;  ran < RandomArray.length; ran++) {    //To make sure each array has a random value
                RandomArray[ran] = rand.nextInt();
                for (int count = RandomArray.length; count>0; count --) {
                    System.out.println(RandomArray[count]);
                }
            }
        int min;

        for (int index = 0; index<RandomArray.length; index++)
        {
            min= index;

            for (int scan = index+1; scan< RandomArray.length; scan++){
                if (RandomArray [scan] < RandomArray[min])
                    min = scan;
            }
        }

    }
}
