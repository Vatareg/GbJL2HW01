public class GbJL2HW01 {
public static void main(String[] args){
    Participant[] participants = {
            new Cat(2000, 4),
            new Cat(4800, 9),
            new Human(6000, 2),
            new Human(2500, 1),
            new Robot(5000000, 0),
            new Robot(2800, 15)
    };

    Obstacle[] obstacles = {
            new RunTrack(3000),
            new Wall(1)
    };

    for (Participant participant : participants) {
        for (Obstacle obstacle : obstacles) {
            obstacle.passTheObstacle(participant);
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }
}
}