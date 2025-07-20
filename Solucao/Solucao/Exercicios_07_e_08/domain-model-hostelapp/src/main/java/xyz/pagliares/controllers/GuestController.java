package xyz.pagliares.controllers;

import xyz.pagliares.domain.Address;
import xyz.pagliares.domain.Guest;
import xyz.pagliares.domain.Hostel;
import xyz.pagliares.domain.Room;

public class GuestController {
    private Guest guest;
    private Hostel hostel;  // TODO change place after refactoring


    public void createGuest() {
        this.hostel = new Hostel();
        this.guest = new Guest();
    }

    public String persistGuestData(Address address, String firstName, String lastName, String email,
                                   String birthDate, String title) {
        guest.setFirstName(firstName);
        guest.setLastName(lastName);
        guest.setAddress(address);
        guest.setBirthDate(birthDate);
        guest.setEmail(email);
        guest.setTitle(title);

        hostel.addGuest(guest);
        return "Guest data created successfully !";
    }

    public static void main(String[] args) {
        GuestController guestController = new GuestController();
        guestController.createGuest();

        String title = "Mrs.";
        String firstName = "Anna";
        String lastName = "Karenina";
        String email = "karenina@gmail.com";
        String birthDate = "10/10/1970";


        String address = "15, Malaya Morskaya Ulitsa";
        String city = "São Petersburgo";
        String state = "Northwestern Federal District of Russia";
        String zipCode = "191185";
        String country = "Russia";
        Address addresstemp = new Address(address, city,state, zipCode, country);

        String result = guestController.persistGuestData(addresstemp, firstName, lastName, email, birthDate, title);
        System.out.println(result);
    }
}
