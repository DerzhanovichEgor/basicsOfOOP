package by.derzhanovich.learn.textfile;

public class TextFile extends File{
    private String data;
    public TextFile() {
    }

    public TextFile(String name) {
        super(name);
    }

    public TextFile(String name, String data) {
        super(name,data);
    }

    public String getData(){
        return this.data;
    }
    public void setData(String data) {
        this.data = data;

    }

}
