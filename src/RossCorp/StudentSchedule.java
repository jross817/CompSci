package RossCorp;
import java.util.Scanner;

public class StudentSchedule {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Student s1 = new Student("Alex",14,'m',9,3.5);
        System.out.println("The current age of " + s1.getName() + " is " + s1.getAge());
        System.out.println("Please enter in the new age of " + s1.getName());
        int val = scan.nextInt();
        s1.setAge(val);
        System.out.println("The student's new age is "+s1.getAge() + " \n");
        System.out.println("It seems as if " +s1.getName() + " has changed their grade level! \n Please enter their new grade level!");
        s1.setGrade(scan.nextInt());
        System.out.println("\nI hear he has changed his name\n What is his new name?");
        s1.setName(scan.next());
        System.out.println("Wow! It seems as if " + s1.getName() + " has changed their GPA. \n Please enter their new gpa!");
        s1.setGpa(scan.nextDouble());
        System.out.println("Now " +s1.getName() + "'s current age is " + s1.getAge() + " their  gpa is " + s1.getGpa() + " and their new grade level is " +s1.getGrade());
    }
}