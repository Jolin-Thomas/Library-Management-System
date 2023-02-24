import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    //scanner object
    public static Scanner sc = new Scanner(System.in);
    //class object
    public static MenuFunctions mf = new MenuFunctions();
    public static HashMap<String, String> admin = new HashMap<>();
    public static ArrayList<String> book_list = new ArrayList<>();
    public static ArrayList<String> member_list = new ArrayList<>();
    public static HashMap<String, String> member_issued_book = new HashMap<>();

    //constructor
    Main() {
        admin.put("jolin", "jolin123");
        admin.put("a", "a1");
    }

    //main method
    public static void main(String[] args) {menu();}

    //menu method
    public static void menu() {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        //Main class instantiated to call the constructor
        new Main();

        //heading and menu list
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Library");
        System.out.println("Menu\n~~~~\n1. Add a book\n2. Add a member\n3. Issue a book\n4. Return a book\n5. Display all books\n6. Display all members\n7. Display all issued books\n8. Exit\n");

        //choice from user
        System.out.print("Enter your choice: ");
        String choice = sc.nextLine();

        //switch-case leading to the respective methods
        switch (choice) {
            //to add a book
            case "1" -> book_list = mf.addBook(book_list, admin);
            //to add a member
            case "2" -> member_list = mf.addMember(member_list, admin);
            //to issue a book
            case "3" -> member_issued_book = mf.issueBook(member_issued_book, member_list, book_list);
            //to return an issued book
            case "4" -> member_issued_book = mf.returnBook(member_issued_book);
            //to display books in the library
            case "5" -> mf.displayBook(book_list);
            //to display the members of the library
            case "6" -> mf.displayMember(member_list);
            //to display the issued books along with the member's name
            case "7" -> mf.displayIssuedBook(member_issued_book);
            //to exit the E-Library
            case "8" -> {
                System.out.println("Thank you, come again!!!");
                System.exit(0);
            }
            default -> System.out.println("Invalid Choice");
        }

        //calls the menu method again until exited by the user
        menu();
    }
}