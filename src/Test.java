import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        int mathCount = 0;
        int scienceCount = 0;

        while (students.size() < 3) {
            try {
                System.out.println(UserQuestions.askToJoin);
                String joinAnswer = scanner.nextLine();

                if (!joinAnswer.equalsIgnoreCase("Y")) {
                    continue;
                }

                System.out.println(UserQuestions.askFirstName);
                String firstName = scanner.nextLine();

                System.out.println(UserQuestions.askLastName);
                String lastName = scanner.nextLine();

                System.out.println(UserQuestions.askAge);
                int age = scanner.nextInt();
                scanner.nextLine(); // consume the newline character

                Permission.checkAge(age);

                System.out.println(UserQuestions.askGender);
                String gender = scanner.nextLine();

                System.out.println(UserQuestions.askClassName);
                String className = scanner.nextLine();

                Permission.checkClassName(className);

                Student student;
                if (className.equalsIgnoreCase("Math")) {
                    student = new MathStudent(firstName, lastName, age, gender, className);
                    mathCount++;
                } else {
                    student = new ScienceStudent(firstName, lastName, age, gender, className);
                    scienceCount++;
                }

                students.add(student);
                System.out.println("Congratulations! You are registered for " + className + " class.");

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Math students = " + mathCount);
        System.out.println("Science students = " + scienceCount);

//COMPLETE THIS CLASS AFTER ALL THE OTHER CLASSES

        /*
        Write a code that asks user to if they would like join your classes
        If the answer is "Yes" from user,then ask user information; firstName, lastName, age, gender, class to join
        ***If user is age is not more than 20, do not allow them to join
        ***If user wants to join any other class except Math and Science, do not allow them to join

        REMEMBER - checkAge and checkClassName methods may throw exceptions. You have to handle them

        Keep asking users the question they would to like join until you have got 3 students overall
        Create MathStudent or ScienceStudent objects based on user's answer for the class they want to join
        Print a "Congratulations! You are registered for {className} class."

        Store all these 3 objects in a collection and print them

        EXPECTED OUTPUT OF THE PROGRAM:
        Print information of all 3 students
        Print how many students are MathStudent with message -> "Math students = {numberOfMathStudents}"
        Print how many students are ScienceStudent with message -> "Science students = {numberOfScienceStudents}"
         */

    }
}
