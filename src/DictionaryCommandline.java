public class DictionaryCommandline {
    public static void showAllWords(Dictionary dict) {
        System.out.println("No    |English          |Vietnamese   ");
        for (int i = 0; i < dict.wordNumber; i++) {
            System.out.println((i + 1) + "    |" + dict.words[i].word_target + "          |" + dict.words[i].word_explain);
        }
    }

    public static void dictionaryBasic() {

    }
}
