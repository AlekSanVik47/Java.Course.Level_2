package Task.Lesson_3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Words {
    public Set<String> getUniqueWords(String[] arrayOfWords){
        return new HashSet<>(asList(arrayOfWords));
    }
    public void getNumberOfRepetitions(String[] arrayOfWords){
        Arrays.stream(arrayOfWords)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(element -> element.getValue() >= 1 )
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public Map<String, Integer> countingWordsWithMap(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] words = {"Друзья", "Взгляд", "Глаза",
                "Игра", "Улыбка", "Радость", "Ученье", "Жизнь", "Игра", "Улыбка",
                "Радость", "Ученье", "Смех", "Успех", "Школа", "Доллар", "Золото",
                "Погода", "Ученье"};
        Words newWords = new Words();
        System.out.printf("В массиве %d уникальных слов \nСписок уникальных слов: %s%n", newWords.getUniqueWords(words).size(), newWords.getUniqueWords(words));
        System.out.println("__________________подсчет дубликатов с помощью Stream api_______________");
        newWords.getNumberOfRepetitions(words);
        System.out.println("__________________подсчет дубликатов с помощью Map________________");
        System.out.println(newWords.countingWordsWithMap(words));
    }




}




