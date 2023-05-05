import java.util.Scanner;

public class SignUp {
    // Fields
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    // Setters and getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    // Methods
    public void displaySignUpPage() {
        System.out.println("Welcome to our sign up page!");
        System.out.println("Please fill out the following information to create your account:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        setFirstName(scanner.nextLine());

        System.out.print("Last Name: ");
        setLastName(scanner.nextLine());

        System.out.print("Email: ");
        setEmail(scanner.nextLine());

        System.out.print("Password: ");
        setPassword(scanner.nextLine());

        System.out.println("\nThank you for signing up! Your account has been created.");
    }

    public static void main(String[] args) {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.displaySignUpPage();
    }
    public class Login {
    private String username;
    private String password;
    
    // Constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Getters
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    // Setters
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Method to verify login credentials
    public boolean verifyCredentials(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
    public class BookDelivery {
    private String recipientName;
    private String deliveryAddress;
    private String deliveryMethod;
    private int deliveryFee;

    // Constructor
    public BookDelivery(String recipientName, String deliveryAddress) {
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
    }

    // Getters and Setters
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
}