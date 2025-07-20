package xyz.pagliares.controllers;

import xyz.pagliares.domain.Address;
import xyz.pagliares.domain.Hostel;

public class HostelController {
    private Hostel hostel;

    public void createHostel() {
        this.hostel = new Hostel();
     }

    public String persistHostelData(Address address, String name, String homepageAddress,
                                    String description, String inaugurationDate, String contact) {
        hostel.setAddress(address);
        hostel.setName(name);
        hostel.setHomepageAddress(homepageAddress);
        hostel.setDescription(description);
        hostel.setInaugurationDate(inaugurationDate);
        hostel.setContact(contact);

        return "Hostel data created successfully !";
    }

    public static void main(String[] args) {
        HostelController hostelController = new HostelController();
        hostelController.createHostel();

        String address = "Sparking water main st. 1000";
        String city = "Caxambu";
        String state = "MG";
        String zipCode = "37.440-000";
        String country = "Brasil";

        Address addressTemp = new Address(address, city, state, zipCode, country);

        String name = "Hostel Sparkling Water";
        String homepageAddress = "https://www.hostelapp.com";
        String description = "O albergue Spakling Water é um albergue fictício localizado em Caxambu-MG, Brasil. " +
                "Caxambu é uma pequena cidade (sua população em 2020 foi estimada em 22,000 habitantes), " +
                "reconhecida por seu parque com um balneário, 12 fontes de água mineral gasosa natural " +
                "que jorram 24h por dia e um geiser de água fria. " +
                "Caxambu é o único lugar no mundo com 12 fontes de água mineral natural, " +
                "cada uma delas com propriedades químicas distintas";

        String touristInformation = "O parque das águas é a principal atração da cidade";
        String inaugurationDate = "01/02/2005";
        String contact = "sparklingwater@gmail.com";
        String howToGet = "Saindo do Rio de Janeiro, via BR-116 (Presidente Dutra), " +
                "após Resende - RJ se direcione a Engenheiro Passos-RJ e siga a BR-354. " +
                "Saindo do Belo Horizonte ou São Paulo, siga via\n" +
                "BR-381 (Fernão Dias) em sentido Campanha-MG e depois siga a BR-267.";

        String result = hostelController.persistHostelData(addressTemp, name, homepageAddress, description,
                inaugurationDate,contact);
        System.out.println(result);
    }
}
