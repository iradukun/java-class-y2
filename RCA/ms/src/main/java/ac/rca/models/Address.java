package ac.rca.models;

public class Address {
    
    private String location;
    private String phoneNumber;

    public Address(String location, String phoneNumber) {
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    
    

    /**
     * @return String return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return String return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "LOCATION : "+location +  ",Phone Number : " +phoneNumber;
    }

    

}
