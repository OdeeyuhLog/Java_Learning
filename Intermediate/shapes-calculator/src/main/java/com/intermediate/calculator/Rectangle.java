package com.intermediate.calculator;

public class Rectangle {
  public void calculatePerimeter(Double width, Double length) {
    System.out.println("Perimeter is : " + (2 * width + 2 * length));
  }

  public void calculateArea(Double width, Double length) {
    System.out.println("Area is:" + width * length);
  }

}
