package syst_block;
import java.util.Scanner;
public abstract class Block {
    Scanner scan = new Scanner(System.in);
    protected String info = "";
    protected String name;
    protected double cost;
    public Block(){
        this.setName();
        this.setCost();
    }
    public void setName(){
        System.out.println("Введите название");
        name=scan.nextLine();
    }
    public String getName(){
        return name;
    }
    public void setCost(){
        System.out.println("Введите стоимость товара");
        cost=scan.nextDouble();
    }
    public double getCost(){
        return cost;
    }
    public abstract void getInfo();
}
