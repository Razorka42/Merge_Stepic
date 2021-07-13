package org.stepic.java.labels;

abstract class KeywordAnalyser implements checkLabelsClass.TextAnalyser {

    protected abstract checkLabelsClass.Label getLabel();

    protected abstract String[] getKeywords();


    @Override
    public checkLabelsClass.Label processText(String text) {
        for (int i = 0; i <= (this.getKeywords()).length; i++) {
            if (text.contains(this.getKeywords()[i])) {
                return this.getLabel();
            }
        }
        return this.getLabel();
    }

}



