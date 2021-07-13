package org.stepic.java.labels;

public class Test {
    public static void main(String[] args) {
               checkLabelsClass.TextAnalyser toolong = new TooLongTextAnalyzer(32);
        String[] keywords = new String[]{"bad", "fuck"};
        checkLabelsClass.TextAnalyser spam = new SpamAnalyzer(keywords);
        checkLabelsClass.TextAnalyser neg = new NegativeTextAnalyzer();
        checkLabelsClass.TextAnalyser[] analysers = new checkLabelsClass.TextAnalyser[]{toolong, spam, neg};
        String text = new String("comment loolllllloiuhgvvnnnndfdfdfdfd");
        System.out.println(checkLabelsClass.checkLabels(analysers, text));
    }
}
