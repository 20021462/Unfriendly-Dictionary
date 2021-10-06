import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromFile("dictionaries.txt",dict);
        DictionaryCommandline.showAllWords(dict);
        DictionaryManagement.dictionaryLookup(dict);
    }

}
