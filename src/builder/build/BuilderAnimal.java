package builder.build;

import builder.animal.Animal;
import builder.animal.TypeAnimal;

public class BuilderAnimal implements Builder {
    private String name;
    private int age;
    private TypeAnimal type;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setTypeAnimal(TypeAnimal type) {
        this.type = type;
    }

    public Animal getAnimal() {
        return new Animal(name, age, type);
    }
}
