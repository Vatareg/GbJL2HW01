public class Robot implements Participant {

    private int maxRunDistance;
    private float maxHeightJump;
    private boolean onDistance;

    public Robot(int maxRunDistance, float maxHeightJump) {
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Robot has successfully run " + distance + " metres");
        } else {
            System.out.println("Robot couldn't run " + distance + " metres");
            onDistance = false;
        }

    }

    @Override
    public void heightJump(int height) {
        if (height <= maxHeightJump) {
            System.out.println("Robot has successfully vaulted over " + height + " metres wall");
        } else {
            System.out.println("Robot couldn't vault over " + height + " metres");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;

    }
}
