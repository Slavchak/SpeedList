package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

    public void main() {
        final int arraySize = 100000;
        final int minSize = 5000;
        final int maxSize = 100000;
        List<Integer> arrayListMin = new ArrayList<>(arraySize);
        List<Integer> arrayListMax = new ArrayList<>(arraySize);

        for (int i = 0; i < arraySize; i++) {
            arrayListMin.add(i);
            arrayListMax.add(i);
        }

        System.out.println("ArrayList");
        System.out.println("Добавление 5000 элементов:");
        long time = System.nanoTime();
        for (int i = 36; i < minSize; i++) {
            arrayListMin.add(0, i);
        }
        System.out.println("В начало:   " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < minSize; i++) {
            arrayListMin.add(arraySize / 2, i);
        }
        System.out.println("В середину: " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < minSize; i++) {
            arrayListMin.add(arraySize, i);
        }
        System.out.println("В конец:    " + (System.nanoTime() - time));

        System.out.println("Добавление 100.000 элементов:");
        time = System.nanoTime();
        for (int i = 46; i < maxSize; i++) {
            arrayListMax.add(0, i);
        }
        System.out.println("В начало:   " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < maxSize; i++) {
            arrayListMax.add(arraySize / 2, i);
        }
        System.out.println("В середину: " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < maxSize; i++) {
            arrayListMax.add(arraySize, i);
        }
        System.out.println("В конец:    " + (System.nanoTime() - time));

    }
}
