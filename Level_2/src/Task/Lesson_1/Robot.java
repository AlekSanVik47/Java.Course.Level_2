package Level_2.src.Task.Lesson_1;

public class Robot extends Participant {
    public Robot(String name, int run, double jump, boolean overcome) {
        super(name, run, jump, overcome);
    }
    public static void membersInfo(){
        Robot robot = new Robot("Rob_1", 1500, 1.5, true);
        System.out.println("Участник: " + name +
                "\nпробежал: " + run + " meters\n"
                + "прыгнул на высоту: " + jump + " meters");
    }
    public static void main(String[] args) {
        membersInfo();
    }
}
