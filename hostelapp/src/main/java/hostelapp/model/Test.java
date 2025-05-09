package hostelapp.model;

public class Test {
    public static void main(String[] args) {
        Guest guestinho = new Guest();

        guestinho.setName("Anna");
        guestinho.setLastName("Freiria");

        System.out.println(guestinho.getName() + " " + guestinho.getLastName());

        Address address = new Address("Rua X", "Cidade Y", "Estado Z", "12345-678");
        guestinho.setAddress(address);

        // Imprime o endereço completo com toString()
        System.out.println("Endereço completo: " + guestinho.getAddress());
    }
}
