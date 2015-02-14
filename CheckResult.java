/**
 * Created by Ruby on 2/4/2015.
 */
public class CheckResult {

    public String result(int multiplicationVal, int num1, int num2){
        int z=num1*num2;
        if (multiplicationVal==z)
            return  "Bravo Dude! You're right!!";
        else
            return "Duh!! Study Hard Man!";
    }
}
