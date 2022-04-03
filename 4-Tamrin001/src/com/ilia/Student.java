package com.ilia;

public class Student {
    private int stuNum;
    private String name;
    private double average;
    private String userAnswer;

    public Student(int stuNum,double average ) {
        super();
        this.stuNum = stuNum;
        this.average = average;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNum() {
        return this.getStuNum();
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    public String getUserAnswer() {
        return this.userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

}