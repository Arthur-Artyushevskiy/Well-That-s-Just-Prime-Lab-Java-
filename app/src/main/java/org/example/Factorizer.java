package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    if(n == 0 || n == 1){
      return new ArrayList<>();
    }
    var array = new ArrayList<Integer>();
    if(n < 0){
      array.add(-1);
      n = n * -1;
    }


    int divider = 2;
    while(n != 1){
      if(n % divider == 0){
        array.add(divider);
        n = n/divider;
      }
      else{
        divider++;
      }
    }

    return array;
  }
}
