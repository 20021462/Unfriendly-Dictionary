import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdIn;

import java.io.File;
import java.io.IOException;

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
            dict.add(word_target, word_explain);
        }
    }

    /**
     * This method removes word using command line.
     * @param dict a Dictionary class object
     * @param n number of that word in dictionary
     */
    public static void removeFromCommandline(Dictionary dict, int n) {
        dict.remove(n);
    }

    /**
     *This method is used to add, remove, search or show words in dictionary.
     *
     * @param dict a Dictionary class object
     */
    public static void commandFromCommandline(Dictionary dict) {
        boolean exit = false;
        while (!exit) {
            String command = StdIn.readString();
            if (command.equals(Dictionary.ADD)) {
                insertFromCommandline(dict);
            } else if (command.equals(Dictionary.REMOVE)) {
                int n = StdIn.readInt();
                System.out.println("REMOVE ");
                DictionaryCommandline.showOneWords(dict, n);
                removeFromCommandline(dict, n);
            } else if (command.equals(Dictionary.SEARCH)) {
                String subWord = StdIn.readString();
                DictionaryCommandline.dictionarySearcher(dict, subWord);
            } else if (command.equals(Dictionary.SHOW)) {
                DictionaryCommandline.showAllWords(dict);
            } else if (command.equals(Dictionary.EXIT)) {
                exit = true;
            }
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
            String word_explain = myReader.readLine();
            word_explain = word_explain.substring(1);
            dict.getWords()[dict.getWordNumber()] = new Word(word_target, word_explain);
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

    /**
     * This method export all words in a dictionary to a .txt file.
     *
     * @param path local path or file name
     * @param dict a Dictionary class object
     * @throws IOException
     */
    public static void dictionaryExportToFile(String path, Dictionary dict) throws IOException {
        File del = new File(path);
        del.delete();
        File dictFile = new File(path);
        dictFile.createNewFile();
        Out printer = new Out(path);
        for (int i = 0; i < dict.getWordNumber(); i++) {
            printer.println(dict.getWords()[i].getWord_target()+"\t"+ dict.getWords()[i].getWord_explain());
        }
    }
}
