package Task.Lesson_3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PhonebookTest {
    private User user;

    List<User> userList = new ArrayList<>();


    public Map<String, String> add(List<User> userList) {
        Map<String, String> map = new HashMap<>();
        String phone;
        String surname;
        for (User user :
                userList) {
            if (!user.getPhone().isEmpty()) {
                phone = user.getPhone().toString();
                surname = user.getSurname();
                map.put(phone, surname);
            }

        }
        return map;
    }

    public Map<String, List<String>> phoneNumbersBySurname(Map<String, String> mapPhoneBook, String surname) {
        Map<String, List<String>> numbersBySurname = new HashMap<>();
        List<String> numbers = new ArrayList<>();
        mapPhoneBook.forEach((key, value) -> {
            if (value.equals(surname)) {
                numbers.add(key);
                numbersBySurname.put(value, numbers);
            }

        });
        return numbersBySurname;
    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user = new User("270270", "Petrov");
        User user1 = new User("271270", "Petrov");
        User user2 = new User("272270", "Petrov");
        User user3 = new User("273270", "Petrov");
        User user4 = new User("277270", "Ivanov");
        User user5 = new User("277271", "Ivanov");
        User user6 = new User("277272", "Ivanov");
        User user7 = new User("277273", "Ivanov");
        User user8 = new User("277274", "Ivanov");
        User user9 = new User("327327", "Sidorov");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);

        PhonebookTest phonebookTest = new PhonebookTest();
        System.out.println(phonebookTest.add(userList));
        System.out.println("_______________________________________________________________");

        System.out.println(phonebookTest.phoneNumbersBySurname(phonebookTest.add(userList), "Petrov"));
    }

}
