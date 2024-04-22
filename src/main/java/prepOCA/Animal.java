package prepOCA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Animal {
    public static void main(String[] args){
        new Animal().writeToFile();
    }

    public void writeToFile(){
        File file = new File("Write.txt");

        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("Hello World!");
            pw.close();
        }catch(IOException e){
            System.out.println("Unable to write to the file at this time.");
        }
    }
}
