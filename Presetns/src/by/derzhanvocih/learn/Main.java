package by.derzhanvocih.learn;


import java.nio.charset.Charset;

public class Main {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass{}

    public static Main[] getTwoSolutions(){
        Main m = new Main();
        Main mm = new Main();
        m.innerClasses[0] = m.new InnerClass();
        m.innerClasses[1] = m.new InnerClass();
        mm.innerClasses[0] = mm.new InnerClass();
        mm.innerClasses[1] = mm.new InnerClass();
        Main[] main = new Main[]{m,mm};
        return main;
    }
    public static void main(String[] args) {
        }


    }


