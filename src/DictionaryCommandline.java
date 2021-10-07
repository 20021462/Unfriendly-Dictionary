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

    /**
     * This method prints word number n in a dictionary
     * @param dict a Dictionary class object
     * @param n number of word
     */
    public static void showOneWords(Dictionary dict, int n) {
        //System.out.println("No    |English             |Vietnamese   ");
        System.out.printf("%-6d|%-20s|%s%n", n--, dict.getWords()[n].getWord_target(), dict.getWords()[n].getWord_explain());
    }

    /**
     *
     * @param dict
     * @param wordFind
     */
    public static void dictionarySearcher(Dictionary dict, String wordFind) {
        System.out.println("No    |English             |Vietnamese   ");
        for (int i = 0; i < dict.getWordNumber(); i++) {
            if (dict.getWords()[i].getWord_target().indexOf(wordFind) == 0) {
                System.out.printf("%-6d|%-20s|%s%n", i + 1, dict.getWords()[i].getWord_target(), dict.getWords()[i].getWord_explain());
            }
        }
    }

    public static void dictionaryBasic() {
    }

    public static void dictionaryAdvanced(){

    }
}
