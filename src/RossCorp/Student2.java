package RossCorp;

public class Student2 {
    private String firstName, lastName;
    private int test1, test2, test3;
    //-----------------------------------------------------------------
    //  Sets up this Student object with the specified initial values.
    //-----------------------------------------------------------------

    public Student2 (String first, String last, int test, int test2, int test3){
        firstName = first;
        lastName = last;
        this.test1 = 0;
        this.test2 = 0;
        this.test3 = 0;
    }

    //-----------------------------------------------------------------
    //  Returns this Student object as a string.
    //-----------------------------------------------------------------

    public String toString()
    {
        String result;
        result = firstName + " " + lastName + "\n";
        result += "Test 1:\n" + test1 + "\n";
        result += "Test 2:\n" + test2 + "\n";
        result += "Test 3:\n" + test3 + "\n";
        return result;
    }
}
