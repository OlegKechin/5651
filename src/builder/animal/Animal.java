package builder.animal;

public class Animal {
    private final String name;
    private final int age;
    private final TypeAnimal type;
    public Animal(String name, int age, TypeAnimal type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public TypeAnimal getType() {
        return type;
    }
}
