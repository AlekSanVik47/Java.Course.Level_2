package Task.Lesson_3;
import java.util.HashMap;
import java.util.*;

public class NumberPhone {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        String[] lastName = {"Ivanov", "Petrov", "Sokolov", "Ivanov", "Petrov", "Vladimirov"};
        String[] number = {"456 789", "270 270", "154 123", "788 695", "785 695", "327 456"};



        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < number.length; j++) {
                map.put(lastName[j], number[j]);
                if (lastName[i].equals(lastName[j]) && !(number[i].equals(number[j]))) {
                    System.out.println(lastName[i] + " " + number[i] + "; " + number[j]);
                }
                System.out.println(lastName[i] + " " + map.get("Petrov"));
            }
        }


        return map;
    }


    public static void main(String[] args) {
        createMap();
    }


    @Override
    public String toString() {
        return "NumberPhone{}";
    }
}




