public class Cat implements Participant {
    private int maxRunDistance;
    private int maxHeightJump;
    private boolean onDistance;
    public Cat(int maxRunDistance, int maxHeightJump) {
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
        this.onDistance = true;
    }
    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Cat has successfully run " + distance + " metres");
        } else {
            System.out.println("Cat couldn't run " + distance + " metres");
            onDistance = false;
        }
    }

    @Override
    public void heightJump(int height) {
        if (height <= maxHeightJump) {
            System.out.println("Cat has successfully vaulted over " + height + " metres wall");
        } else {
            System.out.println("Cat couldn't vault over " + height + " metres");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
