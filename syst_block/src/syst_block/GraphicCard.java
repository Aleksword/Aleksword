/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst_block;

import java.util.Scanner;

/**
 *
 * @author aleksword
 */
public class GraphicCard extends Block {
        private int i=0;
    private String[] Mammal=new String[35];
     Scanner scan=new Scanner(System.in);
    


    @Override
    public void getInfo() {
        info="Видеока́рта (также видеоада́птер, графический ада́птер, графи́ческая пла́та, графи́ческая ка́рта, графи́ческий ускори́тель) — устройство, преобразующее графический образ, хранящийся как содержимое памяти компьютера (или самого адаптера), в форму, пригодную для дальнейшего вывода на экран монитора. Первые мониторы, построенные на электронно-лучевых трубках, работали по телевизионному принципу сканирования экрана электронным лучом, и для отображения требовался видеосигнал, генерируемый видеокартой. ";
        System.out.println(info);
    }
    
    
    @Override
    public void Create(){
        if (i<10){
        System.out.println("Введите название видеокарт");
                Mammal[i]=scan.nextLine();
        i++; 
    }
        else{
            System.out.println("Создано максимальное количество видеокарт");
        }
    }
    
    @Override
    public void Show(){
        if (i>0) {
            for (int j=0;j<i;j++) {
                System.out.println(Mammal[j]);
            }
        }
        else {
            System.out.println("Видеокарт в магазине нет");
        }
    } 

    
}
