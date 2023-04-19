package be.intecbrussel.robot;

public class BendingRobot extends Robot {

    //properties

    private double maxBendAngle;

    //methods

    public void bend (double bendAngle) { //????????

        if(bendAngle > this.maxBendAngle || bendAngle < 0) {
            System.out.println("Bending is not allowed");
        } else {
            System.out.println("The bending was successful. Required bending angle: " + bendAngle + "°");
        }
    }

    //constructors

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    @Override
    public String toString() {
        return "BendingRobot{" + getUnitName() +
                " maxBendAngle=" + maxBendAngle +
                "} " + super.toString();
    }
}
