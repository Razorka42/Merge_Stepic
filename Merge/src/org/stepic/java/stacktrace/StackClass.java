package org.stepic.java.stacktrace;

public class StackClass {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());
    }


    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        if (stackTraceElements.length >= 3) {
            String result = new String(stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName());
            return result;

        }
        return null;

    }
}
