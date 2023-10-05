package design3;

import java.util.Scanner;

public class PointCP3Test {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();

            System.out.print("Enter the value of y: ");
            double y = scanner.nextDouble();

            PointCP3 point = new PointCP3(x, y);

            System.out.println("Point coordinates: " + point);
        }
    }
}