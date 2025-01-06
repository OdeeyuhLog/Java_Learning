package com.intermediate.calculator;

public class Trapezoid {
  public void calculatePerimeter(Double a, Double b, Double c, Double d) {
    System.out.println("Perimeter: " + a + b + c + d);
  }

  public void calculateArea(Double b, Double d, Double height) {
    System.out.println("Area: " + height / 2 * (b + d));
  }
}
