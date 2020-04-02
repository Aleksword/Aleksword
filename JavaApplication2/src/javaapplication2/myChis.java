package javaapplication2;

public class myChis {
    public static int check(int[] array) { // проверка на упорядоченность(1 задание)
        boolean Dead = false;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) {
                break;
            }
            if (i == array.length-2) Dead = true;
        }
        if (Dead) {
            return 1; // упорядочен по возростанию
        }
        else {
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] < array[i+1]){
                    break;
                }
                if (i == array.length-2) Dead = true;
            }
            return Dead ? -1 : 0; // -1 - упорядочен по убыванию; 0 - не упордочен
        }
    }
}
