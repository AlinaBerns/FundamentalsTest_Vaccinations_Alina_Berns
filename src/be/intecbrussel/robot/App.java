package be.intecbrussel.robot;

public class App {

    public static void main(String[] args) {
        BendingRobot bendingRobot = new BendingRobot("Rick", 5);
        bendingRobot.bend(6);
        bendingRobot.bend(2);
        System.out.println(bendingRobot.normalize360(-34));

        LiftingRobot liftingRobot = new LiftingRobot("Ann", 100);
        liftingRobot.lift(101);
        liftingRobot.lift(34);

        CrazyRobot crazyRobot = new CrazyRobot("Gregory");
    }
}
