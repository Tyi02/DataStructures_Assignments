package Assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class assignment5_3  {
    public static void main(String[] args) {
        LinkedList<String> country = new LinkedList<String>();

        Scanner kb = new Scanner(System.in);

        for(int i =1; i<=2; i++)
        {
            System.out.println("Please enter country "+i);
                String input = kb.nextLine();
                country.add(input);
        }

        System.out.println("List of countries: \n" +
                country);
    }
}
