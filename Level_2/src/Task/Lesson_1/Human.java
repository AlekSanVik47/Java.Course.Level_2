package Level_2.src.Task.Lesson_1;

public class Human extends Participant {

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", run=" + run +
                " meters, jump=" + jump + " meters" +
                '}';
    }

    public Human(String name, int run, double jump) {
        super(name, run, jump);

    }

    static boolean humanTeamRan() {
        boolean overcome = true;
        Human[] humans = new Human[5];

        humans[0] = new Human("Jon", 1000, 1);
        humans[1] = new Human("Alex", 1500, 1.2);
        humans[2] = new Human("Tom", 2000, 1.1);
        humans[3] = new Human("Felix", 500, 0.7);
        humans[4] = new Human("Bill", 2500, 1.8);

        Treadmill[] treadmills = new Treadmill[5];
        for (int i = 1; i < treadmills.length; i++) {
            treadmills[i] = new Treadmill((i * 10), i * 500);

            for (int j = 0; j < humans.length; j++) {
                if (humans[j].run >= treadmills[i].distance) {
                    System.out.println("Участник " + humans[j].name + " пробежал по дорожке №_" + treadmills[i].trackNumber
                            + "\n" + treadmills[i].distance + " meters");
                    return overcome;
                }

            }
        }


        return false;
    }

    static boolean humanTeamJumped() {
        Human[] humans = new Human[5];

        humans[0] = new Human("Jon", 1000, 1);
        humans[1] = new Human("Alex", 1500, 1.2);
        humans[2] = new Human("Tom", 2000, 1.1);
        humans[3] = new Human("Felix", 500, 0.7);
        humans[4] = new Human("Bill", 2500, 1.8);

        Wall[] walls = new Wall[5];
        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Wall(i, i * 0.4);
            for (int j = 0; j < humans.length; j++) {

                if (humans[j].jump >= walls[i].wallHeight) {

                    System.out.println("Участник " + humans[j].name + " перепрыгнул через припятствие №_" + walls[i].obstacleNumber
                            + "\n" + walls[i].wallHeight + " meters");
                    return true;
                }
            }

        }
        return false;
    }
}
