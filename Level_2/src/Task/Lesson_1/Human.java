package Level_2.src.Task.Lesson_1;

public class Human extends Participant{

    public Human(String name, int run, double jump, boolean overcome) {
        super("membersName", run, jump, overcome);

    }
    public static void membersInfo(){
        Human human = new Human("membersName", 1000, 1.2, true);
        System.out.println("Участник: " + name +
                "\nпробежал: " + run + " meters\n"
                + "прыгнул на высоту: " + jump + " meters");
    }

    public static void main(String[] args) {
        membersInfo();
    }
}
