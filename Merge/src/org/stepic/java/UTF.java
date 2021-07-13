package org.stepic.java;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UTF {
    public static void main(String[] args) throws IOException {
        byte[] a = "Ы".getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", Byte.toUnsignedInt(a[i]));
        }

    }
}