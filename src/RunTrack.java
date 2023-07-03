public class RunTrack {
    private int length;

    public RunTrack(int length) {
        this.length = length;
    }

    public void overcome(Object participant) {
        if (participant instanceof Human) {
            Human human = (Human) participant;
            human.run(length);
        } else if (participant instanceof Cat) {
            Cat cat = (Cat) participant;
            cat.run(length);
        } else if (participant instanceof Robot) {
            Robot robot = (Robot) participant;
            robot.run(length);
        }
    }
}
