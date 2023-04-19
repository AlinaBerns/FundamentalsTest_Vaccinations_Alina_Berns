package be.intecbrussel.vaccinations;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public abstract class Animal implements Vaccinateable, Treatable {
    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean = false;
    private int age;
    private String name;
    private int animalNumber;

    public Animal() {
        isVaccinated = new EnumMap<Disease, Boolean>(Disease.class);
        for (Disease disease : Disease.values()) {
            isVaccinated.putIfAbsent(disease, false);
        }
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;

        isVaccinated = new EnumMap<Disease, Boolean>(Disease.class);
        for (Disease disease : Disease.values()) {
            isVaccinated.putIfAbsent(disease, false);
        }
        System.out.println(getName() + isVaccinated);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean getIsClean() {
        return this.isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return isClean == animal.isClean && age == animal.age && animalNumber == animal.animalNumber && Objects.equals(getIsVaccinated(), animal.getIsVaccinated()) && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsVaccinated(), isClean, age, getName(), animalNumber);
    }

    @Override
    public String toString() {
        return "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber + '}';
    }
}

