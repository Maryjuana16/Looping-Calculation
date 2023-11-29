/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ken;

import java.util.Scanner;

public class Ken {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Which calculation would you like?");
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Check Odd/Even");
            System.out.println("3. Trigonometric Functions");
            System.out.println("4. Area Calculation");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    temperatureConversion(scanner);
                    break;
                case 2:
                    checkOddEven(scanner);
                    break;
                case 3:
                    trigonometricFunctions(scanner);
                    break;
                case 4:
                    calculateArea(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println("Do you want to do another calculation? (yes/no)");
            if (!scanner.next().equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    private static void temperatureConversion(Scanner scanner) {
        System.out.println("Choose temperature scale to convert:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Kelvin to Fahrenheit");
        System.out.println("6. Fahrenheit to Kelvin");

        int choice = scanner.nextInt();
        double temperature;

        switch (choice) {
            case 1:
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                break;
            case 2:
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                break;
            case 3:
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 4:
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature));
                break;
            case 5:
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            case 6:
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private static void checkOddEven(Scanner scanner) {
        System.out.println("Enter a number to check if it's odd or even:");
        int number = scanner.nextInt();
        System.out.println(number + (number % 2 == 0 ? " is even." : " is odd."));
    }

    private static void trigonometricFunctions(Scanner scanner) {
        System.out.println("Choose trigonometric function:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");

        int choice = scanner.nextInt();
        double angle = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Sin(" + angle + ") = " + Math.sin(Math.toRadians(angle)));
                break;
            case 2:
                System.out.println("Cos(" + angle + ") = " + Math.cos(Math.toRadians(angle)));
                break;
            case 3:
                System.out.println("Tan(" + angle + ") = " + Math.tan(Math.toRadians(angle)));
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private static void calculateArea(Scanner scanner) {
        System.out.println("Choose polygon to calculate area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double side = scanner.nextDouble();
                System.out.println("Area of the square: " + squareArea(side));
                break;
            case 2:
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.println("Area of the rectangle: " + rectangleArea(length, width));
                break;
            case 3:
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + triangleArea(base, height));
                break;
            case 4:
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + circleArea(radius));
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    private static double squareArea(double side) {
        return side * side;
    }

    private static double rectangleArea(double length, double width) {
        return length * width;
    }

    private static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    private static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
