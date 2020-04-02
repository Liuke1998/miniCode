package miniCode;

public class DictionaryData {

    private static DictionaryData instance = new DictionaryData();

    private DictionaryData() {

    }

    public static DictionaryData getInstance() {
        return instance;
    }

    private String[] dict = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man", "go", "and"};

    public String[] getDict() {
        return dict;
    }

    public void setDict(String[] dict) {
        this.dict = dict;
    }
}
