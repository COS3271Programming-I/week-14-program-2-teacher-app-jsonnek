public class Teacher extends Person{
    protected String subject;

    void lecture() {
        System.out.println("I am teaching class right now, don't bother me.");
    }
    @Override
    void greeting() {
        System.out.println("Good morning class.");
    }

    @Override
    void printInfo() {
        System.out.println("Class:      Teacher");
        System.out.println("Name:       " + firstName + " " + lastName);
        System.out.println("Gender:     " + gender);
        System.out.println("Age:        " + age);
        System.out.println("Weight:     " + weight + " lbs");
        System.out.println("Height:     " + height + " in");
        System.out.println("Ethnicity:  " + ethnicity);
        System.out.println("Religion:   " + religion);
        System.out.println("Subject:    " + subject);
    }
}
