package ua.com.alevel.read;

import ua.com.alevel.util.FilePlace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WczytajPesele {
    public static ArrayList<String> read() {
        ArrayList<String> arrayPesels = new ArrayList<String>();

        try {
            File file = new File(FilePlace.absolutePath);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                arrayPesels.add(line);
                //System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayPesels;

    }
}

