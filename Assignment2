package Assignments;

import java.util.Scanner;
import java.util.Stack;

public class assignment2 {

    public static void main(String[] args) {
        Stack<Double> calculator = new Stack<Double>();

        Scanner kb = new Scanner(System.in);


        System.out.println("How much would you like to deposit into your 401K?");
        double input = kb.nextDouble();
            calculator.push(input);

        System.out.println("What is the intrest rate you would like to apply?");

        double interest = kb.nextDouble();

        double sum = 0;
        double total = 0;

        double tempSum = 0;
        double newSum =0;

        for(int i = 1; i<=30; i++)
        {

            tempSum = input * interest+input;
            sum += tempSum;
            calculator.push(sum);


            total += sum;
        }
        System.out.println("Your total:"+ total);
        for(int i =30; i>0; i--) {
            System.out.println("Year: "+i+" "+"$"+calculator.pop());

        }

    }
}
