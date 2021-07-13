package org.stepic.java;

import java.util.Arrays;
import java.util.logging.*;

public class LogDemo {
    private static final Logger LOGGER = Logger.getLogger(LogDemo.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.FINE, "Started with arguments: {0}", Arrays.toString(args));

        try {
            randomFailingAlgorithm();
        }
        catch (IllegalStateException e) {
            LOGGER.log(Level.SEVERE, "Exception caught", e);
            System.exit(2);
        }
        LOGGER.fine("Finished successfully");

        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerA.setLevel(Level.ALL);
        loggerB.setLevel(Level.WARNING);
        Logger loggerC = Logger.getLogger("org.stepic.java");
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        XMLFormatter formatter = new XMLFormatter();
        handler.setFormatter(formatter);
        loggerC.addHandler(handler);
        loggerC.setUseParentHandlers(false);
    }

    private static void randomFailingAlgorithm() {
        double randomNumber = Math.random();
        LOGGER.log(Level.FINE, "Generated random number: {0}", randomNumber);
        if (randomNumber < 0.5) {
            throw new IllegalStateException("Invalid phase of the Moon");
        }
    }

}
