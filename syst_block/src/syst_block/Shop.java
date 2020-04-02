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
public class Shop {
    private int i = 0;
    private Block[] o = {new Processor(), new MotherBoard(), new GraphicCard()};
    private Scanner scan = new Scanner(System.in);

  
        public void start() {
        while (i != 17) {
            try {
                System.out.println("Выберите действие");
                System.out.println("1.Что такое процессор");
                System.out.println("2.Что такое материнская плата");
                System.out.println("3.Что такое видеокарта");                
                System.out.println("4.Добавить процессор");
                System.out.println("5.Показать процессоры");
                System.out.println("6.Удалить все процессоры");
                System.out.println("7.Добавить материнскую плату");
                System.out.println("8.Показать  материнские платы");
                System.out.println("9.Удалить все материнские платы");
                System.out.println("10.Добавить видеокарту");
                System.out.println("11.Показать  видеокарты");
                System.out.println("12.Удалить все видеокарты");                
                System.out.println("13.Выход");
                i = scan.nextInt();
                switch (i) {
                    case 1:
                        o[0].getInfo();
                        break;
                    case 2:
                        o[1].getInfo();
                        break;
                    case 3:
                        o[2].getInfo();
                        break;                    
                    case 4:
                       o[0].Create();
                        break;
                    case 5:
                        o[0].Show();
                        ;
                        break;
                    case 6:
                        o[0] = new Processor();
                        System.out.println("Готово!");
                        break;
                    case 7:
                        o[1].Create();
                        break;
                    case 8:
                        o[1].Show();
                        ;
                        break;
                    case 9:
                        o[1] = new MotherBoard();
                        System.out.println("Готово!");
                        break;
                    case 10:
                        o[2].Create();
                        break;
                    case 11:
                        o[2].Show();
                        ;
                        break;
                    case 12:
                        o[2] = new GraphicCard();
                        System.out.println("Готово!");
                        break;                        
                    case 13:
                        System.out.println("Программа завершена");
                        break;
                    default:
                        System.out.println("Данного пункта не существует.");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Данного пунка не существует.");
                scan.next();

            }
        }
    }


}
