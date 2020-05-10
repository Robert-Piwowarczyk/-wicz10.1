import java.util.Scanner;

public class detailsPerson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String firstName = sc.nextLine();
        try {
            Person newPerson = new Person("Jan", "Kowalski", 2, 3333);
        } catch (NameUndefinedException e) {
            System.out.println("Podaj nazwisko:");
            String lastName = sc.nextLine();
            try {
                Person newPerson = new Person("Jan", "Kowalski", 2, 3333);
            } catch (NameUndefinedException ex) {
                System.out.println("Podaj wiek:");
                int age = sc.nextInt();
                try {
                    Person newPerson = new Person("Jan", "Kowalski", 2, 3333);
                } catch (IncorrectAgeException ext) {
                    System.out.println("Podaj pesel:");
                    int pesel = sc.nextInt();
                    try {
                        Person newPerson = new Person("Jan", "Kowalski", 2, 3333);
                    } catch (IncorrectAgeException exte) {
                    }
                }
            }
        }
    }
}


