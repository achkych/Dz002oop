public class Human {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Человек " + name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println("Человек " + name + " не смог пробежать " + distance + " метров");
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Человек " + name + " успешно перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.println("Человек " + name + " не смог перепрыгнуть стену высотой " + height + " метров");
        }
    }
}
