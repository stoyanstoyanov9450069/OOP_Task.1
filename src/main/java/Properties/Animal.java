package Properties;

import Interfaces.produceSound;
import Validators.IntegerValidator;
import Validators.StringValidator;

import java.util.Locale;

public abstract class Animal implements produceSound {

    private String name;
    private int age;
    private String gender;

    StringValidator validator = new StringValidator();
    IntegerValidator integerValidator = new IntegerValidator();

    protected Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        try {
            validator.isStringEmpty(name);
        } catch (NullPointerException exception) {
            System.out.println("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        try {
            integerValidator.isIntegerValid(age);
        } catch (Exception exception) {
            System.out.printf("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String produceSound() {
        return "";
    }
    @Override
    public String toString(){
        return String.format("%s%n %s %d%n", this.getClass().getSimpleName(), this.getName(), this.getAge(), this.getGender());
    }
}
