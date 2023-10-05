package design2;

import java.util.Scanner;

public class PointCP2Test {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of rho: ");
            double rho = scanner.nextDouble();

            System.out.print("Enter the value of theta (in radians): ");
            double theta = scanner.nextDouble();

            // Create a point using the provided values
            PointCP2 point = new PointCP2(rho, theta);

            // Display the point's coordinates
            System.out.println("Point coordinates: " + point);
        }
    }
}