package Task.Lesson_3;

import java.util.*;

public class Words {
    public Set<String> getUniqueWords(String[] arrayOfWords){
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(arrayOfWords));
        return uniqueWords;
    }
    public static void main(String[] args) {
        String[] words = {"Друзья", "Взгляд", "Глаза",
                "Игра", "Улыбка", "Радость", "Ученье", "Жизнь", "Игра", "Улыбка",
                "Радость", "Ученье", "Смех", "Успех", "Школа", "Доллар", "Золото",
                "Погода"};
        Words newWords = new Words();
        System.out.printf("В массиве %d уникальных слов \nСписок уникальных слов: %s%n", newWords.getUniqueWords(words).size(), newWords.getUniqueWords(words));


        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }


}




