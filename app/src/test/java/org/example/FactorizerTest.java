package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
  }

  @Test
  void itReturnsAListFor100() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(2,2,5,5)), factorizer.primeFactors(100));
  }

  @Test
  void itReturnsAListForNegative100() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(-1,2,2,5,5)), factorizer.primeFactors(-100));
  }

  @Test
  void itReturnsAListForNegative3() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(-1,3)), factorizer.primeFactors(-3));
  }

  @Test
  void itReturnsAListFor3() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(3)), factorizer.primeFactors(3));
  }

  @Test
  void itReturnsAListFor9() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(3,3)), factorizer.primeFactors(9));
  }

  @Test
  void itReturnsAListForNegative9() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(-1,3,3)), factorizer.primeFactors(-9));
  }

  @Test
  void itReturnsAListFor45360() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 3, 3, 3, 3, 5, 7)), factorizer.primeFactors(45360));
  }

  @Test
  void itReturnsAListForNegative45360() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(Arrays.asList(-1, 2, 2, 2, 2, 3, 3, 3, 3, 5, 7)), factorizer.primeFactors(-45360));
  }
}

