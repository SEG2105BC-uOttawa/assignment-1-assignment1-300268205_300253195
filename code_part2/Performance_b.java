package code_part2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Performance_b {
    // ... (previous code)

    public static void main(String[] args) {
        // ... (previous code)
        // Construct ArrayList
        long arrayListStartTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        int collectionSize = 10; // initialize collectionSize to a value

        for (int i = 0; i < collectionSize; i++) {
            arrayList.add(random.nextInt(10));
        }
        long arrayListEndTime = System.currentTimeMillis();
        long arrayListConstructionTime = arrayListEndTime - arrayListStartTime;

        // Construct Vector
        long vectorStartTime = System.currentTimeMillis();
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < collectionSize; i++) {
            vector.add(random.nextInt(10));
        }
        long vectorEndTime = System.currentTimeMillis();
        long vectorConstructionTime = vectorEndTime - vectorStartTime;

        // Construct array
        long arrayStartTime = System.currentTimeMillis();
        int[] array = new int[collectionSize];
        for (int i = 0; i < collectionSize; i++) {
            array[i] = random.nextInt(10);
        }
        long arrayEndTime = System.currentTimeMillis();
        long arrayConstructionTime = arrayEndTime - arrayStartTime;

        // Sum elements using Iterator for ArrayList
        long arrayListIterationStartTime = System.currentTimeMillis();
        int sumArrayList = sumElementsWithIterator(arrayList);
        System.out.println("Sum of elements in ArrayList: " + sumArrayList);
        long arrayListIterationEndTime = System.currentTimeMillis();
        long arrayListIterationTime = arrayListIterationEndTime - arrayListIterationStartTime;

        // Sum elements using Iterator for Vector
        long vectorIterationStartTime = System.currentTimeMillis();
        sumElementsWithIterator(vector);
        long vectorIterationEndTime = System.currentTimeMillis();
        long vectorIterationTime = vectorIterationEndTime - vectorIterationStartTime;

        // Sum elements using for loop for array
        long arrayIterationStartTime = System.currentTimeMillis();
        sumElementsWithForLoop(array);
        long arrayIterationEndTime = System.currentTimeMillis();
        long arrayIterationTime = arrayIterationEndTime - arrayIterationStartTime;

        // Subtract construction time from iteration time
        long arrayListTotalTime = arrayListIterationTime - arrayListConstructionTime;
        long vectorTotalTime = vectorIterationTime - vectorConstructionTime;
        long arrayTotalTime = arrayIterationTime - arrayConstructionTime;

        // Print results
        System.out.println("Total time for ArrayList iteration: " + arrayListTotalTime + " milliseconds");
        System.out.println("Total time for Vector iteration: " + vectorTotalTime + " milliseconds");
        System.out.println("Total time for array iteration: " + arrayTotalTime + " milliseconds");
    }

    private static int sumElementsWithIterator(Iterable<Integer> collection) {
        int sum = 0;
        for (int num : collection) {
            sum += num;
        }
        return sum;
    }

    private static int sumElementsWithForLoop(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
