// Jonathan Sonnek
// May 7 2026
// Teacher APP

import java.util.Scanner;

public class Main {
    static Scanner userinput = new Scanner(System.in);

    static int intTry(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (userinput.hasNextInt()) {
                int value = userinput.nextInt();
                userinput.nextLine();
                return value;
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                userinput.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        int people = intTry("How many people do you want to create? ");
        int students = intTry("How many students do you want to create? ");
        int teachers = intTry("How many teachers do you want to create? ");

        Person[] personArray = new Person[people];
        for (int i = 0; i < people; i++) {
            personArray[i] = new Person();
            System.out.println("--- Person " + (i + 1) + " ---");
            System.out.print("First name: ");
            personArray[i].firstName = userinput.nextLine();
            System.out.print("Last name: ");
            personArray[i].lastName = userinput.nextLine();
            System.out.print("Gender: ");
            personArray[i].gender = userinput.nextLine();
            personArray[i].age = intTry("Age: ");
            System.out.print("Weight (lbs): ");
            personArray[i].weight = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("Height (in): ");
            personArray[i].height = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("Ethnicity: ");
            personArray[i].ethnicity = userinput.nextLine();
            System.out.print("Religion: ");
            personArray[i].religion = userinput.nextLine();
        }

        Student[] studentArray = new Student[students];
        for (int i = 0; i < students; i++) {
            studentArray[i] = new Student();
            System.out.println("--- Student " + (i + 1) + " ---");
            System.out.print("First name: ");
            studentArray[i].firstName = userinput.nextLine();
            System.out.print("Last name: ");
            studentArray[i].lastName = userinput.nextLine();
            System.out.print("Gender: ");
            studentArray[i].gender = userinput.nextLine();
            studentArray[i].age = intTry("Age: ");
            System.out.print("Weight (lbs): ");
            studentArray[i].weight = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("Height (in): ");
            studentArray[i].height = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("Ethnicity: ");
            studentArray[i].ethnicity = userinput.nextLine();
            System.out.print("Religion: ");
            studentArray[i].religion = userinput.nextLine();
            System.out.print("Major: ");
            studentArray[i].major = userinput.nextLine();
            System.out.print("Year (Freshman/Sophomore/Junior/Senior): ");
            studentArray[i].year = userinput.nextLine();
            System.out.print("Email: ");
            studentArray[i].email = userinput.nextLine();
        }

        Teacher[] teacherArray = new Teacher[teachers];
        for (int i = 0; i < teachers; i++) {
            teacherArray[i] = new Teacher();
            System.out.println("--- Teacher " + (i + 1) + " ---");
            System.out.print("First name: ");
            teacherArray[i].firstName = userinput.nextLine();
            System.out.print("Last name: ");
            teacherArray[i].lastName = userinput.nextLine();
            System.out.print("Gender: ");
            teacherArray[i].gender = userinput.nextLine();
            teacherArray[i].age = intTry("Age: ");
            System.out.print("Weight (lbs): ");
            teacherArray[i].weight = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("Height (in): ");
            teacherArray[i].height = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("Ethnicity: ");
            teacherArray[i].ethnicity = userinput.nextLine();
            System.out.print("Religion: ");
            teacherArray[i].religion = userinput.nextLine();
            System.out.print("Subject: ");
            teacherArray[i].subject = userinput.nextLine();
        }

        System.out.println("--- All Data ---");
        System.out.println("--- People ---");
        for (int i = 0; i < people; i++) {
            personArray[i].printInfo();
        }
        System.out.println("--- Students ---");
        for (int i = 0; i < students; i++) {
            studentArray[i].printInfo();
        }
        System.out.println("--- Teachers ---");
        for (int i = 0; i < teachers; i++) {
            teacherArray[i].printInfo();
        }

        // Tasks
        while (true) {
            System.out.println("\nWho do you want to interact with?");
            if (people > 0) System.out.println("1. Person");
            if (students > 0) System.out.println("2. Student");
            if (teachers > 0) System.out.println("3. Teacher");
            System.out.println("0. Exit");
            int typeChoice = intTry("Choice: ");

            if (typeChoice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (typeChoice == 1) {
                int idx = intTry("Which person (1-" + people + ")? ") - 1;
                Person p = personArray[idx];

                System.out.println("1. Greeting  2. Prayer  3. Nap  4. Eat  5. Print Name  6. Change Religion");
                int task = intTry("Choice: ");

                if (task == 1) p.greeting();
                else if (task == 2) p.prayer();
                else if (task == 3) p.nap();
                else if (task == 4) p.eatSomething();
                else if (task == 5) p.printName();
                else if (task == 6) {
                    System.out.print("New religion: ");
                    p.changeReligion(userinput.nextLine());
                }

            } else if (typeChoice == 2) {
                int idx = intTry("Which student (1-" + students + ")? ") - 1;
                Student s = studentArray[idx];

                System.out.println("1. Greeting  2. Prayer  3. Nap  4. Eat  5. Print Name  6. Change Religion  7. Go to Class");
                int task = intTry("Choice: ");

                if (task == 1) s.greeting();
                else if (task == 2) s.prayer();
                else if (task == 3) s.nap();
                else if (task == 4) s.eatSomething();
                else if (task == 5) s.printName();
                else if (task == 6) {
                    System.out.print("New religion: ");
                    s.changeReligion(userinput.nextLine());
                }
                else if (task == 7) s.goToClass();

            } else if (typeChoice == 3) {
                int idx = intTry("Which teacher (1-" + teachers + ")? ") - 1;
                Teacher t = teacherArray[idx];

                System.out.println("1. Greeting  2. Prayer  3. Nap  4. Eat  5. Print Name  6. Change Religion  7. Lecture");
                int task = intTry("Choice: ");

                if (task == 1) t.greeting();
                else if (task == 2) t.prayer();
                else if (task == 3) t.nap();
                else if (task == 4) t.eatSomething();
                else if (task == 5) t.printName();
                else if (task == 6) {
                    System.out.print("New religion: ");
                    t.changeReligion(userinput.nextLine());
                }
                else if (task == 7) t.lecture();
            }
        }
    }
}