package com.intermediate.calculator;

public class Triangle {
  public void calculatePerimeter(double a, double b, double c) {
    System.out.println("Perimeter: " + (a + b + c));
  }

  public void calculateArea(double base, double height) {
    System.out.println("Area: " + (base * height * 0.5));
  }
}
