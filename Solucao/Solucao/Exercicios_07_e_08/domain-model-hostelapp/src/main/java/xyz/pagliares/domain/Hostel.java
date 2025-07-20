package xyz.pagliares.domain;

import java.util.ArrayList;

public class Hostel {
    private ArrayList<Guest> guests;
    private ArrayList<Employee> employees;
    private ArrayList<Room> rooms;
    private Address address;
    private String name;
    private String homepageAddress;
    private String description;
    private String inaugurationDate;
    private String contact;

    public Hostel() {
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

}
