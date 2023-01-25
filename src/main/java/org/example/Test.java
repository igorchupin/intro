package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String a = "asd11as145361d";
        StringBuilder stringBuilder = new StringBuilder(a);


        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(a);
        m.find();
        String result = a.substring(m.start(), m.end());
        System.out.println(result);

        m.find();

        result = a.substring(m.start(), m.end());
        System.out.println(result);


        System.out.println("quote: \"   \" ");
    }
}
