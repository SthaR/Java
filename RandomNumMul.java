/**
 * Created by Ruby on 2/4/2015.
 */

import com.company.Main;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

//Program to ask the user the result of certain calculation until s/he gives correct result
public class RandomNumMul {

    public static void main(String[] args) {

        RandomArithmetic cls1=new RandomArithmetic();

        cls1.askUser(); //Calling the method to ask user arithmetic question
    }
}

class RandomArithmetic{

    //generating random integer from 0 to 9
    int getRandom(){
        return (int)(Math.random()*10);
    }
    int rn1, rn2;

    //asking user input/response of the arithmetic question
    void askUser(){
        int i, userVal;
        String op;
        boolean result;
        Scanner userIn=new Scanner(System.in);
        do {
            rn1 = getRandom();
            rn2 = getRandom();
            op = operation();
            System.out.println(rn1 + op + rn2 + "=");
            userVal=userIn.nextInt();

            result= checkResult(op, userVal);
        }while (result==false);

        System.out.println("Bravo Right!");
    }

    //Generating operation type randomly
    String operation(){
        int randomVal;
        randomVal=(getRandom()%3)+1;

        String op="";
            switch (randomVal){
                case 1:
                    op="+";
                    break;
                case 2:
                    op="-";
                    break;
                case 3:
                    op="*";
                    break;
            }
        return op;
    }

    //Checking whether the user entered value matches correct value
    boolean checkResult(String op, int val){
        int actualResult;

        if (op=="+")
            actualResult=rn1+rn2;
        else if (op=="-")
            actualResult=rn1-rn2;
        else
            actualResult=rn1*rn2;

        if (val==actualResult)
            return true;
        else
            return false;
    }
}


