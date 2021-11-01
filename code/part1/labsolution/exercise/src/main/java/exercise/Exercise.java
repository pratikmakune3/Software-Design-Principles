package exercise;

import java.util.*;
import static java.util.stream.Collectors.joining;

public final class Exercise {
  public static String commaSeparatedNamesOfLength(List<String> names, int length) {
    return names.stream()
      .filter(name -> name.length() == length)
      .map(String::toUpperCase)
      .collect(joining(", "));
  }

  public static double calculate(List<Integer> numbers) {
    return numbers.stream()
      .filter(Exercise::isEven)
      .filter(Exercise::isGT3)
      .filter(Exercise::sqrtLessThan3)
      .mapToInt(Exercise::doubleIt)
      .sum();
  }
  //Should we write a filter with multiple and conditions or multiple filters with one condition each
  //Prefer the latter - multiple filters with one condition each - SLAP

  private static boolean isEven(int number) { return number % 2 == 0; }
  private static boolean isGT3(int number) { return number > 3; }
  private static boolean sqrtLessThan3(int number) { return Math.sqrt(number) < 3; }
  private static int doubleIt(int number) { return number * 2; }
}
