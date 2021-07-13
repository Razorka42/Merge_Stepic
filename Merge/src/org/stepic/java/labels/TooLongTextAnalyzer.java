package org.stepic.java.labels;

public class TooLongTextAnalyzer implements checkLabelsClass.TextAnalyser {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public checkLabelsClass.Label processText(String text) {
        if (text.length() > maxLength) {
            return checkLabelsClass.Label.TOO_LONG;
        }
        return checkLabelsClass.Label.OK;
    }
}
