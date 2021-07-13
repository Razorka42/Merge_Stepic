package org.stepic.java;

import java.util.Scanner;

public class SystemOutSum {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        double doubleFromToken = 0;
        while (scanner.hasNext()) {
            String token = scanner.next();
            if (token.equals("quet")) {
                break;
            }
            try {
                doubleFromToken = Double.parseDouble(token);
            }
            catch (Exception e) {
                doubleFromToken = 0;
            }
            sum = sum + doubleFromToken;
        }
        System.out.printf("%6f", sum);
    }
}
