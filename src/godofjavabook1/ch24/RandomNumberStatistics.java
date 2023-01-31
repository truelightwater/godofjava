package godofjavabook1.ch24;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    Random random = new Random();
    private final int DATA_BOUNDARY = 50;

    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();
    }

    public void getRandomNumberStatistics() {
        int count = DATA_BOUNDARY * 100;
        for (int loop = 0; loop < count; loop++) {
            int temp = random.nextInt(DATA_BOUNDARY)+1;
            putCurrentNumber(temp);
        }
        printStatistics();
    }

    public void putCurrentNumber(int temp) {
        if (!hashtable.containsKey(temp)) {
            hashtable.put(temp, 1);
        } else {
            hashtable.put(temp, hashtable.get(temp) + 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keySet = hashtable.keySet();
        for (int key : keySet) {
            int count = hashtable.get(key);
            System.out.print(key+ "=" +count+ "\t");
            if (key % 10 - 1 == 0) {
                System.out.println();
            }
        }
    }
}
