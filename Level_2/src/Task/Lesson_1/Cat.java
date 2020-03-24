package Level_2.src.Task.Lesson_1;

public class Cat extends Participant {
    public Cat(String name, int run, double jump) {
        super(name, run, jump);

    }
    public static void membersInfo(){
        Cat cat = new Cat("Cat", 200, 1.5);
        System.out.println("Участник: " + name +
                "\nпробежал: " + run + " meters\n"
                + "прыгнул на высоту: " + jump + " meters");
    }

    public static void main(String[] args) {
        membersInfo();
    }
}
