package Assignments;



import java.sql.SQLOutput;
import java.util.Scanner;

public class assignment6 {


    public static void main(String[] args) {
        BT bt = new BT();
    Scanner kb = new Scanner(System.in);


    //Loop to ask for addresses.
        System.out.println("Please enter 5 house addresses.");

        for(int i = 1; i < 6; i++)
        {
            System.out.println("Enter address "+i);
            int input = kb.nextInt();
            bt.insert(input);
        }

        //prints out tree
        System.out.println("Contents in the tree: ");
        System.out.println("inorder: ");
        bt.inorder();
        System.out.println("\n" +
                "Preorder: ");
        bt.preorder();
        System.out.println("\n" +
                "Postorder: ");
        bt.postorder();

        System.out.println("");

        // Asks user if they want to search for specific address.
        //Searches for address and if found displays "True".
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to search for a specific address");
        System.out.println("1. Yes \n" +
                "2. No");
        int choice = scan.nextInt();
        switch (choice)
        {
            case 1 :
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bt.search( scan.nextInt() ));
                break;

            case 2 :
                System.exit(0);

        }
    }
}
