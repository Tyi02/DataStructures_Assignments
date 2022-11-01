package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class assignment5_2 {
    public static void main(String[] args) {
        ArrayList<Integer>salary = new ArrayList<Integer>();
    Scanner kb = new Scanner(System.in);
        for(int i = 1; i<= 3; i++)
        {
            System.out.println("Please enter salary "+i);
            int input = kb.nextInt();
            salary.add(input);
        }

        System.out.println("List of salaries \n" +
                salary);

    }
}
