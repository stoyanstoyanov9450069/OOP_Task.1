package Repository;

import Animals.*;
import org.javatuples.Triplet;

import java.util.*;
import Properties.*;

public class AnimalRepository {

    private List<Animal> animals;

    public AnimalRepository() {
        this.animals = new ArrayList<>();
    }

    public void insertAnimal(Animal animal){
        animals.add(animal);
    }


    public void printAnimalRepository(){
        for (int currentAnimal = 0; currentAnimal < animals.size() ; currentAnimal++) {
            Animal animal =  animals.get(currentAnimal);
            System.out.println(animal);
            System.out.println(animal.produceSound());
        }
    }
}
