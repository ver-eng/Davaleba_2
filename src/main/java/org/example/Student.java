package org.example;

public class Student extends Person{
    String courseName;
    public static void main(String[] args) {

    }
    public void printStudentInfo(String name, int age, String courseName){
        System.out.println("მე ვარ "+name + ", "+age+" წლის და მე ვსწავლობ" +" "+courseName+"-ს.");
    }
}
