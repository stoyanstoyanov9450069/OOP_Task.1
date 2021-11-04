package Animals;

import Properties.Animal;

public class Dog extends Animal {


    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
       return  "BauBau";
    }
}
