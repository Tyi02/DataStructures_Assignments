package Assignments;

import java.util.Scanner;

public class assignment5_1 {
    public static void main(String[] args) {
        String array[] = new String[6];

        Scanner kb = new Scanner(System.in);


       // loops and asks user to enter names
        for(int i = 1; i< array.length; i++)
        {
            System.out.println("Please enter a name "+i);
            array[i] = kb.nextLine();
        }

        System.out.println("Names in the array; ");

        //prints out the names
        for (int j = 1; j < array.length; j++) {

            System.out.print(array[j] + " ");
        }
    }
}
