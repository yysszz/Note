package springsourcecode.designpatternnote.chapter47_prototype;

import java.util.HashMap;
import java.util.List;

public class Demo {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh(){
        //shallow copy
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>)currentKeywords;

        //从数据库取出更新时间大于lastUpdate的数据，放入newKeywords
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long newMaxUpdateTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > newMaxUpdateTime) {
                newMaxUpdateTime = searchWord.getLastUpdateTime();
            }
            if (newKeywords.containsKey(searchWord.getKeyWord())) {
                newKeywords.remove(searchWord.getKeyWord());
            }
            newKeywords.put(searchWord.getKeyWord(),searchWord);
        }
        lastUpdateTime = newMaxUpdateTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        return null;
    }
}
