package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // Task 1 ------------------------------------------------------
      Student object1=new Student();
      object1.name="მარი";
      object1.age=24;
      object1.courseName="API/WEB Automation";

      object1.printInfo(object1.name, object1.age);
      object1.printStudentInfo(object1.name, object1.age, object1.courseName);

      // Task 2 -------------------------------------------------------

        AnimalSound object2=new AnimalSound();
        object2.makeSound();

        //Task 3 --------------------------------------------------------

        int[] studentScores={43, 80, 74, 75, 58, 90, 100};

        for(int studentScore : studentScores){
            if(studentScore>75) System.out.println(studentScore);
        }
        //Task 4 --------------------------------------------------------



    }


}