public class Student extends Person {
    protected String major;
    protected String year;
    protected String email;

    void goToClass() {
        System.out.println("Walking to class...");
    }

    @Override
    void eatSomething() {
        System.out.println("I am eating a hamburger.");
    }

    @Override
    void printInfo() {
        System.out.println("Class:      Student");
        System.out.println("Name:       " + firstName + " " + lastName);
        System.out.println("Gender:     " + gender);
        System.out.println("Age:        " + age);
        System.out.println("Weight:     " + weight + " lbs");
        System.out.println("Height:     " + height + " in");
        System.out.println("Ethnicity:  " + ethnicity);
        System.out.println("Religion:   " + religion);
        System.out.println("Major:      " + major);
        System.out.println("Year:       " + year);
        System.out.println("Email:      " + email);
    }
}