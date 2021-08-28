package com.company;

import java.util.LinkedList;
import java.util.List;

public class LinkedTest {
    public void main() {
        final int linkedListSize = 100000;
        final int minSize = 5000;
        final int maxSize = 100000;
        List<Integer> linkedListMin = new LinkedList<>();
        List<Integer> linkedListMax = new LinkedList<>();

        for (int i = 0; i < linkedListSize; i++) {
            linkedListMin.add(i);
            linkedListMax.add(i);
        }

        System.out.println("LinkedList");
        System.out.println("Добавление 5000 элементов:");
        long time = System.nanoTime();
        for (int i = 36; i < minSize; i++) {
            linkedListMin.add(0, i);
        }
        System.out.println("В начало:   " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < minSize; i++) {
            linkedListMin.add(linkedListSize / 2, i);
        }
        System.out.println("В середину: " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < minSize; i++) {
            linkedListMin.add(linkedListSize, i);
        }
        System.out.println("В конец:    " + (System.nanoTime() - time));

        System.out.println("Добавление 100.000 элементов:");
        time = System.nanoTime();
        for (int i = 46; i < maxSize; i++) {
            linkedListMax.add(0, i);
        }
        System.out.println("В начало:   " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < maxSize; i++) {
            linkedListMax.add(linkedListSize / 2, i);
        }
        System.out.println("В середину: " + (System.nanoTime() - time));

        time = System.nanoTime();
        for (int i = 36; i < maxSize; i++) {
            linkedListMax.add(linkedListSize, i);
        }
        System.out.println("В конец:    " + (System.nanoTime() - time));

    }
}
