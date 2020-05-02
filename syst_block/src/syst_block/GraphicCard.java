package syst_block;
import java.util.Scanner;
public class GraphicCard extends Block {
    Scanner scan = new Scanner(System.in);
    private String typemem;
    public GraphicCard(){
        this.setTypemem();
    }
    public void setTypemem(){
        System.out.println("Введите тип видеопамяти вашей видео карты");
        typemem=scan.nextLine();
    }
    public String getTypemem(){
        return typemem;
    }
    @Override
    public void getInfo() {
        name += ", Тип видеопамяти "+typemem+", Стоимость " +cost;
        System.out.println(name);
    }
}
