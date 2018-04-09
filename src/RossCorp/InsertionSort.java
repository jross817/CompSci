package RossCorp;

public class InsertionSort{
    public static void SelectionSort(int[]numbers) {
        int min, temp;

        for (int index = 0; index<numbers.length; index++)
        {
            min= index;

        for (int scan = index+1; scan< numbers.length; scan++){
            if (numbers [scan] < numbers[min])
                    min = scan;
           }
        }
    }
}
