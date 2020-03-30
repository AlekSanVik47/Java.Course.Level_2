package Level_2.src.Task.Lesson_1;

import java.util.Arrays;

public class Wall {
    int obstacleNumber;
    double wallHeight;

    @Override
    public String toString() {
        return "Cтена{" +
                "Номер припятствия: " + obstacleNumber +
                ", высота стены " + wallHeight + " meters" +
                '}';
    }

    public Wall(int obstacleNumber, double wallHeight) {
        this.obstacleNumber = obstacleNumber;
        this.wallHeight = wallHeight;
        for (int i = 0; i < 4; i++) {
            obstacleNumber++;
            wallHeight += 0.4;
        }
    }


    static void parametersWall(){
        Wall[] walls = new Wall[5];
        for (int i = 1; i < walls.length; i++) {
            walls[i] = new Wall(i,  i *0.4);

            System.out.println(Arrays.toString(new Wall[]{walls[i]}));
        }


    }


            public static void main(String[] args) {
        parametersWall();
    }
}
