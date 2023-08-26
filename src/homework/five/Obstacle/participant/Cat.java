package homework.five.Obstacle.participant;

public class Cat implements Participant {
    private String name;
    private boolean onDistance;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.onDistance = true;
        this.maxJumpHeight = maxJumpHeight;

    }

    @Override
    public boolean jump (int height) {
        if(height <= maxJumpHeight){
            System.out.println("Participant " + name + " passed the obstacle " + "Wall " + height + " m");
            return true;
        }else {
            System.out.println("Participant "+  name + " didn't pass the obstacle" + "Wall " + height + " m");
            onDistance = false;
            return false;
        }
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Participant" + name + " passed the obstacle " + "Wall" + distance + "m");
        return true;
    }else {
            System.out.println("Participant" + name + " didn't pass the obstacle" + " Wall" + distance + " m");
            onDistance = false;
            return false;
        }
    }

    @Override
    public boolean onDistance() {
        return onDistance;
    }

    @Override
    public String getName() {
        return name;
    }


}
