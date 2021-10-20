import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryManagement {
    private static Scanner scanner=new Scanner(System.in);
    /**
     * This method inserts word using command line.
     *
     * @param dict a Dictionary class object
     */
    public static void insertFromCommandline(Dictionary dict) {
        System.out.println("Enter number of added words: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter words:");
            String word_target = scanner.next();
            scanner.nextLine();
            System.out.println("Enter meaning:");
            String word_explain = scanner.nextLine();
            dict.add(word_target, word_explain);
        }
        System.out.println("Added "+n+" words successful");
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
            String command = scanner.next();
            if (command.equals(Dictionary.ADD)) {
                insertFromCommandline(dict);
            } else if (command.equals(Dictionary.REMOVE)) {
                System.out.println("Enter index of word you want to remove: ");
                int n = scanner.nextInt();
                DictionaryCommandline.showOneWords(dict, n);
                removeFromCommandline(dict, n);
            } else if (command.equals(Dictionary.SEARCH)) {
                System.out.println("Enter word:");
                String subWord = scanner.next();
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
    public static void insertFromFile(String path,Dictionary dict) throws IOException {
        File myFile = new File(path);
        Scanner fileScanner = new Scanner(myFile);
       while (fileScanner.hasNextLine()) {
            String word = fileScanner.nextLine();
            for (int i=0;i<word.length();i++){
                if (word.charAt(i)=='\t') {
                    String word_target= word.substring(0,i);
                    String word_explain=word.substring(i+1);
                    dict.add(word_target,word_explain);
                }
            }
        }
        fileScanner.close();
    }

    /**
     * This method fine if there is your word in the dictionary, and show its meaning.
     *
     * @param dict a Dictionary class object
     */
    public static void dictionaryLookup(Dictionary dict){
        System.out.print("Enter words: ");
        String word = scanner.next();
        for (int i=0;i< dict.getWords().size();i++){
            if (dict.getWords().get(i).getWord_target().equals(word)){
                System.out.println("No    |English             |Vietnamese   ");
                System.out.printf("%-6d|%-20s|%s%n", i + 1, dict.getWords().get(i).getWord_target(), dict.getWords().get(i).getWord_explain());
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
        File dictFile = new File(path);
        dictFile.createNewFile();
        FileWriter myWriter = new FileWriter(dictFile);
        for (int i = 0; i < dict.getWords().size(); i++) {
            myWriter.write(dict.getWords().get(i).getWord_target()+"\t"+ dict.getWords().get(i).getWord_explain()+'\n');
        }
        myWriter.close();
    }
}
