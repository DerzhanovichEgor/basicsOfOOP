package by.derzhanovich.learn.logic;

import by.derzhanovich.learn.textfile.File;
import by.derzhanovich.learn.textfile.TextFile;

import java.util.Scanner;

public class FileAction {

    public void renameFile(File file, String name){
        file.setName(name);
    }

    public File createTextFile(String name){
        return new TextFile(name);
    }

    public void addText(File file){
        System.out.println("Введите текст для записи в файл: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(file.getData());

        sb.append(sc.nextLine());
                file.setData(sb.toString());
    }
    public void printFile(File file){
        System.out.println(file.getData());
    }


}
