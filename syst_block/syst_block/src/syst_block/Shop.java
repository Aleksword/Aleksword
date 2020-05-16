package syst_block;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private int i = 0;
    private String choice;
    private String repeat = "Y";
    private int count, ch;
    private ArrayList<Processor> p = new ArrayList<Processor>();
    private ArrayList<MotherBoard> m = new ArrayList<MotherBoard>();
    private ArrayList<GraphicCard> g = new ArrayList<GraphicCard>();
    private Scanner scan = new Scanner(System.in);

    public void repeat() {
        System.out.println("Выполнить ещё раз? [Y]/[N]");
        repeat = scan.nextLine();
        switch (repeat) {
            case "Y":
                repeat = "Y";
                break;
            case "N":
                repeat = "N";
                break;
            default:
                System.out.println("Ошибка. Введите значение заново");
                repeat();
                break;
        }
    }

    public void start() {
        while (i != 10 && repeat == "Y") {
            try {
                System.out.println("Выберите действие");
                System.out.println("1.Добавить процессор");
                System.out.println("2.Показать процессоры");
                System.out.println("3.Удалить все процессоры");
                System.out.println("4.Добавить материнскую плату");
                System.out.println("5.Показать  материнские платы");
                System.out.println("6.Удалить все материнские платы");
                System.out.println("7.Добавить видеокарту");
                System.out.println("8.Показать  видеокарты");
                System.out.println("9.Удалить все видеокарты");
                System.out.println("10.Выход");
                i = scan.nextInt();
                switch (i) {
                    case 1:
                        p.add(new Processor());
                        repeat = scan.nextLine();
                        repeat();
                        break;
                    case 2:
                        System.out.println("Процессоры:");
                        for (Processor proc : p) {
                            proc.getInfo();
                        }
                        repeat = scan.nextLine();
                        repeat();
                        break;
                    case 3:
                        p.clear();
                        repeat = scan.nextLine();
                        System.out.println("Готово!");
                        repeat();
                        break;

                    case 4:
                        m.add(new MotherBoard());
                        repeat = scan.nextLine();
                        repeat();
                        break;
                    case 5:
                        System.out.println("Материнские платы:");
                        for (MotherBoard mompls : m) {
                            mompls.getInfo();
                        }
                        repeat = scan.nextLine();
                        repeat();
                        break;
                    case 6:
                        m.clear();
                        repeat = scan.nextLine();
                        System.out.println("Готово!");
                        repeat();
                        break;

                    case 7:
                        g.add(new GraphicCard());
                        repeat = scan.nextLine();
                        repeat();
                        break;
                    case 8:
                        System.out.println("Видеокарты:");
                        for (GraphicCard gc : g) {
                            gc.getInfo();
                        }
                        repeat = scan.nextLine();
                        repeat();
                        break;
                    case 9:
                        g.clear();
                        repeat = scan.nextLine();
                        System.out.println("Готово!");
                        repeat();
                        break;

                    case 10:
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
