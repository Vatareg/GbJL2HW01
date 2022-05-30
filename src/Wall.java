public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public void passTheObstacle(Participant participant) {
        participant.heightJump(height);
    }
}
