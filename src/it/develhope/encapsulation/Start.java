package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("---------------Starting---------------------");

        House house = new House();

        System.out.println("Type your values here: ");

        Scanner scanner = new Scanner(System.in);

        int floors = scanner.nextInt();
        scanner.nextLine();
        String address = scanner.nextLine();
        String [] residents = scanner.nextLine().split(",");

        System.out.println("Wait, values processing...");

        house.setFloorsNumber(floors);
        house.setAddress(address);
        house.setResidentsNames(residents);

        System.out.printf("The house has %d floors %n", house.getFloorsNumber());
        System.out.printf("The house is at the address %s %n", house.getAddress());
        System.out.printf("The house residents are %s %n", Arrays.toString(house.getResidentsNames()));

        scanner.close();

        System.out.println("------------------------------------------");

    }
}
