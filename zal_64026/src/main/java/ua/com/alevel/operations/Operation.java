package ua.com.alevel.operations;

import java.util.ArrayList;

public class Operation {
    public static void ileOsob(ArrayList<String> arrayPesels) {
        ArrayList<String> stringArrayList=new ArrayList<String>();
        int j=0;
        for (int i = 0; i < arrayPesels.size(); i++) {
            if (getMonthAndDay(arrayPesels.get(i)).equals("0515")) {
                stringArrayList.add(arrayPesels.get(i));
            }
        }
        System.out.println(stringArrayList);
    }

    private static String getMonthAndDay(String line) {
        String monthAndDay = line.substring(2,6);
        return monthAndDay;
    }
}
