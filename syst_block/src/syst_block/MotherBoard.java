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
public class MotherBoard extends Block{    private int i=0;
    private String[] mompls=new String[35];
    Scanner scan=new Scanner(System.in);

    @Override
    public void getInfo() {
         info = "Матери́нская (систе́мная) пла́та (от англ. motherboard, MB или англ. mainboard — главная плата), (в просторечии: материнка, мать и т. п.) — печатная плата, являющаяся основой построения модульного устройства, например — компьютера.\n" +
"\n" +
"Материнская плата содержит основную часть устройства, дополнительные же или взаимозаменяемые платы называются дочерними или платами расширений.";
         System.out.println(info);
    }
    
    @Override
    public void Create(){
        if (i<10){
        System.out.println("Введите модель материнской платы:");
                mompls[i]=scan.nextLine();
        i++; 
    }
        else{
            System.out.println("Создано максимальное количество материнских плат");
        }
    }
    
    @Override
    public void Show(){
        if (i>0) {
            for (int j=0;j<i;j++) {
                System.out.println(mompls[j]);
            }
        }
        else {
            System.out.println("Материнскх плат в магазине нет");
        }
    }

    
}
