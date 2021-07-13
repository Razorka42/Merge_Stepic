package org.stepic.java;

import java.io.IOException;

public class SystemInClass {
    public static void main(String[] args) throws IOException {
        int in = System.in.read();
        if (in != -1) {
            int next = System.in.read();
            while (next != -1) {
                if (in == 13 && next == 10) {
                    in = next;
                    next = System.in.read();
                } else {
                    System.out.write(in);
                    in = next;
                    next = System.in.read();
                }

            }

            System.out.write(in);


        }

        System.out.flush();

    }

}
