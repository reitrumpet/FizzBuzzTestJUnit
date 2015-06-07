package model;

/**
 *
 * @author rei-medeiros
 */


public class FizzBuzz {

    public String evaluate(int number) {
        if (0 == number % 3 && 0 == number % 5) {
            return "FizzBuzz";
        }else if (0 == number % 3) {
            return "Fizz";
        }else if (0 == number % 5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
    
}
