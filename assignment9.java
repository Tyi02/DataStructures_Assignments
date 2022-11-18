package Assignments;

import java.util.*;

public class assignment9 {
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);

        HashMap<String, String>boatInformation = new HashMap<>();

        System.out.println("How many boats would you like to enter?");
        int loopCount = kb.nextInt();

        for(int i =0; i<loopCount;i++){
            System.out.println("Enter boat name:");
            String boatName = kb.next();
            System.out.println("Enter boat hull number:");
            String boatHull = kb.next();
            boatInformation.put(boatName,boatHull);
        }

        System.out.println("Recorded Hull Numbers: "+boatInformation.values());

        System.out.println("Would you like to search for a value? Y or N?");
        String choice = kb.next();

        if(choice.equals("Y")){
            System.out.println("Enter Key Below");
            String requestedKey = kb.next();

            if(boatInformation.containsKey(requestedKey)) {
                System.out.println("Hull Number Found: " + boatInformation.get(requestedKey));
            }else{
                System.out.println("Key Value Not Found.");
            }

        }else{
            System.out.println("Ending Program.");
        }


    }
}