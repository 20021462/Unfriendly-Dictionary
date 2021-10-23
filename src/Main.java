public class Main {
    public static void main(String[] args) {
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Dictionary dict = new Dictionary();
        DictionaryManagement.insertFromFile("dictionary.txt",dict);
        DictionaryCommandline.showAllWords(dict);
        DictionaryManagement.commandFromCommandline(dict);
        dict.getWords().get(15000).speak();
        //DictionaryManagement.removeFromCommandline(dict,-1);*/
    }




}