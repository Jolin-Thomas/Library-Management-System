import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuFunctions {
    Timer time = new Timer();
    Scanner sc = new Scanner(System.in);

    //case 1 to add a book
    public ArrayList<String> addBook(ArrayList<String> book_list, HashMap<String, String> admin) {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tAdd a book");
        String admin_name, admin_pass;
        System.out.println("Verify that you are an Admin");
        System.out.print("Enter the admin name: ");
        admin_name = sc.nextLine();
        if(admin.containsKey(admin_name)) {
            System.out.print("Enter the password: ");
            admin_pass = sc.nextLine();
            if(admin.get(admin_name).equals(admin_pass)) {
                System.out.println("Access Granted");
                System.out.print("Enter the name of the Book: ");
                book_list.add(sc.nextLine());
                System.out.print("Book Added Successfully");
                time.timer();
                return book_list;
            }
            else{
                String ch;
                System.out.print("Wrong password\nDo you want to go to Main Menu[y/n]: ");
                ch = sc.nextLine();
                if(ch.equals("y")) {
                    //fake
                }
                else{
                    System.exit(0);
                }
            }
        }
        else{
            String ch;
            System.out.print("This is not an admin\nDo you want to go to Main Menu[y/n]: ");
            ch = sc.nextLine();
            if(ch.equals("y")) {
                //fake
            }
            else{
                System.exit(0);
            }
        }
        return book_list;
    }

    //case 2 to add a member
    public ArrayList<String> addMember(ArrayList<String> member_list, HashMap<String, String> admin) {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tAdd a Member");
        String admin_name, admin_pass;
        System.out.println("Verify that you are an Admin");
        System.out.print("Enter the admin name: ");
        admin_name = sc.nextLine();
        if(admin.containsKey(admin_name)) {
            System.out.print("Enter the password: ");
            admin_pass = sc.nextLine();
            if(admin.get(admin_name).equals(admin_pass)) {
                System.out.println("Access Granted");
                System.out.print("Enter the name of the Member: ");
                member_list.add(sc.nextLine());
                System.out.print("Member Added Successfully");
                time.timer();
                return member_list;
            }
            else{
                String ch;
                System.out.print("Wrong password\nDo you want to go to Main Menu[y/n]: ");
                ch = sc.nextLine();
                if(ch.equals("y")) {
                    //fake
                }
                else{
                    System.exit(0);
                }
            }
        }
        else{
            String ch;
            System.out.print("This is not an admin\nDo you want to go to Main Menu[y/n]: ");
            ch = sc.nextLine();
            if(ch.equals("y")) {
                //fake
            }
            else{
                System.exit(0);
            }
        }
        return member_list;
    }

    //case 3 to issue a book
    public HashMap<String, String> issueBook(HashMap<String, String> member_issued_book, ArrayList<String> member_list, ArrayList<String> book_list) {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        String member_name, book_name;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tIssue a book");
        System.out.print("Enter your name: ");
        member_name = sc.nextLine();
        System.out.print("Enter the name of the book: ");
        book_name = sc.nextLine();
        if(member_list.contains(member_name) && book_list.contains(book_name)) {
            member_issued_book.put(member_name, book_name);
            System.out.println("The book had been issued successfully");
            time.timer();
        }
        else{
            System.out.println("Either the book or the member does not exist");
        }
        return member_issued_book;
    }

    //case 4 to return an issued book
    public HashMap<String, String> returnBook(HashMap<String, String> member_issued_book) {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        String member_name, book_name;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tReturn a book");
        System.out.print("Enter your name: ");
        member_name = sc.nextLine();
        System.out.print("Enter the name of the book: ");
        book_name = sc.nextLine();
        if(member_issued_book.containsKey(member_name) && member_issued_book.containsValue(book_name)) {
            member_issued_book.remove(member_name);
            System.out.print("The book had been returned successfully");
            time.timer();
        }
        else{
            System.out.println("Either the book or the member does not exist");
        }
        return member_issued_book;
    }

    //case 5 to display the books in the library
    public void displayBook(ArrayList<String> book_list) {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tDisplay books");
        String ch;
        for(String book: book_list) {
            System.out.println(book);
        }
        System.out.print("Do you want to go to Main Menu[y/n]");
        ch = sc.nextLine();
        if(ch.equals("y")) {
            Main.menu();
        }
        else {
            System.exit(0);
        }
    }

    //case 6 to display the members of the library
    public void displayMember(ArrayList<String> member_list) {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tDisplay Members");
        String ch;
        for(String member: member_list) {
            System.out.println(member);
        }
        System.out.print("Do you want to go to Main Menu[y/n]");
        ch = sc.nextLine();
        if(ch.equals("y")) {
            Main.menu();
        }
        else {
            System.exit(0);
        }
    }

    //case 7 to display the issued books along with the member's name
    public void displayIssuedBook(HashMap<String, String> member_issued_book) {
        //only works in terminal to clear screen
        System.out.print("\033\143");
        System.out.flush();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tDisplay Issued books");
        System.out.println("Member\t\t\tBook issued");
        String ch;
        for(String member: member_issued_book.keySet()) {
            System.out.printf("%s\t\t\t%s\n", member, member_issued_book.get(member));
        }
        System.out.print("Do you want to go to Main Menu[y/n]");
        ch = sc.nextLine();
        if(ch.equals("y")) {
            Main.menu();
        }
        else {
            System.exit(0);
        }
    }
}
