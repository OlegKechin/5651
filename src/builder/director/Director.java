package builder.director;

import builder.animal.TypeAnimal;
import builder.build.Builder;

public class Director {
    public void createCat(Builder builder){
        builder.setName("Cat");
        builder.setAge(2);
        builder.setTypeAnimal(TypeAnimal.CAT);
    }
}
