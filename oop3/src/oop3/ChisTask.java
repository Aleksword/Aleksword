package oop3;

import java.util.Scanner;

public class ChisTask {

    private String[] input;
    private int size;
    private int[] arr;

    public ChisTask() {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите несколько чисел через пробел: ");
        input = vvod.nextLine().split(" ");
        size = input.length;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.valueOf(input[i]);
        }
    }

    public int[] getarr() {
        return arr;
    }

    public int check(int[] array) { // проверка на упорядоченность(1 задание)
        boolean Dead = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                break;
            }
            if (i == array.length - 2) {
                Dead = true;
            }
        }
        if (Dead) {
            return 1; // упорядочен по возростанию
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    break;
                }
                if (i == array.length - 2) {
                    Dead = true;
                }
            }
            return Dead ? -1 : 0; // -1 - упорядочен по убыванию; 0 - не упордочен
        }
    }
}
