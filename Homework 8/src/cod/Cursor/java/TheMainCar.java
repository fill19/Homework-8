package cod.Cursor.java;

import java.util.UUID;

public class TheMainCar {
    private MarkOfCar tradeMark;
    private UUID id;
    private int price;
    private int year;
    private int mileage;

    public TheMainCar(MarkOfCar tradeMark, UUID id, int price,int year, int mileage ) {
        this.id = id;
        this.tradeMark = tradeMark;
        this.price = price;
        this.year = year;
        this.mileage = mileage;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setTradeMark(MarkOfCar tradeMark) {
        this.tradeMark = tradeMark;
    }

    public MarkOfCar getTradeMark() {
        return tradeMark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "\nThe car values: " + "\nId of car: " + id + "\nmileage: " + mileage + "\nPrice of car: " + price + "\nTrademark of car: " + tradeMark + "\nYear of car: " + year;
    }
}
