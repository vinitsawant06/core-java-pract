package com.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileImpl {

    public static void main(String[] args) throws IOException {
        File file= new File("D://DurgaSoft/abc.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
        File f = new File("D://DurgaSoft/Vinit");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());

        File file1 = new File("D://MCC Docs&Lambda/Documents(MCC)");
        int count = 0;
        String[] s =file1.list();
        for(String s1: s) {
            count++;
            System.out.println(s1);

        }
        System.out.println("Total files are: "+count);
        int fileCount = 0;
        for(String s2: s) {
            File file2 = new File(file1, s2);
            if(file2.isFile()) {
                fileCount++;
                System.out.println("Only files are: "+s2);
            }
        }
        System.out.println("Total only files are: "+fileCount);

    }
}
