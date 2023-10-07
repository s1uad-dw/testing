package utils;
import java.util.Random;

public class StringGenerator {
    public String generateRandomLetterString(int len){
        StringBuilder result = new StringBuilder();
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i<len; i++){
            char symbol = symbols.charAt(new Random().nextInt(symbols.length()));
            result.append(
                    (Math.random() > 0.5) ? Character.toLowerCase(symbol) : Character.toUpperCase(symbol)
            );
        }
        return result.toString();
    }

    public String generateRandomNumberString(int len){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<len; i++){
            result.append(new Random().nextInt(10));
        }
        return result.toString();
    }

    public String generateRandomString(int len){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<len; i++){
            result.append(
                    (Math.random()>0.5) ? generateRandomLetterString(1) : generateRandomNumberString(1)
            );
        }
        return result.toString();
    }
}
