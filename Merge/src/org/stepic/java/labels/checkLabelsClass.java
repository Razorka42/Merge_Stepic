package org.stepic.java.labels;

import java.awt.*;

public class checkLabelsClass {

    interface TextAnalyser {
        Label processText(String text);
    }

    enum Label {SPAM, NEGATIVE_TEXT, TOO_LONG, OK}

    public static Label checkLabels(TextAnalyser[] analyzers, String text) {
        Label result = Label.OK;
        for (int i = 0; i < analyzers.length; i++) {
            result = analyzers[i].processText(text);
            if (result != Label.OK) {

                return result;
            }
        }

        return result;
    }




}

