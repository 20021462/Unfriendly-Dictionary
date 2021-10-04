import edu.princeton.cs.algs4.StdIn;

public class DictionaryManagement {
    /**
     * This method insets word using command line.
     *
     * @param dict a variable has Dictionary class
     */
    public static void insertFromCommandline(Dictionary dict) {
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            String word_target = StdIn.readString();
            StdIn.readLine();
            String word_explain = StdIn.readLine();
            dict.getWords()[dict.getWordNumber()] = new Dictionary.Word(word_target, word_explain);
            dict.setWordNumber(dict.getWordNumber() + 1);
        }
    }
}
