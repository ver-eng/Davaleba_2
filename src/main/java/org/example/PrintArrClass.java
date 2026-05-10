package org.example;

public class PrintArrClass {
    public static void main(String[] args) {
        int[] array1={5, 45, -100, 87};
        String[] array2={"dog", "cat", "horse", "tiger"};
        PrintArrClass object1=new PrintArrClass();
        object1.printArr(array1);
        object1.printArr(array2);
    }

    public void printArr(String[] arr){

        for (String each:arr){
            System.out.println(each);
        }

    }
    public void printArr(int[] arr){

        for (int each:arr){
            System.out.println(each);
        }

    }
}
