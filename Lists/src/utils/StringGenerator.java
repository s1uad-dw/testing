package utils;
import java.util.Random;

public class StringGenerator {
    public String generateRandomString(int len){
        StringBuilder result = new StringBuilder();
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for(int i = 0; i<len; i++){
            result.append(symbols.charAt(new Random().nextInt(symbols.length())));
        }
        return result.toString();
    }
}
