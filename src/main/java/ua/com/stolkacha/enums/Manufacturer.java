package ua.com.stolkacha.enums;

public enum Manufacturer {
    Philips(1),
    Narva(2),
    Brevia(3),
    Solar(4);

    private final int index;

    Manufacturer(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
