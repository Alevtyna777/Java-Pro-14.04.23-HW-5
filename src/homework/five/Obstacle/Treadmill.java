package homework.five.Obstacle;

import homework.five.Obstacle.participant.Participant;

public class Treadmill extends Obstacle {
    private String obstacleName;
    private int length;

    public Treadmill(String obstacleName, int length) {
        this.obstacleName = obstacleName;
        this.length = length;
    }

    @Override
    boolean doIt(Participant participant) {
        return participant.run (length);
    }
}
