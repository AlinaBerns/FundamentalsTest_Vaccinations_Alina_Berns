package be.intecbrussel.robot;

public abstract class Robot {

    //properties
    private String unitName;

    //methods
    public void boot () {

        System.out.println("*** " + this.unitName +" is loading... ***");

    }

    public String getUnitName () {

        return unitName;
    }

    //constructors
    public Robot() {

        boot();

    }

    public Robot(String unitName) {
        this.unitName = unitName;

        boot();
    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
