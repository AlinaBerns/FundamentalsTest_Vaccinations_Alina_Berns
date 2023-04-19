package be.intecbrussel.robot;

public class CrazyRobot extends Robot{
    public void boot(){

        System.out.println
                ("*** " + new StringBuilder(getUnitName())
                        .reverse() + " is loading... ***");
    }

    //constructors
    public CrazyRobot() {

    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public String toString() {
        return "CrazyRobot{ "+ getUnitName() +" } " + super.toString();
    }
}
