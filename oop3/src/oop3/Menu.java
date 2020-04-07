/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    private Menu() {
    }

    private static StringTask obj;

    public static Scanner inp = new Scanner(System.in);

    public static void mainMenu() {  //вызывается файлом

        while (true) {
            System.out.println("\nМеню:\n"
                    + "1.Работа с числами\n"
                    + "2.Работа со строками\n"
                    + "3.Выход\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                    + "Введите номер пункта меню: ");
            switch (inp.nextLine()) {
                case "1":
                    Menu.intOrder();
                    break;
                case "2":
                    Menu.stringWork();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод!!");
            }
        }

    }

    private static void stringWork() {
        while (true) {
            System.out.println("\nМеню работы со строками:\n"
                    + "1.Создать строку\n"
                    + "2.Открыть файл\n"
                    + "3.Вернуться в главное меню\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                    + "Введите номер пункта меню: ");
            switch (inp.nextLine()) {
                case "1":
                    System.out.println("Введите строку: ");
                    obj = new StringTask(inp.nextLine());
                    System.out.println("Вы хотите сохранить строку? (Yes / No): ");
                    switch (inp.nextLine().toLowerCase()) {
                        case "yes":
                            System.out.println("Введите путь файла: ");
                            try {
                                File.saveFile(inp.nextLine(), obj);
                                Menu.stringTask();
                            } catch (IOException e) {
                                System.out.println("Неверный путь!!");
                            }
                            break;
                        case "no":
                            Menu.stringTask();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Введите путь файла: ");
                    try {
                        obj = File.openFile(inp.nextLine());
                        Menu.stringTask();
                    } catch (IOException e) {
                        System.out.println("Неверный путь!!");
                    } catch (ClassNotFoundException e) {
                        System.out.println("Неверный файл!!");
                    }
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Неверный ввод!!");
            }
        }
    }

    private static void stringTask() {
        while (true) {
            System.out.println("\nМеню работы со строками:\n"
                    + "1.Сортировка слов\n"
                    + "2.Поиск полиндромов\n"
                    + "3.Вернуться в меню создания строки\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                    + "Введите номер пункта меню: ");
            switch (inp.nextLine()) {
                case "1":
                    String[] string_sort = obj.sortStr();
                    System.out.println("Исходная строка: " + obj.getStr());
                    System.out.print("Отсортированная строка: ");
                    for (String s : string_sort) {
                        System.out.print(s + " ");
                    }
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case "2":
                    String[] string_polindrome = obj.findPalindrome();
                    System.out.println("Исходная строка: " + obj.getStr());
                    System.out.print("Палиндромы: ");
                    for (String s : string_polindrome) {
                        System.out.print(s + " ");
                    }
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case "3":

                    return;
                default:
                    System.out.println("Неверный ввод!!");
            }
        }
    }

    private static void intOrder() {
        int[] arr = new int[0];
        System.out.println("Введите числа через пробел: ");
        try {
            ChisTask chis = new ChisTask();
            System.out.println("Множество " + (chis.check(chis.getarr()) == 1 ? "упорядочено по возрастанию"
                    : chis.check(chis.getarr()) == -1 ? "упорядочено по убыванию" : "не упорядочено"));
            System.out.println("_________________________________________________________________________________________________");
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } catch (Exception e) {
            System.out.println("Неверный ввод!!");
        }
    }

}
