public class DictionaryCommandline {
    /**
     * This method prints all words in a dictionary.
     *
     * @param dict a variable has Dictionary class
     */
    public static void showAllWords(Dictionary dict) {
        System.out.println("No    |English             |Vietnamese   ");
        for (int i = 0; i < dict.getWordNumber(); i++) {
            //System.out.println((i + 1) + "    |" + dict.words[i].word_target + "          |" + dict.words[i].word_explain);
            System.out.printf("%-6d|%-20s|%s%n",i+1, dict.getWords()[i].getWord_target(),dict.getWords()[i].getWord_explain());
        }
    }
    public static void dictionaryBasic() {
    }
}
