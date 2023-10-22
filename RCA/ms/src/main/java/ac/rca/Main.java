package ac.rca;

import ac.rca.models.Address;
import ac.rca.models.Computer;
import ac.rca.models.Staff;
import ac.rca.models.Student;

class Main {
    // You can maintain lists or data structures to store students, staff, and computers
    // Implement methods for adding, removing, and retrieving information
    // ...

    public static void main(String[] args) {
        // Example usage of the classes
        Address staffAddress = new Address("123 Main St", "555-1234");
        Staff staffMember = new Staff("John", "Doe", "1990-05-15", "Married", staffAddress, "Masters", "Teacher");

        Address studentAddress = new Address("456 Elm St", "555-5678");
        Student student = new Student("Jane", "Smith", "2005-03-20", "Single", studentAddress, "Grade 10");

        Computer computer = new Computer(1, "Laptop");
        computer.assignToOwner(staffMember);

        System.out.println(staffMember);
        System.out.println(student);
        System.out.println(computer);
    }
}