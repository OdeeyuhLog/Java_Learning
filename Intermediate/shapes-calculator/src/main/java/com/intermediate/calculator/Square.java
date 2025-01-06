package com.intermediate.calculator;

public class Square extends Shape {

  public void calculateArea(double value) {
    System.out.println("Perimete: " + value * value);

  }

  public void calculatePerimeter(double value) {
    System.out.println("Perimeter: " + 4 * value);
  }

}
