package org.s1uad_dw;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dict dict = new Dict().loadFromJson("data.json"); // если чет не так пойдет, то пустой словарь вернется
        dict.addWord("Ебанашка", "сумасшедший, ненормальный человек"); // добавление слова в словарь
        System.out.printf("Есть ли в словаре слово Ебанашка - %b\n", dict.containsWord("Ебанашка"));
        dict.addWord("Шизофрения", "Шизофрения характеризуется значительными нарушениями в восприятии реальности и изменениями поведения");
        dict.addWord("Биполярка", "Для людей с биполярным расстройством характерно чередование депрессивных и маниакальных симптомов");
        System.out.printf("Есть ли в словаре слова Шизофрения и Биполярка - %b\n", dict.containsWords(Arrays.asList("Шизофрения", "Биполярка")));
        System.out.println(dict.getWords());
        dict.removeWord("Шизофрения"); // удаление слова из словаря
        dict.addWord("Ебанашка", "Перезаписанная ебанашка"); // перезапись слова в словаре
        System.out.println(dict.watchWords());
        dict.saveToJson("data.json");
    }
}
