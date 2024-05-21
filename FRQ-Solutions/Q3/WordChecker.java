import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for(int i = 1; i < wordList.size(); i++){
      if(wordList.get(i).indexOf(wordList.get(i-1)) < 0){
        return false;
      }
    }
    return true;
  }


  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for(String w : wordList){
      int index = w.indexOf(target);
      if(index == 0){
        result.add(w.substring(target.length()));
      }
    }
    return result;             
  }
}
