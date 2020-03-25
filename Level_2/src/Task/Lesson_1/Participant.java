package Level_2.src.Task.Lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Participant {
    String name;
    int run;
    double jump;

    public Participant(String name, int run, double jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public static void main(String[] args) {

                Human.humanTeamRan();
                System.out.println();
                Human.humanTeamJumped();
                System.out.println();
                Wall.parametersWall();
                System.out.println();
                Treadmill.treadmillOptions();

            }

        }

