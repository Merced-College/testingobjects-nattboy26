/*
 * Nathanael Obrey
 * 9/9/2025
 * CPSC-39
 */

public class Dog {

    //data variables, they describe our Dog objects in the computer
    private String name;
    private int age;
    private String breed;

    //default constructor
    public Dog () {
        this.name = "Hank";
        this.age = 1;
        this.breed = "Lab";
    }//end default constructor

    //non-default constructor
    public Dog (String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }//end non-default constructor

    //setters - accessors
    public void setName(String name) {
        this.name = name;
    }//end setName

    public void setAge(int age) {
        this.age = age;
    }//end setAge

    public void setBreed(String breed) {
        this.breed = breed;
    }//end setBreed

    //getters - mutators
    public String getName() {
        return name;
    }//end getName

    public int getAge() {
        return age;
    }//end getAge

    public String getBreed() {
        return breed;
    }//end getBreed

    public String toString() {
        return name + ", " + age + ", " + breed;
    }//end toString

}//end Dog class