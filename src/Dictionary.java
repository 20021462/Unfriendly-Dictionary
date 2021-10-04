public class Dictionary {
    private Word[] words = new Word[100];
    private int wordNumber = 0;

    public int getWordNumber() {
        return wordNumber;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWordNumber(int wordNumber) {
        this.wordNumber = wordNumber;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    public static class Word {
        private String word_target;
        private String word_explain;

        public String getWord_target() {
            return word_target;
        }

        public String getWord_explain() {
            return word_explain;
        }

        public void setWord_target(String word_target) {
            this.word_target = word_target;
        }

        public void setWord_explain(String word_explain) {
            this.word_explain = word_explain;
        }

        Word(String word_target, String word_explain) {
            this.word_target = word_target;
            this.word_explain = word_explain;
        }
    }
}
