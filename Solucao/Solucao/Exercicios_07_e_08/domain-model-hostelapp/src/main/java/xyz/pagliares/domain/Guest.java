package xyz.pagliares.domain;

public class Guest {
    private Address address;
    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    private String title;

    public Guest() {
        address = new Address();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddress(String address, String city, String state, String zipCode, String country) {
        if (this.address !=  null) {
            this.address.setAddress(address);
            this.address.setCity(city);
            this.address.setCity(city);
            this.address.setState(state);
            this.address.setZipCode(zipCode);
            this.address.setCountry(country);
        }
     }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
