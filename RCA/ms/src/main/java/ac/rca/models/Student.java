package ac.rca.models;

public class Student  extends Person{
    
    private String studentClass;

    public Student(String firstName, String lastName, String dob, String maritalStatus, Address address, String studentClass) {
        super(firstName, lastName, dob, maritalStatus, address);
        this.studentClass = studentClass;
    }

    

    /**
     * @return String return the studentClass
     */
    public String getStudentClass() {
        return studentClass;
    }

    /**
     * @param studentClass the studentClass to set
     */
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return super.toString() + ", Class: " + studentClass;
    }
}
