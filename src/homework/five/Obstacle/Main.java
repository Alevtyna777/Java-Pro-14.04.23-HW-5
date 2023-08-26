package homework.five.Obstacle;

import homework.five.Obstacle.Obstacle;
import homework.five.Obstacle.participant.Cat;
import homework.five.Obstacle.participant.Person;
import homework.five.Obstacle.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[]{
                new Treadmill( "Trademill", 3),
                new Wall( "Wall", 3)

        };
        Team team = new Team(" Winers",
                new Cat("Snezha", 2, 6),
                new Person( "Makosha", 9, 6),
                new Robot("Layla",9,7));
        team.getTeamInfo();
team.doIt(obstacles );
team.showResults();




    }
}
