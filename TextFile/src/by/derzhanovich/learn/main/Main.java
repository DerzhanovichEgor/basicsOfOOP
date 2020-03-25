package by.derzhanovich.learn.main;

import by.derzhanovich.learn.logic.FileAction;
import by.derzhanovich.learn.textfile.Directory;
import by.derzhanovich.learn.textfile.File;

public class Main {
    public static void main(String[] args) {
        FileAction file = new FileAction();
        File textFile = file.createTextFile("TextFile");
        file.addText(textFile);
        File textFile2 = file.createTextFile("SeconTextFile");

        Directory directory = new Directory("TextFiles",textFile,textFile2);

    }
}
