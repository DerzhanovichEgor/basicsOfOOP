package by.derzhanovich.learn.textfile;


public class File {
    private String name;
    private String data;

    public File() {
    }

    public File(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name +
                '}';
    }
}
