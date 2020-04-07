/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

import java.io.Serializable;
import java.util.Arrays;

public class StringTask implements Serializable {

    private String vvod;
    private String[] str;

    private StringTask() {
    } // пустой конструктор, нельзя вызвать вне класса

    public StringTask(String s) { // конструктор
        vvod = s;
        str = stringToArray(s);
    }

    public StringTask(StringTask obj) { // конструктор копирования
        vvod = obj.vvod;
        str = Arrays.copyOf(obj.str, obj.str.length);
    }

    public String getStr() {
        return vvod;
    }

    public String[] getArray() {
        return str;
    }

    public String[] sortStr() { // сортировка по третьей или последней букве(2 задание)
        String[] result = Arrays.copyOf(str, str.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (sortChar(result[i], result[j])) {
                    String temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public String[] findPalindrome() { // возвращает массив палиндромов(3 задание)
        String res = "";
        for (String s : str) {
            if (isPalindrome(s)) {
                res += s + " ";
            }
        }
        return (String[]) res.split(" ");
    }

    private Boolean sortChar(String first, String second) { // сравнение слов по третьей или последней букве
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

    private String reverseString(String s) { // переварачивает строку
        String r = "";
        for (int t = s.length() - 1; t >= 0; --t) {
            r += s.charAt(t);
        }
        return r;
    }

    private Boolean isPalindrome(String word) {
        return word.equals(reverseString(word));
    }

    private String[] stringToArray(String s) { // преобразует строку в массив слов
        return s.split("[/., ]+");
    }

}
