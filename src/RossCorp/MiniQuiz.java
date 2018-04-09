package RossCorp;

import java.util.Scanner;
    public class MiniQuiz
    {
        //-----------------------------------------------------------------
        //  Presents a short quiz.
        //-----------------------------------------------------------------
        public static void main (String[] args)
        {
            Question q1, q2, q3, q4, q5;
            String possible;
            Scanner scan = new Scanner(System.in);
            possible = scan.next();

            q1 = new Question ("What is the capital of Jamaica?",
                    "Kingston");
            q1.getComplexity();

            if (q1.answerCorrect(possible))
                System.out.println ("Correct");
            else
                System.out.println ("No, the answer is " + q1.getAnswer());
            System.out.println();




            q2 = new Question ("Which is worse, ignorance or apathy?",
                    "I don't know and I don't care");
            q2.getComplexity();
            System.out.print (q1.getQuestion());
            System.out.println (" (Level: " + q1.getComplexity() + ")");
            System.out.print (q2.getQuestion());
            System.out.println (" (Level: " + q2.getComplexity() + ")");
            possible = scan.nextLine();

            if (q2.answerCorrect(possible))
                System.out.println ("Correct");
            else
                System.out.println ("No, the answer is " + q2.getAnswer());




            q3 = new Question ("Is love real?", "Yes");
            q3.getComplexity();
            System.out.println(q3.getQuestion());
            System.out.println("(Level: " + q3.getComplexity() + ")");

            if (q3.answerCorrect(possible))
                System.out.println ("Correct");
            else
                System.out.println ("No, the answer is " + q3.getAnswer());




        } }
