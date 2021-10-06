public class DictionaryCommandline {
    /**
     * This method prints all words in a dictionary.
     *
     * @param dict a Dictionary class object
     */
    public static void showAllWords(Dictionary dict) {
        System.out.println("No    |English             |Vietnamese   ");
        for (int i = 0; i < dict.getWordNumber(); i++) {
            System.out.printf("%-6d|%-20s|%s%n", i + 1, dict.getWords()[i].getWord_target(), dict.getWords()[i].getWord_explain());
        }
    }



    public static void dictionaryBasic() {
    }

    public static void dictionaryAdvanced(){

    }
}
