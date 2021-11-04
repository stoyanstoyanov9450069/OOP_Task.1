import Animals.*;
import Repository.AnimalRepository;
import org.javatuples.Triplet;
import org.javatuples.Tuple;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Cat cat = new Cat("Tom", 2, "Male");

        Dog dog = new Dog("Dingo", 3, "male");

        Frog frog = new Frog("Jaba", 1, "female");

        Kitten kitten = new Kitten("Yuumi", 100, "female");

        Tomcat tomcat = new Tomcat("Rengo", 40, "male");

        AnimalRepository animalRepository = new AnimalRepository();

        animalRepository.insertAnimal(cat);
        animalRepository.insertAnimal(dog);
        animalRepository.insertAnimal(frog);
        animalRepository.insertAnimal(kitten);
        animalRepository.insertAnimal(tomcat);

        animalRepository.printAnimalRepository();
    }
}
