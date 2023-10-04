import design2.PointCP2;
import design3.PointCP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointCPTest {
    public static void main(String[] args) {
        System.out.println("Cartesian-Polar Coordinates Conversion Program");

        PointCP2 pointCP2 = getInputForPolarCoordinates();
        PointCP3 pointCP3 = getInputForCartesianCoordinates();

        System.out.println("\nYou entered (Polar):\n" + pointCP2);
        pointCP2.convertStorageToCartesian();
        System.out.println("\nAfter asking to store as Cartesian:\n" + pointCP2);

        System.out.println("\nYou entered (Cartesian):\n" + pointCP3);
        pointCP3.convertStorageToPolar();
        System.out.println("\nAfter asking to store as Polar:\n" + pointCP3);
    }

    private static PointCP2 getInputForPolarCoordinates() {
        double radius = getDoubleInput("Enter the value of Rho using a decimal point(.): ");
        double angle = getDoubleInput("Enter the value of Theta using a decimal point(.): ");

        return new PointCP2(radius, angle);
    }

    private static PointCP3 getInputForCartesianCoordinates() {
        double x = getDoubleInput("Enter the value of X using a decimal point(.): ");
        double y = getDoubleInput("Enter the value of Y using a decimal point(.): ");

        return new PointCP3(x, y);
    }

    private static double getDoubleInput(String message) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double input = 0.0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(message);
                String inputStr = reader.readLine();
                input = Double.parseDouble(inputStr);
                isValid = true;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid double value.");
            }
        }

        return input;
    }
}