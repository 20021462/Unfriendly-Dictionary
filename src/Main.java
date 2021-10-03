public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromCommandline(dict);
        DictionaryCommandline.showAllWords(dict);
    }
}
