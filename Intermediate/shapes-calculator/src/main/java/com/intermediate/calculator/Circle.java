package com.intermediate.calculator;

public class Circle {
  public void calculatePerimeter(Double radius) {
    System.out.println("Perimeter: " + radius * 2 * Math.PI);
  }

  public void calculateArea(Double radius) {
    System.out.println("Area: " + Math.pow(radius, 2) + Math.PI);
  }
}
