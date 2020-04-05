package Task.Lesson_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Words {

    public static void main(String[] args) {
        String[] words = {"Друзья", "Взгляд", "Глаза",
                "Игра", "Улыбка", "Радость", "Ученье", "Жизнь", "Игра", "Улыбка",
                "Радость", "Ученье", "Смех", "Успех", "Школа", "Доллар", "Золото",
                "Погода"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }


}




