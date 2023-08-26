package homework.five.Obstacle;

import homework.five.Obstacle.participant.Participant;

    public class Wall extends Obstacle {
        private String obstacleName;
        private int height;

        public Wall(String obstacleName, int height) {
            this.obstacleName = obstacleName;
            this.height = height;
        }

        @Override
        boolean doIt(Participant participant) {
            return participant.run (height);
        }

}
