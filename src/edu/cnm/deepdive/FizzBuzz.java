package edu.cnm.deepdive;

public class FizzBuzz {

  public static final int DEFAULT_UPPER_BOUND = 100;

  public static void main(String[] args) {

    int upperBound = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_BOUND;

    for (int i = 1; i <= upperBound; i++) {

      /*System.out.println((i % 3 == 0) ? ((i % 5 == 0) ? "FizzBuzz" : "Fizz")
          : ((i % 5 == 0) ? "Buzz" : String.valueOf(i)));
      ONE LINE BOIS */

      System.out.println(fizzBuzzValue(i));


    }

  }

  public static String fizzBuzzValue(int value) {
    if ((value % 3 == 0) & (value % 5 != 0)) {
      return "Fizz";
    } else if ((value % 5 == 0) & (value % 3 != 0)) {
      return "Buzz";
    } else if ((value % 3 == 0) & (value % 5 == 0)) {
      return "FizzBuzz";

    } else {
      return String.valueOf(value);
    }

  }
}