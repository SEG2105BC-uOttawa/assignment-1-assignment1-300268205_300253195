package code_part2;

import java.util.ArrayList;
import java.util.Vector;
//import java.util.Iterator;
import java.util.Random;

public class CollectionPerformance1 {
    public static void main(String[] args) {
        int collectionSize = 1000000;  // Adjust the collection size as needed

        // Construct ArrayList
        long arrayListStartTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
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

        // Print results
        System.out.println("Construction time for ArrayList: " + arrayListConstructionTime + " milliseconds");
        System.out.println("Construction time for Vector: " + vectorConstructionTime + " milliseconds");
        System.out.println("Construction time for array: " + arrayConstructionTime + " milliseconds");
    }
}