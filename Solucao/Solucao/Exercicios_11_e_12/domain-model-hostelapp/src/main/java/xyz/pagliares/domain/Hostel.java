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
        this.employees = new ArrayList<>();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomepageAddress() {
        return homepageAddress;
    }

    public void setHomepageAddress(String homepageAddress) {
        this.homepageAddress = homepageAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInaugurationDate() {
        return inaugurationDate;
    }

    public void setInaugurationDate(String inaugurationDate) {
        this.inaugurationDate = inaugurationDate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


}
