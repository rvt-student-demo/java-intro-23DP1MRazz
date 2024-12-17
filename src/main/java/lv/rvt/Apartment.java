package lv.rvt;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.squares);
    }

    public int priceDifference(Apartment compared) {
        int thisprice = this.squares * this.pricePerSquare;
        int otherprice = compared.squares * compared.pricePerSquare;
        return Math.abs(thisprice - otherprice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisprice = this.squares * this.pricePerSquare;
        int otherprice = compared.squares * compared.pricePerSquare;
        return (thisprice > otherprice);
    }
}