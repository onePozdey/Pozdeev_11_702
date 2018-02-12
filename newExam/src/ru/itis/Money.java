package ru.itis;

public class Money {
    private long rubles;
    private byte copecks;

    public Money(long rubles, byte copecks) {
        this.rubles = rubles;
        setCopecks(copecks);
    }

    public String toString() {
        System.out.print("now there is " + getRubles() + "," + getCopecks() + " Rub");
        return "";
//        return getRubles() + "," + getCopecks();
    }

    public void setCopecks(byte copecks) {
        if(copecks < 100) {
            this.copecks = copecks;
        } else {
            this.copecks = 0;
        }
    }
    public void setRubles(long rubles) {
        this.rubles = rubles;
    }

    public long getRubles() {
        return rubles;
    }
    public byte getCopecks() {
        return copecks;
    }
}
