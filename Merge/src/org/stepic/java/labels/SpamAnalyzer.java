package org.stepic.java.labels;

public class SpamAnalyzer extends KeywordAnalyser {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected checkLabelsClass.Label getLabel() {
        return checkLabelsClass.Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    public checkLabelsClass.Label processText(String text) {
        for (int i = 0; i < keywords.length; i++) {
            if (text.contains(keywords[i])) {
                return this.getLabel();
            }
        }
        return checkLabelsClass.Label.OK;
    }
}