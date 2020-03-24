package Level_2.src.Task.Lesson_1;

import java.util.ArrayList;

public class Participant {
    protected static String name;
    protected static int run;
    protected static double jump;




    public Participant(String name, int run, double jump) {
        Participant.name = name;
        Participant.run = run;
        Participant.jump = jump;


    }

    static void membersInfo() {

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

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Participant.name = name;
    }

    public static int getRun() {
        return run;
    }

    public static void setRun(int run) {
        Participant.run = run;
    }

    public static double getJump() {
        return jump;
    }

    public static void setJump(double jump) {
        Participant.jump = jump;
    }
}
