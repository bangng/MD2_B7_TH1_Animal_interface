import rikkei.academy.Animal;
import rikkei.academy.Chicken;
import rikkei.academy.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:
             animals) {
            System.out.println(animal.makeSound());
        }
    }

}