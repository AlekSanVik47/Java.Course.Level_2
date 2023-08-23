package Task.Lesson_3;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class User implements Comparable<User>{
    private String phone;
    private String surname;

    public User(String phone, String surname) {
        this.phone = phone;
        this.surname = surname;
    }

    public List<String> getPhone() {
        return Collections.singletonList(phone);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int compareTo(User o) {
        return surname.compareTo(o.getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return phone.equals(user.phone) && surname.equals(user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, surname);
    }
}
