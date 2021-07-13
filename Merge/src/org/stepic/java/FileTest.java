package org.stepic.java;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file1 = new File("a\\.\\b\\..\\c\\.\\file.txt");
        File file2 = new File("a\\..\\b\\c\\file.txt");
        File file3 = new File("a\\b\\c\\file.txt");
        File file4 = new File("a\\b\\..\\file.txt");
        File file5 = new File(".\\a\\b\\..\\b\\c\\.\\file.txt");

            String canonicalPath1 = file1.getCanonicalPath();
            System.out.println(canonicalPath1);
            String canonicalPath2 = file2.getCanonicalPath();
            System.out.println(canonicalPath2);
            String canonicalPath3 = file3.getCanonicalPath();
            System.out.println(canonicalPath3);
            String canonicalPath4 = file4.getCanonicalPath();
            System.out.println(canonicalPath4);
            String canonicalPath5 = file5.getCanonicalPath();
            System.out.println(canonicalPath5);


    }
}
