public class Dictionary {
    public Word[] words = new Word[100];
    public int wordNumber = 0;

    public static class Word {
        public String word_target;
        public String word_explain;

        public Word(String word_target, String word_explain) {
            this.word_target = word_target;
            this.word_explain = word_explain;
        }
    }
}
