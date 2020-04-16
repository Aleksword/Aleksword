package syst_block;
import java.util.Scanner;
public class GraphicCard extends Block {
    Scanner scan = new Scanner(System.in);
    private String name;
   @Override
    public void getInfo() {
               System.out.println(name);
    }
    public GraphicCard(){
        System.out.println("Название видеокарты");
        name=scan.nextLine();
    }           
}
