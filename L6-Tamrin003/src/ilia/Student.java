package ilia;

public class Student {
    private int stuCode;
    private String name;
    private String lastName;
    private int year;
    private double averageScore;

    private Student() {}

    public int getStuCode() {
        return stuCode;
    }

    public int setStuCode(int stuCode) {
        this.stuCode = stuCode;
        return stuCode;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public String setYear(int year) {
        this.year = year;
        return null;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public double setAverageScore(double averageScore) {
        this.averageScore = averageScore;
        return 0;
    }

    //create a private object for the Class.
    private static Student student;

    //
    public static Student getInstance(){
        if (student == null)
        {
            student = new Student();
        }
        return student;
    }

}
