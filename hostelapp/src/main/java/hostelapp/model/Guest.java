package hostelapp.model;

public class Guest {
    private String name;
    private String lastName;
    private Address address;


    //Toda primeira linha de um construtor em java ou é uma chamada recursiva this()
    //ou super(), que aprenderemos quando estudarmos herança
    public Guest(){
        this("");
    }

    public Guest(String name){
        //Ao invés de this.name = name;
        this( name, "");
    }

    public Guest(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Guest guestinho = new Guest();

        guestinho.setName("Anna");
        guestinho.setLastName("Freiria");

        System.out.println(guestinho.getName() +" "+ guestinho.getLastName());

    }
}

