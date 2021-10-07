public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromFile("dictionaries.txt",dict);
        DictionaryCommandline.showAllWords(dict);
        DictionaryManagement.commandFromCommandline(dict);
        //DictionaryManagement.dictionaryLookup(dict);

    }


}
