package Task.Lesson_3;
import java.util.TreeMap;
import java.util.*;

public class Phonebook {




    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        List<String> listPetrov = new ArrayList<>();
        listPetrov.add("456 789");
        listPetrov.add("270 270");
        listPetrov.add("154 123");
        listPetrov.add("788 695");
        listPetrov.add("785 695");
        listPetrov.add("327 456");

        List<String> listIvanov = new ArrayList<>();
        listIvanov.add("247 322");
        listIvanov.add("355 723");

        List<String> listSokolov = new ArrayList<>();
        listSokolov.add("456 456");
        List<String> listVladimirov = new ArrayList<>();
        listVladimirov.add("227 227");
        List<String> listSergeev = new ArrayList<>();
        listSergeev.add("527 427");


        map.put("Petrov", listPetrov);
        map.put("Ivanov", listIvanov);
        map.put("Sokolov", listSokolov);
        map.put("Vladimirov", listVladimirov);
        map.put("Sergeev", listSergeev);

        for (Map.Entry<String, List<String>> o : map.entrySet()) {

            System.out.println(o.getKey() + ": " + o.getValue());
        }

    }

}



