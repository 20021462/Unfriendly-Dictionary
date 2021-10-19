import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromFile("dictionaries.txt",dict);
        DictionaryCommandline.showAllWords(dict);
        DictionaryManagement.commandFromCommandline(dict);
        DictionaryManagement.dictionaryExportToFile("dictionaryNow.txt",dict);

    }


}
