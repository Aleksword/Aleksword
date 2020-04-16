/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst_block;

import java.util.Scanner;

public class MotherBoard extends Block {
    private String name;
    Scanner scan = new Scanner(System.in);

    @Override
    public void getInfo() {
               System.out.println(name);
    }
    public MotherBoard(){
        System.out.println("Название материнской платы");
        name=scan.nextLine();
    }           
}

