package xyz.pagliares.domain;

public class Room {
    private int number;
    private String name;
    private String type;
    private int floor;
    private String description;
    private double dailyRate;
    private double dimension; // square meters

    public Room(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }
}
