package Assignments;


import java.util.Scanner;

public class assignment4 {


    public static void main(String[] args) {
        int input = 0;
        int num = 0;
        Scanner kb = new Scanner(System.in);

        System.out.println("How many numbers would you like to add? ");

        input = kb.nextInt();
        int[] number = new int[input];
        for(int i = 0; i<input; i++)
        {
            System.out.println("Please enter a number..");
            num = kb.nextInt();
         number[i] = num;
        }

        System.out.println("Array before bubble sort: ");
        for(int i=0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println("");

        bubbleSort(number);

        System.out.println("Array after Bubble sort: ");
        for(int i=0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }



    private static void bubbleSort(int[] number) {
        int input = number.length;
        int temp = 0;
        for(int i=0; i < input; i++){
            for(int j=1; j < (input-i); j++){
                if(number[j-1] > number[j]){
//swap the elements!
                    temp = number[j-1];
                    number[j-1] = number[j];
                    number[j] = temp;
                }
            }
        }
    }
}
