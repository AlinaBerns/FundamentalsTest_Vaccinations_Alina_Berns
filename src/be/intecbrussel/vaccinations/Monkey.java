package be.intecbrussel.vaccinations;

public class Monkey extends Animal {
    private boolean isHyperActive = true;

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }

    public Monkey() {
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "isHyperActive=" + isHyperActive +
                "} " + super.toString();
    }

    @Override
    public void treatAnimal() {
        this.isHyperActive = false;
        setClean(true);

    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        getIsVaccinated().put(disease, true);

    }
}
