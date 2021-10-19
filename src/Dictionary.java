public class Dictionary {
    private Word[] words = new Word[30000];
    private int wordNumber = 0;

    public int getWordNumber() { return wordNumber; }

    public Word[] getWords() { return words; }

    public void setWordNumber(int wordNumber) { this.wordNumber = wordNumber; }

    public void setWords(Word[] words) { this.words = words; }

    public void add(String wordTarget, String wordExplain) {
        Word newWord = new Word(wordTarget, wordExplain);
        this.words[this.wordNumber] = newWord;
        wordNumber++;
    }

    public void remove(int number) {
        wordNumber--;
        number--;
        for (int i = number; i < wordNumber; i++) {
            words[i] = words[i+1];
        }
    }

    public static String SHOW = "-show";
    public static String ADD = "-add";
    public static String REMOVE = "-remove";
    public static String SEARCH = "-search";
    public static String EXIT = "-exit";
}
