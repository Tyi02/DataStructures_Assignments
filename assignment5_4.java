package Assignments;

import java.util.*;
public class assignment5_4 {
    public static void main(String[] args) {
        Stack<String>processingCommands = new Stack<String>();
        processingCommands.add("Copy");
        processingCommands.add("Paste");
        processingCommands.add("Font Size: 45");
        processingCommands.add("Text Align:Center");
        processingCommands.add("Font Type: Comic Sans");
        //Reverse its
        int size = processingCommands.size();

        for(int i = 5; i > 0; i--){
            System.out.println("Undo: ");
            System.out.println(processingCommands.pop());
        }


    }
}