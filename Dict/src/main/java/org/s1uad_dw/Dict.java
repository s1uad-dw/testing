package org.s1uad_dw;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;

public class Dict {
    Map<String, String> words;

    public void saveToJson(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(fileName), this);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public Dict loadFromJson(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        File dataFile = new File("data.json");
        if (dataFile.exists()){
            try {
                return mapper.readValue(new File(fileName), Dict.class);
            } catch (IOException err) {
                words = new HashMap<String, String>();
                return this;
            }
        }else{
            words = new HashMap<String, String>();
            return this;
        }
    }
    public void addWord(String word, String meaning){
        words.put(word, meaning);
    }
    public void removeWord(String word){
        words.remove(word);
    }
    public boolean containsWord(String word){
        return words.containsKey(word);
    }
    public boolean containsWords(@NotNull List<String> words){
        boolean result = false;
        for (String word:words) {
            result = words.contains(word);
        }
        return result;
    }
    public Map<String, String> getWords(){
        return words;
    }
    public String watchWords(){
        StringBuilder result = new StringBuilder();
        result.append("Все слова словаря:\n");
        for (Map.Entry<String, String> word : words.entrySet()){
            result.append(String.format("%s - %s\n", word.getKey(), word.getValue()));
        }
        return result.toString();
    }
}
