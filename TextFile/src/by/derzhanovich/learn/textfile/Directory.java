package by.derzhanovich.learn.textfile;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files = new ArrayList<>();

    public Directory() {
    }

    public Directory(String name,File...args) {
        this.name = name;
        for (int i = 0; i <args.length; i++) {
            addFile(args[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }




    private List<File> addFile(File file){
        files.add(file);
        return files;
    }
    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", files=" + files +
                '}';
    }



}
