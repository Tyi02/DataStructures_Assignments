package Assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class assignment1 {
    /**
     * @author Terry, Joshua
     * @date 09/21/22
     * @param args
     */


    public static void main(String[] args)
    {
        LinkedList<String> classroom = new LinkedList<String>();
        Scanner keyboard = new Scanner(System.in);

        classroom.add("Billy");
        classroom.add("John");
        classroom.add("Carl");
        classroom.add("Olivia");
        classroom.add("Joshua");


         System.out.println("What student entry would you like to add?");
         String input = keyboard.nextLine();
         classroom.add(input);


       System.out.println("What student entry would you like to remove?");
       int input2 = keyboard.nextInt();
        classroom.remove(input2);

        System.out.println(classroom);

    }
}
