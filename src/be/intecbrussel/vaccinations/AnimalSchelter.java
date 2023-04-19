package be.intecbrussel.vaccinations;

import java.util.*;
import java.util.stream.Stream;

public class AnimalSchelter {
    private List<Animal> animals;
    private int animalId = 10010;

    public void printAnimals() {
        animals.forEach(System.out::println);
    }

    public void sortAnimals() {
        animals.stream().sorted(Comparator.comparing(Animal::getAnimalNumber))
                .forEach(System.out::println);
    }

    public void sortAnimalsByName() {
        animals.stream().sorted(Comparator.comparing(Animal::getName))
                .forEach(System.out::println);
    }

    public void sortAnimalsByAge() {
        animals.stream().sorted(Comparator.comparing(Animal::getAge))
                .forEach(System.out::println);
    }

    public void printAnimalsNotVaccinated(Disease disease) {
        for (Animal animal : animals) {
            if (Boolean.FALSE.equals(animal.getIsVaccinated().get(disease))) {
                System.out.println(animal);
            }
        }

    }

    public Optional<Animal> findAnimal(int animalNumber) {

        for (Animal animal : animals) {
            if (animalNumber == animal.getAnimalNumber()) {
                return Optional.of(animal);
            }
        }
        return Optional.empty();
    }

    public Optional<Animal> findAnimal(String name) {
        for (Animal animal : animals) {
            if (Objects.equals(name, animal.getName())) {
                return Optional.of(animal);
            }
        }

        return Optional.empty();
    }

    public void treatAnimal(int animalNumber) {
        for (Animal animal : animals) {
            if (animalNumber == animal.getAnimalNumber()) {
                animal.treatAnimal();
            }
        }
    }

    public void treatAnimal(String name) {
        for (Animal animal : animals) {
            if (name.equals(animal.getName())) {
                animal.treatAnimal();
            }
        }

    }

    public void treatAllAnimals() {
        for (Animal animal : animals) {
            animal.treatAnimal();
        }
    }

    public Animal findOldestAnimal() {
        return animals
                .stream()
                .max(Comparator.comparing(Animal::getAge))
                .get();
    }

    public int countAnimals() {
        return animals.size();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setAnimalNumber(animalId);
        animalId++;
    }

    public AnimalSchelter() {
        animals = new ArrayList<Animal>();


    }

    public AnimalSchelter(int animalid) {
        this.animalId = animalid;
    }

    @Override
    public String toString() {
        return "AnimalSchelter{" +
                "animals=" + animals +
                ", animalId=" + animalId +
                '}';
    }
}
