package rikkei.academy.animals;

import rikkei.academy.Edible.Edible;

import java.security.spec.ECField;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: Cluck-cluck!!!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
