public class Cat {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот " + name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println("Кот " + name + " не смог пробежать " + distance + " метров");
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Кот " + name + " успешно перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.println("Кот " + name + " не смог перепрыгнуть стену высотой " + height + " метров");
        }
    }
}
