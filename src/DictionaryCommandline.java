public class DictionaryCommandline {
    /**
     * This method prints all words in a dictionary.
     *
     * @param dict a Dictionary class object
     */
    public static void showAllWords(Dictionary dict) {
        for (int i=0;i<dict.getWords().size();i++){
            showOneWords(dict,i);
        }
    }

    /**
     * This method prints word number n in a dictionary
     * @param dict a Dictionary class object
     * @param i index of word
     */
    public static void showOneWords(Dictionary dict, int i) {
        System.out.println(dict.getWords().get(i).getWordTarget()+" "+dict.getWords().get(i).getWordSound());
        System.out.println(dict.getWords().get(i).getWordExplain());
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
            if (dict.getWords().get(i).getWordTarget().indexOf(wordFind) == 0) {
                showOneWords(dict,i);
            }
        }
    }

    public static void dictionaryBasic() {
    }

    public static void dictionaryAdvanced(){

    }
}
