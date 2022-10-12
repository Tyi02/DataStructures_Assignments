package Assignments;

import java.security.Principal;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class assignment3 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {



        Queue<Double> q1 = new LinkedList<Double>();

        double interest = (.006/100)/12;
        double Mmp = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal balance: ");
        double principal = scan.nextDouble();
        System.out.print("Enter home value: ");
        double homeValue = scan.nextDouble();
        System.out.println("Enter the loan duration in months: ");
        double m = scan.nextDouble();
        System.out.print("Enter down payment: ");
        double downPayment = scan.nextDouble();

        ArrayList<Double> arl = new ArrayList<Double>();

        System.out.println("Principal Value: "+"$"+principal+"\n"+
                "Home Value: "+"$"+ homeValue+"\n"+
                "Loan Duration(Months): "+m+"\n"+
                "Down Payment: "+"$"+downPayment+"\n");
        principal = homeValue - downPayment;

        Mmp = principal*((interest*Math.pow((1+interest),m))/(Math.pow((1+interest),m)-1));
                //principal*((interest * Math.pow((1 + interest), m)) / (1+ Math.pow(interest, m)));



        for (int x = 0; x <= m; x++) {
           q1.add(principal);
            df.format(Mmp);
            double Adjustedprincipal = principal - Mmp;

            double adj2 = Adjustedprincipal;
            principal = adj2;
            arl.add(Mmp);


           // System.out.println(Mmp+"\n" );



        }

        System.out.println("Elements in Queue: "+q1);

        for (int i = 1; i <= m; i++) {
            System.out.println("Month:" + i + " Remaining Home Value: $" + df.format(q1.poll())+ "\n" +
                    "Monthly Payment: "+"$"+df.format(arl.get(i-1))+"\n");
        }
    }
}