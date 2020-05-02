package syst_block;
import java.util.Scanner;

public class MotherBoard extends Block {
    Scanner scan = new Scanner(System.in);
    private String prod;
    public MotherBoard(){
        this.setProd();
    }
    public void setProd(){
        System.out.println("Введите производителя вашей метринской платы");
        prod=scan.nextLine();
    }
    @Override
    public void getInfo() {
        name += ", Производитель "+prod+", Стоимость " +cost;
        System.out.println(name);
    }
}

