package builder;

import builder.animal.Animal;
import builder.build.BuilderAnimal;
import builder.director.Director;

public class Run {
    public static void main(String[] args) {
        Director director = new Director();

        BuilderAnimal builderAnimal = new BuilderAnimal();
        director.createCat(builderAnimal);
        Animal animal = builderAnimal.getAnimal();
        System.out.println(animal.getType());
        //66+35


    }
}
