package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  Student object1=new Student();
  object1.name="მარი";
  object1.age=24;
  object1.courseName="API/WEB Automation";

object1.printInfo(object1.name, object1.age);
object1.printStudentInfo(object1.name, object1.age, object1.courseName);
    }
}