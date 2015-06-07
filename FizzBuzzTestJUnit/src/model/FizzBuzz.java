package model;

import javax.swing.JOptionPane;

/**
 *
 * @author rei-medeiros
 */


public class FizzBuzz {
    
    public int number;
    
    public  String evaluate(int number) {
        if (multipleOf3(number) && multipleOf5(number)) {
            return "FizzBuzz";
        }else if (multipleOf3(number)) {
            return "Fizz";
        }else if (multipleOf5(number)) {
            return "Buzz";
        }else{
            return String.valueOf(number);
        }
    }
    
    public boolean multipleOf3(int number){
        return 0 == number % 3;
    }
    public boolean multipleOf5(int number){
        return 0 == number % 5;
    }
    
}
