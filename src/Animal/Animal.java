package Animal;

public class Animal {
    private String species;
    private String name;
    private String gender;

    //no arg constructor
    public Animal(){
        this("Dog","Budah", "Girl" );
    }

    //constructor with three parameters
    public Animal(String species, String name, String gender)
    {
        this.species = species;
        this.name = name;
        this.gender = gender;
    }

    public String getSpecies(){
        return species;
    }
}
