package javaapplication2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        // первое задание
        myChis chis = new myChis();
        System.out.println("Множество " + (chis.check(chis.getarr()) == 1 ? "упорядочено по возрастанию"
                : chis.check(chis.getarr()) == -1 ? "упорядочено по убыванию" : "не упорядочено"));
        System.out.println("_________________________________________________________________________________________________");

        // второе задание
        myString a = new myString("один два три четыре пять шесть семь восемь девять десять");
        String[] string_sort = a.sort2();
        System.out.println("Исходная строка: " + a.getStr());
        System.out.print("Отсортированная строка: ");
        for (String s : string_sort) {
            System.out.print(s + " ");
        }
        System.out.println("\n_________________________________________________________________________________________________");

        // третье задание
        myString b = new myString("шабаш у городадорог, казак загляделся на  мадам");
        String[] search = b.lul();
        System.out.println("Исходная строка: " + b.getStr());
        System.out.print("Палиндромы: ");
        for (String s : search) {
            System.out.print(s + ", ");
        }
        System.out.println("\n_________________________________________________________________________________________________");
    }
}
