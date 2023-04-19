package be.intecbrussel.robot;

public class BendingRobot extends Robot {

    //properties

    private double maxBendAngle;

    //methods

    public void bend (double bendAngle) { //hoek normalisatie????????

        if(bendAngle > this.maxBendAngle || bendAngle < 0) {
                System.out.println("Bending is not allowed");
        } else {
            System.out.println("The bending was successful. Required bending angle: " + bendAngle + "°");
        }
    }

    public double normalize360 (double bendAngle) {
        //hoek normalisatie????????
        //een hoek buiten het bereik naar een hoek binnen
        //het opgegeven bereik brengen.
        // Tegelijkertijd moet de hoek "visueel" hetzelfde blijven.

        bendAngle = bendAngle % 360;

        if (bendAngle < 0) {
            bendAngle = bendAngle + 360;
        }

        return bendAngle;
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
