package service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DictionaryServiceImpl implements DictionaryService {

  private static Map<String, String> dictionary;
  static {
    dictionary = new HashMap<>();
    dictionary.put("hello", "Xin chào");
    dictionary.put("you", "Bạn");
    dictionary.put("i", "Tôi");
    dictionary.put("father", "Bố");
    dictionary.put("mother", "Mẹ");
    dictionary.put("book", "sách");
    dictionary.put("football", "bóng đá");
    dictionary.put("music", "âm nhạc");
  }

  @Override
  public String wordSearch(String s) {
    String str = s.toLowerCase();
    Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, String> entry = iterator.next();
      if(entry.getKey().equals(str)) return entry.getValue();
    }
    return null;
  }
}
