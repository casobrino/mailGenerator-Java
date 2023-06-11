package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapaxity = 300;
    private String alternateEmail;
    private String companySufix = "aero.com";
    Scanner s = new Scanner(System.in);

    // Constructor name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created!" + this.firstName + " " + this.lastName);

        // call a method that asking for a departement - return the deparment
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call method that return a random password
        this.password = genPassword(20);
        System.out.println("Your password is " + this.password);

        // Combine elements to generate email
        email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + this.department + "."
                + this.companySufix;
        System.out.println("your email is: " + email);
    }

    // Ask for departement
    private String setDepartment() {
        System.out.println("Enter the departemt");
        System.out.println("1.- Sales");
        System.out.println("2.- Development");
        System.out.println("2.- Accounting ");
        System.out.println("0.- none");
        int deparmentChoice = s.nextInt();
        switch (deparmentChoice) {
            case 1:
                return "sales";
            case 2:
                return " dev";
            case 3:
                return "acc";
            default:
                return "";
        }
    }

    // Generate random password
    private String genPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890:>_+?>]!@#$%^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int ran = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(ran);
        }
        return new String(password);
    }

    // set the mailbox
    public void setMailboxCapacity(int capacity) {
        this.mailBoxCapaxity = capacity;
    }

    // set alternate email
    public void setAlternativeEmail(String email) {
        this.alternateEmail = email;
    }

    // change the password
    public void changePasword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return this.mailBoxCapaxity;
    }

    public String getAlternativeEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
