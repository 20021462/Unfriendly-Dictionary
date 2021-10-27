public class Main {
    public static void main(String[] args) {
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromFile("dictionary2.txt",dict);
        DictionaryCommandline.showAllWords(dict);
        dict.getWords().get(15000).setWordTarget("a");
        dict.sort(15000);
        DictionaryManagement.dictionaryExportToFile("dictionary1.txt",dict);
        //DictionaryManagement.commandFromCommandline(dict);
        /*DictionaryCommandline.showOneWords(dict,0);
        DictionaryCommandline.showOneWords(dict,1);
        DictionaryManagement.removeFromCommandline(dict,-1);*/
    }
}