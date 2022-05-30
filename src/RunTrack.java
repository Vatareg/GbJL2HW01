public class RunTrack implements Obstacle {
    private int distance;

    public RunTrack(int distance) {
        this.distance = distance;
    }
    @Override
    public void passTheObstacle(Participant participant) {
        participant.run(distance);
    }
}
