/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btth2;

/**
 *
 * @author Hii
 */
import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        // Check if the sides form a valid triangle
        if (!isValidTriangle()) {
            System.out.println("Invalid triangle. Unable to calculate area.");
            return 0.0;
        }

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        // Check if the sides form a valid triangle
        if (!isValidTriangle()) {
            System.out.println("Invalid triangle. Unable to calculate perimeter.");
            return 0.0;
        }

        return side1 + side2 + side3;
    }

    // Method to check if the given sides form a valid triangle
    private boolean isValidTriangle() {
        // The sum of the lengths of any two sides of a triangle must be greater than the length of the third side
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}

public class BT1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for square
        System.out.println("Enter the length of the square side:");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Perimeter of square: " + square.calculatePerimeter());

        // Input for circle
        System.out.println("Enter the radius of the circle:");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

        // Input for rectangle
        System.out.println("Enter the length of the rectangle:");
        double rectangleLength = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());

        // Input for triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        double triangleSide1 = scanner.nextDouble();
        double triangleSide2 = scanner.nextDouble();
        double triangleSide3 = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);
        System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
    }
}