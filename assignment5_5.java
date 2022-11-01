package Assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class assignment5_5 {

    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<String>();

       q1.add("Copy");
       q1.add("Paste");
       q1.add("Font size: 24");
       q1.add("Cut");
       q1.add("Delete");


        for(int i = 1; i < 5; i++){
            System.out.println("Undo: ");
            System.out.println(q1.poll());
        }
    }
}
