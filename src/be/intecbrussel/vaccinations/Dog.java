package be.intecbrussel.vaccinations;

public class Dog extends Animal {
    private boolean hasFoulBreath = true;

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasFoulBreath=" + hasFoulBreath +
                "} " + super.toString();
    }

    @Override
    public void treatAnimal() {
        this.hasFoulBreath = false;
        setClean(true);

    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        getIsVaccinated().put(disease, true);

    }
}
