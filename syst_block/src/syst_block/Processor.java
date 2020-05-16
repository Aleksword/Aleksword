package syst_block;
import java.util.Scanner;
public class Processor extends Block {
    Scanner scan = new Scanner(System.in);
    private String chipset;
    public Processor(){
        this.setChipset();
    }           
       public void setChipset(){
           System.out.println("Введите чипсет, на котором работает ваш процессор");
           chipset=scan.nextLine();
    }
    public String getChipset(){
        return chipset;
    }
    public void getInfo() {
        name += ", Чипсет "+chipset+", Стоимость " +cost;
        System.out.println(name);
    }
}
