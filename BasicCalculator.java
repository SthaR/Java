/**
 * Created by Ruby on 1/29/2015.
 */

import java.util.Scanner;

public class BasicCalculator { //class

    //main method
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=input.nextInt();
        System.out.println ("Enter next number: ");
        int num2=input.nextInt();

        Calculator calc=new Calculator();
        System.out.print("The sum of num1 and num2: " + calc.add(num1, num2) + " The Difference (num1-num2): " + calc.subtraction(num1, num2) + " num1/num2: " + calc.division(num1, num2) + " num1*num2: " + calc.multiplication(num1, num2));





    }
}
