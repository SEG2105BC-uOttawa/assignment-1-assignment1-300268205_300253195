import design2.PointCP2;
import design3.PointCP3;

public class PerformanceTester {

    public static void main(String[] args) {
        final int NUM_ITERATIONS = 100000;  // Number of iterations for performance testing

        // Initialize PointCP2 and PointCP3 instances and set up data for testing
        PointCP2[] points2 = new PointCP2[NUM_ITERATIONS];
        PointCP3[] points3 = new PointCP3[NUM_ITERATIONS];

        for (int i = 0; i < NUM_ITERATIONS; i++) {
            double radius = Math.random() * 100;  // Random radius (for example)
            double angle = Math.random() * Math.PI * 2;  // Random angle (for example)
            points2[i] = new PointCP2(radius, angle);

            double x = Math.random() * 100;  // Random x (for example)
            double y = Math.random() * 100;  // Random y (for example)
            points3[i] = new PointCP3(x, y);
        }

        // Measure execution time for getX method for PointCP2 and PointCP3 and print results
        long[] executionTimes2 = new long[NUM_ITERATIONS];
        long[] executionTimes3 = new long[NUM_ITERATIONS];

        for (int i = 0; i < NUM_ITERATIONS; i++) {
            // Measure execution time for PointCP2.getX()
            long startTime2 = System.nanoTime();
            points2[i].getRho();
            long endTime2 = System.nanoTime();
            executionTimes2[i] = endTime2 - startTime2;

            // Measure execution time for PointCP3.getX()
            long startTime3 = System.nanoTime();
            points3[i].getX();
            long endTime3 = System.nanoTime();
            executionTimes3[i] = endTime3 - startTime3;
        }

        // Calculate median, maximum, and minimum execution times for PointCP2.getX()
        long medianTime2 = executionTimes2[NUM_ITERATIONS / 2];
        long maxTime2 = getMax(executionTimes2);
        long minTime2 = getMin(executionTimes2);

        System.out.println("Performance Test Results for Design 2 (getX method):");
        System.out.println("Median Time (ns): " + medianTime2);
        System.out.println("Maximum Time (ns): " + maxTime2);
        System.out.println("Minimum Time (ns): " + minTime2);

        // Calculate median, maximum, and minimum execution times for PointCP3.getX()
        long medianTime3 = executionTimes3[NUM_ITERATIONS / 2];
        long maxTime3 = getMax(executionTimes3);
        long minTime3 = getMin(executionTimes3);

        System.out.println("\nPerformance Test Results for Design 3 (getX method):");
        System.out.println("Median Time (ns): " + medianTime3);
        System.out.println("Maximum Time (ns): " + maxTime3);
        System.out.println("Minimum Time (ns): " + minTime3);
    }

    private static long getMax(long[] arr) {
        long max = Long.MIN_VALUE;
        for (long val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    private static long getMin(long[] arr) {
        long min = Long.MAX_VALUE;
        for (long val : arr) {
            if (val < min) min = val;
        }
        return min;
    }
}