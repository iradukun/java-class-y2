package ac.rca.models;

public class Computer {
    

    private int id;
    private String computerType;
    private Person currentOwner;

    public Computer(int id, String computerType) {
        this.id = id;
        this.computerType = computerType;
        this.currentOwner = null;
    }

    public void assignToOwner(Person person) {
        this.currentOwner = person;
    }

    
    

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the computerType
     */
    public String getComputerType() {
        return computerType;
    }

    /**
     * @param computerType the computerType to set
     */
    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    /**
     * @return Person return the currentOwner
     */
    public Person getCurrentOwner() {
        return currentOwner;
    }

    /**
     * @param currentOwner the currentOwner to set
     */
    public void setCurrentOwner(Person currentOwner) {
        this.currentOwner = currentOwner;
    }


    @Override
    public String toString() {
        return "Computer ID: " + id + ", Type: " + computerType + ", Current Owner: " + (currentOwner != null ? currentOwner.toString() : "Unassigned");
    }
}
