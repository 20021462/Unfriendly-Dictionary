import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromFile("dictionary.txt",dict);
        DictionaryCommandline.showAllWords(dict);
        System.out.println(dict.getWords().size());
        DictionaryManagement.removeFromCommandline(dict,-1);
        //DictionaryManagement.commandFromCommandline(dict);
        //DictionaryManagement.dictionaryExportToFile("dictionary.txt",dict);
    }
}