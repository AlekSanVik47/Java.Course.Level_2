package Level_2.src.Task.Lesson_1;

public class Cat extends Participant {
    public Cat(String name, int run, double jump, boolean overcome) {
        super(name, run, jump, overcome);

    }
    public static void membersInfo(){
        Cat cat = new Cat("Cat", 200, 1.5, true);
        System.out.println("Участник: " + name +
                "\nпробежал: " + run + " meters\n"
                + "прыгнул на высоту: " + jump + " meters");
    }

    public static void main(String[] args) {
        membersInfo();
    }
}
