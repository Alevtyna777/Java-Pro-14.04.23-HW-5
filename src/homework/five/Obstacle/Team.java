package homework.five.Obstacle;

import homework.five.Obstacle.participant.Participant;

public class Team {

    private String name;
    private Participant participants[];

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Participant... participantGiven) {
        this.name = name;
        this.participants = participantGiven;
    }

    public void getTeamInfo() {
        System.out.println("Team name " + this.name);
        for (Participant participant : participants) {
            System.out.println("Cat " + participant.getName());

        }
    }

    public void showResults() {
        for (Participant participant : participants) {
            if (participant.onDistance()) {
                break;
            }
        }
    }

    public void doIt(Obstacle[] obstacle) {

        for (Participant participant : participants) {
            for (Obstacle obstacles : obstacle) {
                if (!obstacles.doIt(participant)) {
                    break;

                }

            }
        }
    }
}