package ac.rca;

import ac.rca.models.Computer;
import ac.rca.models.Staff;
import ac.rca.models.Student;
import java.util.*;

public class RCAManagementSystem {
    private List<Student> students;
    private List<Staff> staff;
    private Map<Integer, Computer> computers;

    public RCAManagementSystem() {
        students = new ArrayList<>();
        staff = new ArrayList<>();
        computers = new HashMap<>();
    }

    // Methods for adding students, staff, and computers

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void addComputer(Computer computer) {
        computers.put(computer.getId(), computer);
    }

    // Methods for removing students, staff, and computers

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeStaff(Staff staffMember) {
        staff.remove(staffMember);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer.getId());
    }

    // Methods for retrieving information

    public List<Student> getAllStudents() {
        return students;
    }

    public List<Staff> getAllStaff() {
        return staff;
    }

    public Computer getComputerById(int computerId) {
        return computers.get(computerId);
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayStaff() {
        System.out.println("List of Staff Members:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember);
        }
    }

    public void displayComputers() {
        System.out.println("List of Computers:");
        for (Computer computer : computers.values()) {
            System.out.println(computer);
        }
    }

    
    
}
