import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

    public class AddressBook {
    private ArrayList<Person> Addressbook = new ArrayList<Person>();
    Scanner scanner = new Scanner(System.in);
    Person person = new Person();

    public void AddEntry(Person person) {
        Addressbook.add(person);
        System.out.println("Successfully Added An Entity in a Address Book");
    }

    public void RemoveEntry(int index1) {
        Addressbook.remove(index1);
    }

    public void PrintEntry(int index) {
        System.out.println("FirstName   " + Addressbook.get(index).getFirstName());
        System.out.println("LastName     " + Addressbook.get(index).getLastName());
        System.out.println("PhoneNo     " + Addressbook.get(index).getPhoneNo());
        System.out.println("Address     " + Addressbook.get(index).getAddress());
        System.out.println("Email     " + Addressbook.get(index).getEmailAddress());
    }

    public void PrintAddressBook() {
        for (int i = 0; i < Addressbook.size(); i++) {
            System.out.println("All the Entries of " + i + " index");
            System.out.println("FirstName   " + Addressbook.get(i).getFirstName());
            System.out.println("LastName     " + Addressbook.get(i).getLastName());
            System.out.println("PhoneNo     " + Addressbook.get(i).getPhoneNo());
            System.out.println("Address     " + Addressbook.get(i).getAddress());
            System.out.println("Email     " + Addressbook.get(i).getEmailAddress());
        }
    }

    public void SortByLastName() {
        ArrayList<String> lastname = new ArrayList<String>();
        for(int i =0; i< Addressbook.size();i++) {
            lastname.add(Addressbook.get(i).getLastName());
        }
        Collections.sort(lastname);
        System.out.println("Last names of Address Book are " + lastname);
}

     public void EditEntry(int index,Person person){
        Addressbook.set(index,person);
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
    }

      public void SearchEntry(String PhoneNo) {
          for (int i = 0; i < Addressbook.size(); i++) {

              if (PhoneNo.equals(Addressbook.get(i).getPhoneNo())) {
                  System.out.println("All the Entries of " + i + " index");
                  System.out.println("FirstName   " + Addressbook.get(i).getFirstName());
                  System.out.println("LastName     " + Addressbook.get(i).getLastName());
                  System.out.println("Address     " + Addressbook.get(i).getAddress());
                  System.out.println("Email     " + Addressbook.get(i).getEmailAddress());
              }

          }
      }
      public void SaveInFile() {
       try {
        File myObj = new File("AddressBook.txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
     } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    try {
        FileWriter myWriter = new FileWriter("AddressBook.txt");
        for (int i = 0; i < Addressbook.size(); i++)
            myWriter.write(" At Index  " + i + " FirstName " + Addressbook.get(i).getFirstName() + "  Last Name " + Addressbook.get(i).getLastName() + "   PhoneNo " + Addressbook.get(i).getPhoneNo() + "   Address " + Addressbook.get(i).getAddress() + "   EmailAddress " + Addressbook.get(i).getEmailAddress());

        myWriter.close();
        System.out.println("Successfully wrote to the file.");

    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }


}

    }
