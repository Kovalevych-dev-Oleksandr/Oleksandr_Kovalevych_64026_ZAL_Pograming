package ua.com.alevel.util;

import java.io.File;

public class FilePlace {
    private static final File file = new File("C:\\Projects\\Oleksandr_Kovalevych_64026_ZAL_Pograming\\PESELS.txt");
    public static final String absolutePath = file.getAbsolutePath();
}
