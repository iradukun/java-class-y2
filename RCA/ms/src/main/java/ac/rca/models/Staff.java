package ac.rca.models;

public class Staff extends Person {
    
    private String educationLevel;
    private String staffType;

    public Staff(String firstName, String lastName, String dob, String maritalStatus, Address address, String educationLevel, String staffType) {
        super(firstName, lastName, dob, maritalStatus, address);
        this.educationLevel = educationLevel;
        this.staffType = staffType;
    }

    

    /**
     * @return String return the educationLevel
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * @param educationLevel the educationLevel to set
     */
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * @return String return the staffType
     */
    public String getStaffType() {
        return staffType;
    }

    /**
     * @param staffType the staffType to set
     */
    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }


    @Override
    public String toString() {
        return super.toString() + ", Education Level: " + educationLevel + ", Staff Type: " + staffType;
    }
}
