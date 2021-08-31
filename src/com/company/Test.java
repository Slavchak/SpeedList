package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Test<T extends Number> {
    static final int arraySize = 100000;

    public static void main(String[] args) {
        final int sizeAdd = 5000;
        final int bigSize = 100000;

        Test<Integer> arrayTest = new Test<>();
        Test<Integer> linkedTest = new Test<>();

        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayTest.addList(arrayList);
        linkedTest.addList(linkedList);

        arrayTest.Array(sizeAdd, arrayTest, arrayList, linkedList, 15);

        System.out.println("--------------------------------------------------------------------");
        linkedTest.Array(bigSize, arrayTest, arrayList, linkedList, 89);
    }

    private void Array(int size, Test<T> arrayTest, List<T> arrayList, LinkedList<T> linkedList, T element) {
        System.out.println("Добавление " + size + " элементов в начало:");
        System.out.println("ArrayList:  " + arrayTest.addInStart(arrayList, size, element));
        System.out.println("LinkedList: " + arrayTest.addInStart(linkedList, size, element));

        System.out.println("Добавление " + size + " элементов в середину:");
        System.out.println("ArrayList:  " + arrayTest.addInMiddle(arrayList, size, element));
        System.out.println("LinkedList: " + arrayTest.addInMiddle(linkedList, size, element));

        System.out.println("Добавление " + size + " элементов в конец:");
        System.out.println("ArrayList:  " + arrayTest.addInEnd(arrayList, size, element));
        System.out.println("LinkedList: " + arrayTest.linkAddInEnd(linkedList, size, element));

    }

    private <T> void addList(Collection<T> list) {
        for (int i = 0; i < Test.arraySize; i++) {
            list.add((T) Integer.valueOf(i));
        }
    }

    private long addInStart(List<T> list, int sizeAdd, T element) {
        long time = System.nanoTime();
        for (int i = 0; i < sizeAdd; i++) {
            list.add(0, element);
        }
        return (System.nanoTime() - time);
    }

    private long addInMiddle(List<T> list, int sizeAdd, T element) {
        long time = System.nanoTime();
        for (int i = 0; i < sizeAdd; i++) {
            list.add(Test.arraySize / 2, element);
        }
        return (System.nanoTime() - time);
    }

    private long addInEnd(List<T> list, int sizeAdd, T element) {
        long time = System.nanoTime();
        for (int i = 0; i < sizeAdd; i++) {
            list.add(Test.arraySize, element);
        }
        return (System.nanoTime() - time);
    }

    private long linkAddInEnd(LinkedList<T> list, int sizeAdd, T element) {
        long time = System.nanoTime();
        for (int i = 0; i < sizeAdd; i++) {
            list.addLast(element);
        }
        return (System.nanoTime() - time);
    }
}
