package ua.com.alevel;

import ua.com.alevel.Entity.Pesel;
import ua.com.alevel.operations.Operation;
import ua.com.alevel.read.WczytajPesele;
import ua.com.alevel.write.NapiczPessel;

public class MainClass {
    public static void main(String[] args) {

        Pesel pesel = new Pesel();
        pesel.setWartocz("12051578911");
        NapiczPessel.napiczPessel(pesel);
        pesel.setWartocz("99051578911");
        NapiczPessel.napiczPessel(pesel);
        System.out.println(WczytajPesele.read());
        Operation.ileOsob(WczytajPesele.read());


    }
}
