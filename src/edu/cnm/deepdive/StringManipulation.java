package edu.cnm.deepdive;

public class StringManipulation {

  private static StringBuilder stringBuilder = new StringBuilder("zebra");

  public static void main(String[] args) {

    stringBuilder.reverse();
    //reverses a string

    stringBuilder.replace(0, stringBuilder.length(), "new_string");
    //completely replaces a string, basically makes string mutable

  }


}
