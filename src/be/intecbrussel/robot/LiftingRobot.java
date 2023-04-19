package be.intecbrussel.robot;

public class LiftingRobot extends Robot{

    //properties

    private double maxLifeHeight;

    //methods

    public void lift(double height){

        if(height > this.maxLifeHeight || height < 0) {
            System.out.println("Lifting is not possible");
        } else {
            System.out.println("The lifting to the "+ height+ " height was successful.");
        }

    }

    //constructors

    public LiftingRobot(String unitName, double maxLifeHeight) {
        super(unitName);
        this.maxLifeHeight = maxLifeHeight;
    }

    @Override
    public String toString() {
        return "LiftingRobot{" + getUnitName() +
                " maxLifeHeight=" + maxLifeHeight +
                "} " + super.toString();
    }
}
