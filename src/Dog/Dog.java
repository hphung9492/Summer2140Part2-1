package Dog;

public class Dog {
    //attributes
    private String name;
    private String breed;
    private int age;

    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBreed(String newBreed)
    {
        this.breed = newBreed;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public String toString()
    {
        return "Name: " + name + "\nBreed: " + breed + "\nAge in calendar year: "
                + age + "\nAge in human years: " + this.getAgeInHumanYears();
    }

//    public void writeOutput() {
//        System.out.println("Name: " + name);
//        System.out.println("Breed: " + breed);
//        System.out.println("Age in calendar year: " + age);
//        System.out.println("Age in human years: " + this.getAgeInHumanYears());
//    }
    //if a dog's age is <= 2, then you will use this formula: age * 11
    //otherwise, 22 + (age - 2) * 5;

    public int getAgeInHumanYears() {
        int humanYears;
        if (this.age <= 2) {
            humanYears = this.age * 11;
        } else {
            humanYears = 22 + (this.age - 2) * 5;
        }
        return humanYears;
    }
}
