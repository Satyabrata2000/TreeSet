package TreeSet;

import java.util.TreeSet;

public class Example1 {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("a");
        ts.add("d");
        ts.add("b");
        ts.add("t");
        ts.add("a");
        ts.add("f");
        ts.add("e");
        ts.add("b");

        System.out.println(ts);
    }
}
