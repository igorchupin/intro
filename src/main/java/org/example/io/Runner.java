package org.example.io;

import java.io.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

//        int read = br.read();
//        System.out.println(read);
//        String readLine = br.readLine();
//        System.out.println(readLine);

//        pw.print('a');
//        pw.println('b');

//        FileInputStream fis = new FileInputStream("qw.txt");
//
//        int i;
//        while((i = fis.read()) != -1){
//            System.out.print((char)i);
//        }
//
//        FileOutputStream fos = new FileOutputStream("D:\\Git\\Java45\\Java-45-\\qw.txt");
//        byte[] bytes = "Test string".getBytes();
//        fos.write(bytes);
//
//        File file = new File("D:\\Git\\Java45\\Java-45-\\qw.txt");
//        System.out.println();
//        System.out.println(file.getName());


//        Scanner scanner = new Scanner(System.in);
//
//        String str = scanner.nextLine();
//        System.out.println(str);

        RecursionExample recursionExample = new RecursionExample();
        recursionExample.printRecursive();


        List<String> arrStr = new ArrayList<>() {{
            add("1");
            add("2");
        }};
        Collection<String> strings = Collections.unmodifiableCollection(arrStr);
        strings.add("3");
        System.out.println(strings.size());

    }
}
