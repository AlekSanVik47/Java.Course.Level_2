package Level_2.src.Task.Lesson_1;

public class Participant {
    protected static String name;
    protected static int run;
    protected static double jump;
    protected boolean overcome;



    public Participant(String name, int run, double jump) {
        Participant.name = name;
        Participant.run = run;
        Participant.jump = jump;


    }

    static void membersInfo() {
        boolean overcome = true;
        System.out.println("Участник: " + name +
                "\nпробежал: " + run + " meters\n"
                + "прыгнул на высоту: " + jump + " meters");
    }

    public static void main(String[] args) {
        //membersInfo();
        Human.membersInfo();
        System.out.println();
        Cat.membersInfo();
        System.out.println();
        Robot.membersInfo();
        System.out.println();
        Wall.parametersWall();
        System.out.println();
        Treadmill.treadmillOptions();

    }

}
