package it.develhope.encapsulation;

public class Start {
    public static void main(String[] args) {

        System.out.println("-----Creating a new house--------------------");

        House house = new House();

        house.setFloorsNumber(3);
        String floors = String.format("The house has this number of floors: %d", house.getFloorsNumber());
        System.out.println(floors);

        System.out.println("----------------------------------------------");

        house.setAddress("Via Libertà, 87");
        String address = String.format("The house is at the address %s", house.getAddress());
        System.out.println(address);

        System.out.println("----------------------------------------------");

        house.setResidentNames(new String[]{"Alessandro", "Marco", "Fabrizio"});
        String residents = String.format("The house residents are %s, %s and %s", house.getResidentNames());
        System.out.println(residents);


        System.out.println("-----------------------------------------------");
    }
}

