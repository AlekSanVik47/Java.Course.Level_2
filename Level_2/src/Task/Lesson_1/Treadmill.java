package Level_2.src.Task.Lesson_1;

import java.util.Arrays;

public class Treadmill {
    int trackNumber;
    int distance;

    @Override
    public String toString() {
        return "Беговая дорожка {" +
                "номер дорожки №_" + trackNumber +
                ", дистанция " + distance + " meters" +
                '}';
    }

    public Treadmill(int trackNumber, int distance) {
        this.trackNumber = trackNumber;
        this.distance = distance;
        for (int i = 0; i < 4; i++) {
            trackNumber += i * 10;
            distance +=500;
        }
    }

    static void treadmillOptions(){
        Treadmill[] treadmills = new Treadmill[5];
        for (int i = 1; i < treadmills.length; i++) {
            treadmills[i] = new Treadmill((i * 10), i * 500);
            System.out.println(Arrays.toString(new Treadmill[]{treadmills[i]}));
        }
    }

    public static void main(String[] args) {
        treadmillOptions();
    }
}
