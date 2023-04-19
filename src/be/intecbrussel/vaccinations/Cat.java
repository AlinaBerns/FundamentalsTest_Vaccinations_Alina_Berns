package be.intecbrussel.vaccinations;

import java.util.EnumMap;
import java.util.Map;

public class Cat extends Animal {
    private boolean hasLongNails = true;


    public Cat(boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasLongNails=" + hasLongNails +
                "} " + super.toString();
    }

    @Override
    public void treatAnimal() {
        setClean(true);
        this.hasLongNails = false;

    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        getIsVaccinated().put(disease, true);
    }
}
