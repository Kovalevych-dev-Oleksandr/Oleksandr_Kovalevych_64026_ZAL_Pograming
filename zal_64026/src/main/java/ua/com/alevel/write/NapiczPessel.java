package ua.com.alevel.write;

import ua.com.alevel.Entity.Pesel;
import ua.com.alevel.util.FilePlace;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class NapiczPessel {
    public static void napiczPessel(Pesel pesel) {

        try(FileWriter writer = new FileWriter(FilePlace.absolutePath, true))
        {

            // запись всей строки
            writer.write(pesel.getWartocz());
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The Pesel has been written");
    }
}