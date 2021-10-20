import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> words = new ArrayList<>(5000);

    public ArrayList<Word> getWords() { return words; }

    public void setWords(ArrayList<Word> words) { this.words = words; }

    public void add(String wordTarget, String wordExplain) {
        words.add(new Word(wordTarget, wordExplain));
    }

    public void remove(int number) {
        words.remove(number);
    }

    public static String SHOW = "-show";
    public static String ADD = "-add";
    public static String REMOVE = "-remove";
    public static String SEARCH = "-search";
    public static String EXIT = "-exit";
}
