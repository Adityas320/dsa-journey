import java.util.Scanner;
public class geometryprograms {
    // area of circle
        public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    // area of triangle
    public static double areaOfTriangle(double base, double height) { 
        return (base * height) / 2;
    }
    // Area of Rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // Area of Isosceles Triangle
    public static double areaOfIsoscelesTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of Parallelogram
    public static double areaOfParallelogram(double base, double height) {
        return base * height;
    }

    // Area of Rhombus
    public static double areaOfRhombus(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    // Area of Equilateral Triangle
    public static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // Perimeter (Circumference) of Circle
    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    // Perimeter of Equilateral Triangle
    public static double perimeterOfEquilateralTriangle(double side) {
        return 3 * side;
    }

    // Perimeter of Parallelogram
    public static double perimeterOfParallelogram(double base, double side) {
        return 2 * (base + side);
    }

    public static void main(String args[]) {

    }
}
