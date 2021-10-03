import edu.princeton.cs.algs4.StdIn;

public class DictionaryManagement {
    public static void insertFromCommandline(Dictionary dict) {
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            String word_target = StdIn.readString();
            StdIn.readLine();
            String word_explain = StdIn.readLine();
            dict.words[dict.wordNumber] = new Dictionary.Word(word_target, word_explain);
            dict.wordNumber++;
        }
    }
}
