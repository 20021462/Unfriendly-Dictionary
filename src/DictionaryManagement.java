import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryManagement {
    /**
     * This method inserts word using command line.
     *
     * @param dict a Dictionary class object
     */
    public static void insertFromCommandline(Dictionary dict) {
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            String word_target = StdIn.readString();
            StdIn.readLine();
            String word_explain = StdIn.readLine();
            dict.getWords()[dict.getWordNumber()] = new Dictionary.Word(word_target, word_explain);
            dict.setWordNumber(dict.getWordNumber() + 1);
        }
    }

    /**
     * This method insert word by a file.
     *
     * @param path directory to the file
     * @param dict a Dictionary class object
     */
    public static void insertFromFile(String path,Dictionary dict) {
        In myReader = new In(path);
        while (myReader.hasNextLine()) {
            String word_target = myReader.readString();
            String word_explain=myReader.readLine();
            word_explain=word_explain.substring(1);
            dict.getWords()[dict.getWordNumber()] = new Dictionary.Word(word_target, word_explain);
            dict.setWordNumber(dict.getWordNumber() + 1);
        }
        myReader.close();
    }

    /**
     * This method fine if there is your word in the dictionary, and show its meaning.
     *
     * @param dict a Dictionary class object
     */
    public static void dictionaryLookup(Dictionary dict){
        String word = StdIn.readString();
        for (int i=0;i< dict.getWordNumber();i++){
            if (dict.getWords()[i].getWord_target().equals(word)){
                System.out.println("No    |English             |Vietnamese   ");
                System.out.printf("%-6d|%-20s|%s%n", i + 1, dict.getWords()[i].getWord_target(), dict.getWords()[i].getWord_explain());
                return;
            }
        }
        System.out.println("Word not found!");
    }
}
