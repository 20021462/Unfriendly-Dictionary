public class Word {
    private String wordTarget;
    private String wordSound;
    private String wordExplain;

    Word(String wordTarget, String wordSound, String wordExplain) {
        this.wordTarget = wordTarget;
        this.wordSound=wordSound;
        this.wordExplain = wordExplain;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public void setWordSound(String wordSound) {
        this.wordSound = wordSound;
    }

    public String getWordExplain() {
        return wordExplain;
    }

    public String getWordSound() {
        return wordSound;
    }

    public String getWordTarget() {
        return wordTarget;
    }
}
