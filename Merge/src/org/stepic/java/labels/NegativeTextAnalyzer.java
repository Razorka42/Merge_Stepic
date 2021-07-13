package org.stepic.java.labels;

public class NegativeTextAnalyzer extends KeywordAnalyser {

    @Override
    protected checkLabelsClass.Label getLabel() {
        return checkLabelsClass.Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    public checkLabelsClass.Label processText(String text) {
        for (int i = 0; i < this.getKeywords().length; i++) {
            if (text.contains(this.getKeywords()[i])) {
                return this.getLabel();
            }
        }
        return checkLabelsClass.Label.OK;
    }
}
