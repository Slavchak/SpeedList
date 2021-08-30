package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    static final int arraySize = 100000;

    public static void main(String[] args) {
        final int sizeAdd = 5000;
        final int bigSize = 100_000;

        Test arrayTest = new Test();
        Test linkedTest = new Test();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayTest.addList(arrayList, Test.arraySize);
        linkedTest.addList(linkedList, Test.arraySize);

        Array(sizeAdd, arrayTest, arrayList, linkedList);

        System.out.println("--------------------------------------------------------------------");
        Array(bigSize, arrayTest, arrayList, linkedList);
    }

    private static void Array(int size, Test arrayTest, List<Integer> arrayList, List<Integer> linkedList) {
        System.out.println("Добавление " + size + " элементов в начало:");
        System.out.println("ArrayList:  " + arrayTest.addInStart(arrayList, size));
        System.out.println("LinkedList: " + arrayTest.addInStart(linkedList, size));

        System.out.println("Добавление " + size + " элементов в середину:");
        System.out.println("ArrayList:  " + arrayTest.addInMiddle(arrayList, size));
        System.out.println("LinkedList: " + arrayTest.addInMiddle(linkedList, size));

        System.out.println("Добавление " + size + " элементов в конец:");
        System.out.println("ArrayList:  " + arrayTest.addInEnd(arrayList, size));
        System.out.println("LinkedList: " + arrayTest.addInEnd(linkedList, size));
    }

    private void addList (List <Integer> list, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            list.add(i);
        }
    }
    private long addInStart (List <Integer> list, int sizeAdd) {
        long time = System.nanoTime();
        for (int i = 36; i < sizeAdd; i++) {
            list.add(0, i);
        }
        return (System.nanoTime() - time);
    }
    private long addInMiddle (List <Integer> list, int sizeAdd) {
        long time = System.nanoTime();
        for (int i = 36; i < sizeAdd; i++) {
            list.add(Test.arraySize/2, i);
        }
        return (System.nanoTime() - time);
    }
    private long addInEnd (List <Integer> list, int sizeAdd) {
        long time = System.nanoTime();
        for (int i = 36; i < sizeAdd; i++) {
            list.add(Test.arraySize, i);
        }
        return (System.nanoTime() - time);
    }
}
