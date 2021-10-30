import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> words = new ArrayList<>(50000);

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    /**
     * This method add a word to the dictionary.
     *
     * @param wordTarget  word
     * @param wordSound   word pronoun
     * @param wordExplain word explanation
     */
    public void add(String wordTarget, String wordSound, String wordExplain) {
        wordExplain = wordExplain.concat("\n");
        words.add(new Word(wordTarget, wordSound, wordExplain));
        sort(this.getWords().size() - 1);
    }

    /**
     * This method sorts a word in an ordered dictionary.
     *
     * @param index index of word
     * @return new index
     */
    public int sort(int index) {
        Word value = this.getWords().get(index);
        int i;
        if (index == this.getWords().size() - 1 || (index > 0 && value.getWordTarget().compareTo(this.getWords().get(index - 1).getWordTarget()) < 0)) {
            for (i = index; i > 0; i--) {
                if (value.getWordTarget().compareTo(words.get(i - 1).getWordTarget()) < 0) {
                    words.set(i, words.get(i - 1));
                } else {
                    words.set(i, value);
                    return i;
                }
            }
            words.set(i, value);
            return i;
        } else {
            for (i = index; i < words.size() - 1; i++) {
                if (value.getWordTarget().compareTo(words.get(i + 1).getWordTarget()) > 0) {
                    words.set(i, words.get(i + 1));
                } else {
                    words.set(i, value);
                    return i;
                }
            }
            words.set(i, value);
            return i;
        }
    }

    /**
     * This method removes a word by its index.
     *
     * @param number index of word
     */
    public void remove(int number) {
        words.remove(number);
    }

    public static String SHOW = "-show";
    public static String ADD = "-add";
    public static String REMOVE = "-remove";
    public static String SEARCH = "-search";
    public static String EXIT = "-exit";
}
