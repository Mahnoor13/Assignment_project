public class Person {
    private String FirstName;
    private String LastName;
    private String PhoneNo;
    private String Address;
    private String EmailAddress;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }


    Person(){

    }

    Person(String FirstName, String LastName, String Phoneno, String Address, String EmailAddress) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNo = Phoneno;
        this.Address = Address;
        this.EmailAddress = EmailAddress;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }



}



