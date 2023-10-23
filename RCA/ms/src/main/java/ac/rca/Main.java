package ac.rca;

import ac.rca.database.DatabaseConnection;
import ac.rca.models.Address;
import ac.rca.models.Computer;
import ac.rca.models.Staff;
import ac.rca.models.Student;

class Main {
   
    public static void main(String[] args) {
        try{
            DatabaseConnection.getConnection();
            RCAManagementSystem rcaSystem= new RCAManagementSystem();
            // Create and add students
            Address studentAddress1 = new Address("123 Elm St", "555-1111");
            Student student1 = new Student("Alice", "Johnson", "2004-02-15", "Single", studentAddress1, "Grade 11");
            rcaSystem.addStudent(student1);
    
            Address studentAddress2 = new Address("456 Oak St", "555-2222");
            Student student2 = new Student("Bob", "Smith", "2003-04-10", "Single", studentAddress2, "Grade 10");
            rcaSystem.addStudent(student2);
    
            // Create and add staff members
            Address staffAddress1 = new Address("789 Pine St", "555-3333");
            Staff staff1 = new Staff("John", "Doe", "1985-08-20", "Married", staffAddress1, "Masters", "Teacher");
            rcaSystem.addStaff(staff1);
    
            Address staffAddress2 = new Address("101 Cedar St", "555-4444");
            Staff staff2 = new Staff("Jane", "Smith", "1990-06-25", "Single", staffAddress2, "PhD", "Accountant");
            rcaSystem.addStaff(staff2);
    
            // Create and add computers
            Computer computer1 = new Computer(1, "Laptop");
            rcaSystem.addComputer(computer1);
    
            Computer computer2 = new Computer(2, "Desktop");
            rcaSystem.addComputer(computer2);
    
            // Display information
            rcaSystem.displayStudents();
            rcaSystem.displayStaff();
            rcaSystem.displayComputers();

        }catch(Exception e){
         e.printStackTrace();
        }
      
    }
}