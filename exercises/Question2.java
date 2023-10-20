package exercises;

class Person {
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String mobilePhoneNumber;

    public Person(String firstName, String lastName, String dob, String gender, String mobilePhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
}

class Staff extends Person {
    public Staff(String firstName, String lastName, String dob, String gender, String mobilePhoneNumber) {
        super(firstName, lastName, dob, gender, mobilePhoneNumber);
    }

    public void displayIdentification() {
        System.out.println("Hello, I am a staff.");
    }
}

class Employee extends Staff {
    public Employee(String firstName, String lastName, String dob, String gender, String mobilePhoneNumber) {
        super(firstName, lastName, dob, gender, mobilePhoneNumber);
    }

    @Override
    public void displayIdentification() {
        System.out.println("Hello, I am an employee.");
    }

    public void displayEmployeeType() {
        super.displayIdentification(); 
    }
}

public class Question2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "01-01-1990", "Male", "123-456-7890");
        employee.displayEmployeeType();
    }
}
