package RossCorp;

// Two die objects
//

public class PairofDice {
    private Die die1;
    private Die die2;
    private int numFaces;   // number of sides on the die
    private int faceValue;  // current value showing on the die

    public PairofDice() {
        numFaces = 6;
        faceValue = 1;
       Die die1 = new Die();
       Die die2 = new Die();


    }
    public int roll ()
    {
        faceValue = (int) (Math.random() * numFaces) + 1;
        return faceValue;

    }
    public int getFaceValue ()
    {
        return faceValue;
    }

    public Die getDie1() {
        return die1;
    }
    public Die getDie2() {
        return die2;
    }

}
