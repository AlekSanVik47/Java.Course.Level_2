package Level_2.src.Task.Lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Robot extends Participant {
    public Robot(String name, int run, double jump) {
        super(name, run, jump);
    }

    public static void membersInfo() {
        Robot robot = new Robot("Rob_1", 1500, 1.5);
        System.out.println("Участник: " + name +
                "\nпробежал: " + run + " meters\n"
                + "прыгнул на высоту: " + jump + " meters");
    }

    public static void arrRobots() {
        ArrayList<Robot> robots = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Robot robot = new Robot("Robo_1", 1000, 0.5);
            Robot robot1 = new Robot("Robo_2", 300, 0.2);
            Robot robot2 = new Robot("Robo_3", 2000, 1);
            Robot robot3 = new Robot("Robo_4", 1300, 2);
            Robot robot4 = new Robot("Robo_5", 2500, 1.3);

            robots.add(robot);
            robots.add(robot1);
            robots.add(robot2);
            robots.add(robot3);
            robots.add(robot4);

            System.out.println(robots.get(i));
        }

    }

    public static void main(String[] args) {
        membersInfo();
        System.out.println();
        arrRobots();
    }

    @Override
    public String toString() {
        return "Rodots {" +
                "NAME ROBOT " + name + " max distance "
                + run + " meters" + " max height " + jump + " meters" +
                '}';
    }
}

