package Level_2.src.Task.Lesson_1;

import java.util.Arrays;

public class Cat extends Participant {
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", jump=" + jump +
                '}';
    }

    public Cat(String name, int run, double jump) {
        super(name, run, jump);
    }
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 100, 1.5);
        cats[1] = new Cat("Pushok", 500, 1);
        cats[2] = new Cat("Thomas", 200, 1.8);
        cats[3] = new Cat("Fill", 400, 2.1);
        cats[4] = new Cat("Leon", 300, 1.6);
        for (int i = 0; i < cats.length; i++) {

            System.out.println(Arrays.toString(new Cat[]{cats[i]}));
        }


    }
}
