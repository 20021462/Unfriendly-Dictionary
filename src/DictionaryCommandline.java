public class DictionaryCommandline {
    /**
     * This method prints all words in a dictionary.
     *
     * @param dict a Dictionary class object
     */
    public static void showAllWords(Dictionary dict) {
        System.out.println("No    |English                  |Vietnamese   ");
        for (int i = 0; i < dict.getWords().size(); i++) {
            System.out.printf("%-6d|%-25s|%s%n", i + 1, dict.getWords().get(i).getWord_target(), dict.getWords().get(i).getWord_explain());
        }
    }

    /**
     * This method prints word number n in a dictionary
     * @param dict a Dictionary class object
     * @param number number of word
     */
    public static void showOneWords(Dictionary dict, int number) {
        //System.out.println("No    |English             |Vietnamese   ");
        System.out.printf("%-6d|%-20s|%s%n", number, dict.getWords().get(number).getWord_target(), dict.getWords().get(number).getWord_explain());
    }

    /**
     * This method searches words in dictionary.
     *
     * @param dict     dictionary object
     * @param wordFind searched string
     */
    public static void dictionarySearcher(Dictionary dict, String wordFind) {
        System.out.println("No    |English             |Vietnamese   ");
        for (int i = 0; i < dict.getWords().size(); i++) {
            if (dict.getWords().get(i).getWord_target().indexOf(wordFind) == 0) {
                System.out.printf("%-6d|%-20s|%s%n", i + 1, dict.getWords().get(i).getWord_target(), dict.getWords().get(i).getWord_explain());
            }
        }
    }

    public static void dictionaryBasic() {
    }

    public static void dictionaryAdvanced(){

    }
}
