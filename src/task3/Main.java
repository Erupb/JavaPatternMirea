package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        SynchronizedSet<Integer> Set = new SynchronizedSet<>();
        SemaphoreMap<Integer> Map = new SemaphoreMap<>();
        ArrayList<Integer> unsafeList = new ArrayList<>(1000);
        HashSet<Integer> unsafeSet = new HashSet<>(1000);


        new Thread(() -> {
            for (int i = 0; i < 499; i++) {
                Set.add(i);
                Map.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 499; i < 1000; i++) {
                Set.add(i);
                Map.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);
            }
        }).start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SynchronizedSet size = " + Set.size());
        for (Integer integer : Set) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("SemaphoreMap size = " + Map.size());
        System.out.println();

        System.out.println("ArrayList size = " + unsafeList.size());
        System.out.println("HashSet size = " + unsafeSet.size());
    }


}
