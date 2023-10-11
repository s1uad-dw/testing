package utils;
import java.time.LocalDate;
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
            result.append(
                    (i == 0) ? new Random().nextInt(1, 10) : new Random().nextInt(10));
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

    public String generateRandomEmailString(int len){
        StringBuilder result = new StringBuilder();
        String[] domains = {"gmail.com", "yandex.ru", "mail.ru"};
        for(int i = 0; i<len; i++){
            result.append(
                    (Math.random()>0.5) ? generateRandomLetterString(1) : generateRandomNumberString(1)
            );
        }
        result.append(String.format("@%s", domains[new Random().nextInt(domains.length)]));
        return result.toString();
    }

    public String generateRandomPhoneNumberString(){
        return String.format(
                "+7(%s)%s-%s-%s",
                generateRandomNumberString(3),
                generateRandomNumberString(3),
                generateRandomNumberString(2),
                generateRandomNumberString(2)
        );
    }

    public LocalDate generateDate(int year, int month, int day, int diff){
        return LocalDate.of(year, month, day).plusDays(diff);
    }
}
