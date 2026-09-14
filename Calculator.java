
/**
 * This calculator program is just a basic daily calculator use for simple addition, subtraction, multiplcation, and divsion
 *
 * @author (Jphamm512)
 * @version (Version 1 (09/14/2026) )
 */

import java.util.*;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double num1;
        double num2;
        double times;
        boolean run;
        String cont;
        String calc;
        String operation;
        
        System.out.println("Would you like to calculate? Yes or No");
        calc = scnr.next();
        if(calc.equals("No") || calc.equals("no")) {
            System.out.println("OK whenever you need me, run me again :D");
        }
        else if(calc.equals("Yes") || calc.equals("yes")) {

            System.out.println("Enter your number: ");
            num1 = scnr.nextDouble();
            run = true;
            while(run)
            {
                System.out.println("Would you like to clear?: Yes/No");
                cont = scnr.next();
                if(cont.equals("Yes") || cont.equals("yes")){
                    num1 = 0;
                    System.out.println("Enter your number: ");
                    num1 = scnr.nextDouble();
                }
                System.out.println("what Operation(Addition, Subtraction, Divsion, Multiplcation)?");
                operation = scnr.next();
                if(operation.equals("Addition") || operation.equals("addition") ) {
                    System.out.println("With what number?");
                    num2 = scnr.nextDouble();
                    num1 = num1 + num2;
                    System.out.println("That will be: " + num1);
                }
                else if(operation.equals("Subtraction") || operation.equals("subtraction") ) {
                    System.out.println("With what number?");
                    num2 = scnr.nextDouble();
                    num1 = num1 - num2;
                    System.out.println("That will be: " + num1);
                }
                else if(operation.equals("Divsion") || operation.equals("divsion")) {
                    System.out.println("With what number?");
                    num2 = scnr.nextDouble();
                    num1 = (num1 / num2);
                    System.out.println("That will be: " + num1);
                }
                else if(operation.equals("Multiplcation") || operation.equals("multiplcation")){
                    System.out.println("With what number?");
                    num2 = scnr.nextDouble();
                    num1 = (num1 * num2);
                    System.out.println("That will be: " + num1);
                }
            }
        }
    }
}   
