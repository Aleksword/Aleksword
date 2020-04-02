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
public class Processor extends Block {
    private int i=0;
    private String[] Cpu=new String[35];
    Scanner scan=new Scanner(System.in);
    @Override
    public void getInfo() {
         info = "Центра́льный проце́ссор (ЦП; также центра́льное проце́ссорное устро́йство — ЦПУ; англ. central processing unit, CPU, дословно — центральное обрабатывающее устройство) — электронный блок, либо интегральная схема (микропроцессор), исполняющая машинные инструкции (код программ), главная часть аппаратного обеспечения компьютера или программируемого логического контроллера. Иногда называют микропроцессором или просто процессором.";
        System.out.println(info);
    }
    
    @Override
    public void Create(){
        if (i<10){
        System.out.println("Введите модель процессора");
                Cpu[i]=scan.nextLine();
        i++; 
    }
        else{
            System.out.println("Создано максимальное количество вариантов процессора");
        }
    }
    
    @Override
    public void Show(){
        if (i>0) {
            for (int j=0;j<i;j++) {
                System.out.println(Cpu[j]);
            }
        }
        else {
            System.out.println("таких моделей в наличии нет");
        }
    }

    

}
