package cod.Cursor.java;

import java.util.*;
import java.util.stream.Collectors;

public class Solutions {
    public static void main(String[] args) {
        List<TheMainCar> machines = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            machines.add(CarGenerate.GeneratorOfCars());

        }
        List<TheMainCar> comparisonOfCars = machines.stream()
                .filter(vehicle -> vehicle.getTradeMark().equals(MarkOfCar.TESLA) || vehicle.getTradeMark().equals(MarkOfCar.AUDI))
                .filter(vehicle -> vehicle.getMileage() < 40000)
                .filter(vehicle -> vehicle.getYear() > 2018)
                .sorted(Comparator.comparing(TheMainCar::getPrice).reversed())
                .collect(Collectors.toList());

        System.out.println("One of the chosen cars: " + "\nyear of the car: " + "\nmileage of the vehicle: " + "\nSorted from richest to lower price: ");
        System.out.println(comparisonOfCars);

        Map<UUID, TheMainCar> LowestPriceOnCars = comparisonOfCars.stream()
                .sorted(Comparator.comparing(TheMainCar::getPrice).reversed()).limit(3).collect(Collectors.toMap(TheMainCar::getId, vehicle -> vehicle));
        System.out.println("\nThe cars with the lowest prices: ");
        LowestPriceOnCars.forEach((key, value) -> System.out.println(key + ", " + value));
    }

}
