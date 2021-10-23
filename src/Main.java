import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {
    public static void main(String[] args) {
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromFile("dictionary.txt",dict);
        DictionaryCommandline.showAllWords(dict);
        System.out.println(dict.getWords().size());
        System.out.println(dict.getWords().get(15000).getWordTarget());
        System.out.println(dict.getWords().get(15000).getWordExplain());
        dict.getWords().get(15000).speak();
        //DictionaryManagement.removeFromCommandline(dict,-1);*/

    }




}