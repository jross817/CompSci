package RossCorp;

public class Student {
    //Declare instance variables
    private String name;
    private int age;
    private char gender;
    private int grade;
    private double gpa;

    //Constructor
    public Student(){
        //Default constructor has no implementation
        //you must use setter methods to enter name, age, gender, grade, gpa
    }

    public Student(String ame, int ge, char ender, int rade, double pa )
    {
        name = ame;
        age = ge;
        gender = ender;
        grade = rade;
        gpa = pa;
    }
    //setter and getter methods
    public void setAge(int newAge){
        age= newAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String ame){
        name = ame;
    }

    public char getGender(){
        return gender;
    }
    public void setGender(char ender){
        gender = ender;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int rade){
        grade = rade;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double pa){
        gpa = pa;
    }
}
