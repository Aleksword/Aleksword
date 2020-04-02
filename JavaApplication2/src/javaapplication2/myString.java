package javaapplication2;

import java.util.Arrays;
import java.util.Scanner;
public class myString {

    private String vvod;
    private String[] words;

    private myString() {} // пустой конструктор, нельзя вызвать вне класса

    public myString(String comp1) { // конструктор
        vvod = comp1;
        words = inside(comp1); //строка в массив
    }

    public myString(myString obj) { // конструктор копирования
        vvod = obj.vvod;
        words = obj.words;
    }

    public String getStr() { //метод дает доступ к полю vvod
        return vvod;
    }


    public String[] sort2() { // сортировка по третьей или последней букве(2 задание)
        String[] result = Arrays.copyOf(words, words.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (kekw(result[i], result[j])) {
                    String temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public String[] lul() { // возвращает массив палиндромов(3 задание)
        String stroka = "";
        for (String s : words) {
            if (islul(s)) {
                stroka += s + " ";
            }
        }
        return (String []) stroka.split(" ");
    }

    private Boolean kekw(String first, String second) { // сравнение слов по третьей или последней букве
        char a = ' ';
        char b = ' ';
        if (first.length() >= 3 && second.length() >= 3) {
            a = first.charAt(2);
            b = second.charAt(2);
        } else if (first.length() < 3 && second.length() < 3) {
            a = first.charAt(first.length() - 1);
            b = second.charAt(second.length() - 1);
        } else if (first.length() < 3 && second.length() >= 3) {
            a = first.charAt(first.length() - 1);
            b = second.charAt(2);
        } else if (first.length() >= 3 && second.length() < 3) {
            a = first.charAt(2);
            b = second.charAt(second.length() - 1);
        }
        return a > b;
    }

    private String viceversa(String s) { // переварачивает слово
        String word = "";
        for (int t = s.length() - 1; t >= 0; --t) {
            word += s.charAt(t);
        }
        return word;
    }

    private Boolean islul(String word) {
        return word.equals(viceversa(word));
    }

    private String[] inside(String s) { // преобразует строку в массив слов
        return s.split("[/., ]+");
    }
}
