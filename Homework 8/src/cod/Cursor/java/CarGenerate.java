package cod.Cursor.java;

import java.util.Random;
import java.util.UUID;

public class CarGenerate {
    private CarGenerate() {
    }


        public static TheMainCar GeneratorOfCars() {
            return new TheMainCar(getTradeMark(), getId(), getYear(), getMileage(), getPrice());
        }

    private static MarkOfCar getTradeMark() {
        int randomizerOfCars = (int) (Math.random() * 5);
        return MarkOfCar.values()[randomizerOfCars];
    }
    private static UUID getId() {
        return UUID.randomUUID();
    }
    private static int getYear() {
        int min = 2000;
        int max = 2020;
        int year = max - min;
        Random random = new Random();
        int cars = random.nextInt(year + 1);
        return cars ;
    }
    private static int getMileage() {
        int min = 10000;
        int max = 99000;
        int interval = max - min;
        Random random = new Random();
        int cars = random.nextInt(interval + 1);
        return cars ;
    }

    private static int getPrice() {
        int min = 25000;
        int max = 195000;
        int price = max - min;
        Random random = new Random();
        int cars = random.nextInt(price + 1);
        return cars ;
    }






}


