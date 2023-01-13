import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();

        fish.setName("Fish");
        fish.setWeight(1.2);
        fish.setLength(1.5);
        fish.setKind("Lasos");

        System.out.println("The name of this fish: " + fish.getName());
        System.out.println("The weight of this fish: " + fish.getWeight() + " kg");
        System.out.println("The length of this fish: " + fish.getLength() + " sm");
        System.out.println("Kind of fish: " + fish.getKind());
        System.out.println("--------------------------------------------------------------------");

        Parrot parrot = new Parrot();

        parrot.setName("Patric");
        parrot.setAge(1);
        parrot.setColor("Colorful");
        parrot.setGender("Rectangular head");
        parrot.setWeight(0.5);

        System.out.println("The name of this Parrot: " + parrot.getName());
        System.out.println("The age of this Parrot: " + parrot.getAge());
        System.out.println("the color of this Parrot " + parrot.getColor());
        System.out.println("The gender of this Parrot: " + parrot.getGender());
        System.out.println("The weight of this Parrot: " +parrot.getWeight());
        System.out.println("---------------------------------------------------------------------");




        Cat cat = new Cat();

        cat.setName("Mia");
        cat.setAge(2);
        cat.setWeight(1.2);
        cat.setColor("Gray");

        System.out.println("The name of this Cat: " + cat.getName());
        System.out.println("The age of this Cat: " + cat.getAge());
        System.out.println("The weight of this Cat: " +cat.getWeight());
        System.out.println("the color of this Cat " + cat.getColor());
        System.out.println("--------------------------------------------------------------------");



        Dog dog = new Dog();

        dog.setName("Chester");
        dog.setAge(2);
        dog.setBreed("Beagle");
        dog.setColor("Braun");
        dog.setGender("Male");
        dog.setWeight(4.3);

        System.out.println("The name of this Dog: " + dog.getName());
        System.out.println("The age of this Dog: " + dog.getAge());
        System.out.println("Breed of this Dog: " + dog.getBreed());
        System.out.println("the color of this Dog " + dog.getColor());
        System.out.println("The gender of this Dogs: " + dog.getGender());
        System.out.println("The weight of this Dog: " +dog.getWeight());


    }
}