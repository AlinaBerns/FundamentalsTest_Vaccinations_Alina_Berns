package be.intecbrussel.vaccinations;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Maak een app aan waarin je 10 dieren aanmaakt

        Cat cat = new Cat(false, 12, "Mary", 0, true);
        Dog dog = new Dog(false, 11, "Harry", 0, true);
        Monkey monkey = new Monkey(false, 8, "Kary", 0, true);
        Cat cat2 = new Cat(false, 3, "Mrrr", 0, true);
        Dog dog2 = new Dog(false, 5, "Gav", 0, true);
        Monkey monkey2 = new Monkey(false, 8, "Ann", 0, true);
        Cat cat3 = new Cat(false, 1, "Rita", 0, true);
        Dog dog3 = new Dog(false, 2, "Ryan", 0, true);
        Monkey monkey3 = new Monkey(false, 8, "Ida", 0, true);
        Cat cat4 = new Cat(false, 6, "Li", 0, true);

        //en toevoegt aan een zelfgemaakte animalshelter

        AnimalSchelter animalSchelter = new AnimalSchelter();

        //Test allemethoden van de animalshelter klasse.

        System.out.println("addAnimal(Animal animal) methode\n");

        //voeg een dier toe aan de lijst van animals.
        //De animalNumber van deanimal krijgt de waarde van animalId.
        //Daarna verhoog je de animalId met 1.
        //Zo krijgt elke animal eenunieke nummer.

        animalSchelter.addAnimal(cat);
        animalSchelter.addAnimal(monkey);
        animalSchelter.addAnimal(dog);
        animalSchelter.addAnimal(cat2);
        animalSchelter.addAnimal(monkey2);
        animalSchelter.addAnimal(dog2);
        animalSchelter.addAnimal(cat3);
        animalSchelter.addAnimal(monkey3);
        animalSchelter.addAnimal(dog3);
        animalSchelter.addAnimal(cat4);

        System.out.println("\nvaccinateAnimal(Disease) methode\n");

        //Deze method zal een dier vaccineren voor een bepaalde ziekte.
        //Zet er deboolean dus voor op true.

        cat.vaccinateAnimal(Disease.CHICKENPOCKS);
        dog2.vaccinateAnimal(Disease.HEPATITISA);
        dog3.vaccinateAnimal(Disease.POLIO);
        cat4.vaccinateAnimal(Disease.FLUE);
        monkey3.vaccinateAnimal(Disease.FLUE);
        monkey2.vaccinateAnimal(Disease.POLIO);
        monkey.vaccinateAnimal(Disease.CHICKENPOCKS);
        cat2.vaccinateAnimal(Disease.CHICKENPOCKS);
        cat3.vaccinateAnimal(Disease.FLUE);
        dog.vaccinateAnimal(Disease.FLUE);
        dog.vaccinateAnimal(Disease.CHICKENPOCKS);
        cat.vaccinateAnimal(Disease.FLUE);
        dog2.vaccinateAnimal(Disease.POLIO);
        dog3.vaccinateAnimal(Disease.HEPATITISA);

        System.out.println("\ntreatAnimal() methode\n");

        //zorgt ervoor dat een animal clean gemaakt wordt.
        //Indien je aan het werken bent meteen cat, dog of monkey,
        //zorg er dan voor dat de treatAnimal methode ook de hyperactivity,
        //delongnails en de foulbreath problemen oplost. (op false zet)

        cat2.treatAnimal();
        dog3.treatAnimal();
        monkey3.treatAnimal();
        cat4.treatAnimal();
        dog.treatAnimal();
        monkey2.treatAnimal();

        System.out.println("\nsortAnimals() methode\n");

        //sorteert de dieren volgens hun natuurlijke volgorde,
        //dit is volgens hun animalNumber.

        animalSchelter.sortAnimals();

        System.out.println("\nsortAnimalsByName() methode\n");

        //sorteert de dieren op naam.

        animalSchelter.sortAnimalsByName();

        System.out.println("\nsortAnimalsByAge() methode\n");

        //sorteert de dieren op leeftijd.

        animalSchelter.sortAnimalsByAge();

        System.out.println("\nprintAnimalsNotVaccinated(Disease) methode\n");

        //print alle dieren af die niet gevaccineert zijn voor eenopgegeven ziekte.

        animalSchelter.printAnimalsNotVaccinated(Disease.HEPATITISA);
        System.out.println("-".repeat(50));

        animalSchelter.printAnimalsNotVaccinated(Disease.FLUE);
        System.out.println("-".repeat(50));

        animalSchelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        System.out.println("-".repeat(50));

        animalSchelter.printAnimalsNotVaccinated(Disease.POLIO);

        System.out.println("\nfindAnimal(int) methode\n");

        //zoek dier op dierennummer

        System.out.println(animalSchelter.findAnimal(10011));

        System.out.println("\nfindAnimal(String) methode\n");

        //zoek dier op dierennaam

        System.out.println(animalSchelter.findAnimal("Ida"));

        System.out.println("\ntreatAnimal(int) methode\n");

        //behandel opgegeven dier

        animalSchelter.treatAnimal(1012);
        System.out.println(animalSchelter.findAnimal(10012));

        System.out.println("\ntreatAnimal(String) methode\n");

        //behandel opgegeven dier

        animalSchelter.treatAnimal("Li");
        System.out.println(animalSchelter.findAnimal("Li"));

        System.out.println("\ntreatAllAnimals() methode\n");

        //behandel alle dieren

        animalSchelter.treatAllAnimals();
        animalSchelter.printAnimals();

        System.out.println("\nfindOldestAnimal() methode\n");

        //geef het oudste dier terug

        System.out.println(animalSchelter.findOldestAnimal());

        System.out.println("\ncountAnimals() methode\n");

        //geef aantal dieren terug

        System.out.println(animalSchelter.countAnimals());
    }
}
