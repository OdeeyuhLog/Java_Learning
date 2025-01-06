package com.intermediate.calculator;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int userChoice = 0;

    while (true) {
      System.out.println("Welcome to Shapes calculator");
      System.out.println("----------------------------");
      System.out.println(" 1 - Square");
      System.out.println(" 2 - Circle");
      System.out.println(" 3 - Rectangle");
      System.out.println(" 4 - Triangle");
      System.out.println(" 5 - Parallelogram");
      System.out.println(" 6 - Trapezoid");
      System.out.println("Enter choice: ");

      try {
        userChoice = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
        System.err.println("Please enter a number.");
        continue;
      }

      switch (userChoice) {
        case 1:
          Square square = new Square();
          System.out.print("Enter value: ");
          Double value = Double.parseDouble(scanner.nextLine());
          square.calculatePerimeter(value);
          square.calculateArea(value);
          break;
        case 2:
          Circle circle = new Circle();
          System.out.print("Enter value: ");
          Double radius = Double.parseDouble(scanner.nextLine());
          circle.calculatePerimeter(radius);
          circle.calculateArea(radius);
          break;
        case 3:
          Rectangle rectangle = new Rectangle();
          System.out.print("Enter length: ");
          Double length = Double.parseDouble(scanner.nextLine());
          System.out.print("Enter width: ");
          Double width = Double.parseDouble(scanner.nextLine());
          rectangle.calculatePerimeter(width, length);
          rectangle.calculateArea(width, length);
          break;
        case 4:
          Triangle triangle = new Triangle();
          System.out.print("What to calculate?(P/A): ");
          String triangleCalc = scanner.nextLine();
          if (triangleCalc.equalsIgnoreCase("p")) {
            System.out.print("Enter side a: ");
            Double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter side b: ");
            Double b = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter side c: ");
            Double c = Double.parseDouble(scanner.nextLine());
            triangle.calculatePerimeter(a, b, c);
          } else if (triangleCalc.equalsIgnoreCase("a")) {
            System.out.print("Enter base: ");
            Double baseTriangle = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter height: ");
            Double heightTriangle = Double.parseDouble(scanner.nextLine());
            triangle.calculateArea(baseTriangle, heightTriangle);
          } else {
            System.out.println("Entered invalid output");
          }
          break;
        case 5:
          Parallelogram pgram = new Parallelogram();
          System.out.print("What to calculate?(P/A): ");
          String pCalc = scanner.nextLine();
          if (pCalc.equalsIgnoreCase("p")) {
            System.out.print("Enter side a: ");
            Double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter side b: ");
            Double b = Double.parseDouble(scanner.nextLine());
            pgram.calculatePerimeter(a, b);
          } else if (pCalc.equalsIgnoreCase("a")) {
            System.out.print("Enter base: ");
            Double basePgram = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter height: ");
            Double heightPgram = Double.parseDouble(scanner.nextLine());
            pgram.calculateArea(basePgram, heightPgram);
          } else {
            System.out.println("Entered invalid output");
          }
          break;
        case 6:
          Trapezoid trapezoid = new Trapezoid();
          System.out.print("What to calculate?(P/A): ");
          String trapezoidCalc = scanner.nextLine();
          if (trapezoidCalc.equalsIgnoreCase("p")) {
            System.out.print("Enter side a: ");
            Double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter side b: ");
            Double b = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter side c: ");
            Double c = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter side d: ");
            Double d = Double.parseDouble(scanner.nextLine());
            trapezoid.calculatePerimeter(a, b, c, d);
          } else if (trapezoidCalc.equalsIgnoreCase("a")) {
            System.out.print("Enter side b: ");
            Double b = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter side d: ");
            Double d = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter height: ");
            Double heightPgram = Double.parseDouble(scanner.nextLine());
            trapezoid.calculateArea(b, d, heightPgram);
          } else {
            System.out.println("Entered invalid output");
          }
          break;
        case 7:
          System.exit(0);
          break;
        default:
          System.out.println("Please enter an invalid choice. Try again");
      }

    }
  }

}
