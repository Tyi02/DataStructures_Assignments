package Assignments;

import java.util.Scanner;

public class assignment5_6 {


    public static void main(String[] args) {
        int a1[] = new int[6];

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");

        for(int i = 1; i<a1.length; i++)
        {
            System.out.println("enter number "+i);
            a1[i] = kb.nextInt();

        }

        System.out.println("Array before bubble sort: ");
        for(int j = 1; j <a1.length; j++)
        {
            System.out.println(a1[j] + " ");

        }

        System.out.println("");

        bubbleSort(a1);

        System.out.println("Array after Buble sort: ");
        for(int i = 1; i<a1.length; i++)
        {
            System.out.println(a1[i]+" ");
        }
    }

    private static void bubbleSort(int[] a1) {

        int n = a1.length;
        int temp = 0;

        for(int i=0; i < n; i++)
        {
            for(int j=1; j< (n-i); j++)
            {

                if(a1[j-1] > a1[j])
                {
                    temp = a1[j-1];
                    a1[j-1] = a1[j];
                    a1[j] = temp;
                }
            }
        }
    }
}
