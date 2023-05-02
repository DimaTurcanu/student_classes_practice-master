public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String className;

    public Student(String firstName, String lastName, int age, String gender, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Age: %d, Gender: %s, Class: %s", firstName, lastName, age, gender, className);
    }


    //COMPLETE THIS CLASS BEFORE MathStudent and ScienceStudent classes as they will be sub-classes of Student class


    //HERE! Create a 5 args constructor



    /*
    HERE!
    Create private instance variables as below
    firstName
    lastName
    age
    gender
    className
    NOTE: only age will be int and others are String
     */



    /*
    HERE!
    Provide public getter method for className only
     */



    /*
        HERE!
        Override toString() method that returns Student object information
        It should be dynamic considering child classes that inherits
     */

}
