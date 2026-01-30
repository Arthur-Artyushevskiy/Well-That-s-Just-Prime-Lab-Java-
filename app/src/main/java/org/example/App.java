package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    var app = new Factorizer();
    ArrayList<Integer> array = app.primeFactors(45360);
    System.out.println(array);
  }
}
