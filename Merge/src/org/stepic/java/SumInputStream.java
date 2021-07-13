package org.stepic.java;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SumInputStream extends InputStream {
    private static InputStream inputStream;

    @Override
    public int read() throws IOException {
        return 0;
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int inputByte = inputStream.read();
        while (inputByte != -1) {
            sum = Integer.rotateLeft(sum, 1)^inputByte;
            inputByte = inputStream.read();
        }
        return sum;
         }

    public static void main(String[] args) throws IOException {
        byte [] array = {0x33, 0x45, 0x01};
        inputStream = new ByteArrayInputStream(array);
        int sum1 = checkSumOfStream(inputStream);
        System.out.println(sum1);
    }
}
