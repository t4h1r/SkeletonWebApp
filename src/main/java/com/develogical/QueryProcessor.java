package com.develogical;

import java.util.Arrays;
import java.util.Comparator;

public class QueryProcessor {

  public String process(String query) {

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
              + "English poet, playwright, and actor, widely regarded as the greatest "
              + "writer in the English language and the world's pre-eminent dramatist.";
    } else if (query.toLowerCase().contains("what is your name?")) {
      return "Tahir";
    } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
      String[] numbers = query.split(":");
      String[] max = numbers[1].replace("?","").replace(",","").split(" ");
      return Arrays.stream(max).max(Comparator.naturalOrder()).get();

    }else if (query.toLowerCase().contains("plus")) {
      String[] numbers = query.split("plus");
      int int1 = Integer.parseInt(numbers[0].replaceAll("[^\\d.]",""));
      int int2 = Integer.parseInt(numbers[1].replaceAll("[^\\d.]",""));
      return Integer.toString(int1 + int2);
    } else {

      return "";
    }
  }
}
