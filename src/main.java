import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int input;
        do {
            System.out.println("Enter 1 for Add an Entry in Address Book");
            System.out.println("Enter 2 for Remove an Entry From Address Book");
            System.out.println("Enter 3 for Printing out the Given Entry");
            System.out.println("Enter 4 for Printing the Address Book");
            System.out.println("Enter 5 for Sort the List BY LastName");
            System.out.println("Enter 6 for Edit the Existing Entry");
            System.out.println("Enter 7 for Search an Entry");
            System.out.println("Enter 8 to save the AddressBook into the file");
            System.out.println("Enter 9 to Quit");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    person = new Person();
                    System.out.println("Enter the First Name of New Entity");
                    person.setFirstName(scanner.next());

                    System.out.println("Enter the Last Name of New Entity");
                    person.setLastName(scanner.next());

                    System.out.println("Enter the Phone No of New Entity");
                    person.setPhoneNo(scanner.next());

                    System.out.println("Enter the Address of New Entity");
                    person.setAddress(scanner.next());

                    System.out.println("Enter the Email Address of New Entity");
                    person.setEmailAddress(scanner.next());

                    addressBook.AddEntry(person);
                    break;
                case 2:
                    System.out.println("Enter the Index you want to delete");
                    addressBook.RemoveEntry(scanner.nextInt());
                    break;
                case 3:
                  System.out.println("Enter the Index you want to Print");
                  addressBook.PrintEntry(scanner.nextInt());
                  break;

                case 4:
                  System.out.println("All the entries of Address book is as Follow");
                  addressBook.PrintAddressBook();
                  break;
                case 5:
                    addressBook.SortByLastName();
                    break;
                case 6:
                    person = new Person();
                    System.out.println("Enter The Entry you want to Edit");
                    addressBook.EditEntry(scanner.nextInt(),person);
                    break;
                case 7:
                    System.out.println("Enter PhoneNo you want to found");
                    addressBook.SearchEntry(scanner.next());
                    break;
                case 8:
                 addressBook.SaveInFile();
            break;
                default:
                    System.out.println("Please Enter Correct Number");

            }


        }while (input!=9);
        System.out.println("Thankyou for using this program");
    }
}