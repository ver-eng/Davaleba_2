package org.example;

public class AbstractClassChild extends AbstractClass{
    public String name;
    int age;
    private int completedTasks;

    @Override
    void sum(int x, int y) {
        System.out.println("ჯამი არის: "+(x+y));
    }

    @Override
    void printHello() {
        System.out.println("Hello World!!!");
    }
    public void setCompletedTasks(int completedTasks){
        if(completedTasks>=2){
            this.completedTasks=completedTasks;
            System.out.println("შესრულებულია "+this.completedTasks+" სამუშაო.");

        }else{
            System.out.println("შესრულებული სამუშაო ორზე ნაკლებია, შეასრულე მეტი სამუშაო.");
        }
    }
}
