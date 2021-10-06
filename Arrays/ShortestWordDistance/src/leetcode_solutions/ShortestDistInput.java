package leetcode_solutions;

public class ShortestDistInput {
    public String[] wordsDict;
    public String word1;
    public String word2;

    public ShortestDistInput(String[] wordsDict, String word1, String word2) {
        this.wordsDict = wordsDict;
        this.word1 = word1;
        this.word2 = word2;
    }

    public String[] getWordsDict() {
        return wordsDict;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }
}
