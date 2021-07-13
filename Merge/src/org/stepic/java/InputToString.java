package org.stepic.java;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class InputToString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        char[] input = new char[1024];
       int charCount;
       String result = "";
      while ((charCount = reader.read(input)) != -1) {
          result = new String(input, 0, charCount);

        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        byte[] test = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(test);
        String res = readAsString(inputStream, StandardCharsets.US_ASCII);
        System.out.println(res);
    }
}
