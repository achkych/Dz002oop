public class Main {
    public static void main(String[] args) {
        Object[] participants = {
                new Human("John", 200, 2),
                new Cat("Murzik", 100, 3),
                new Robot("Robo", 500, 1)
        };

        Object[] obstacles = {
                new RunTrack(150),
                new Wall(2),
                new RunTrack(300),
                new Wall(4)
        };

        for (Object participant : participants) {
            boolean canContinue = true;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof RunTrack) {
                    RunTrack runTrack = (RunTrack) obstacle;
                    runTrack.overcome(participant);
                } else if (obstacle instanceof Wall) {
                    Wall wall = (Wall) obstacle;
                    wall.overcome(participant);
                }

                // Check if the participant failed to overcome the obstacle (Проверяем, не смог ли участник преодолеть препятствие)
                if (!canContinue) {
                    break;
                }
            }
        }
    }
}