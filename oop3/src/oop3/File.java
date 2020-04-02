/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

import java.io.*;

public class File {

    public static void saveFile(String path, StringTask obj) throws IOException {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(obj);
            oos.close();
    }

    public static StringTask openFile(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        StringTask obj = (StringTask) ois.readObject();
        ois.close();
        return obj;
    }
}
//c:/path/a.txt