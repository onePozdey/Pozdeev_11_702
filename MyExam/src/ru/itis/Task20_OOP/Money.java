package ru.itis.Task20_OOP;

public class Money {
    private long rubles;
    private byte copecks;

    public Money(long rubles, byte copecks) {
        this.rubles = rubles;
        setCopecks(copecks);
    }

    public String toString() {
        return getRubles() + "," + getCopecks();
    }

    public void setCopecks(byte copecks) {
        if(copecks < 100) {
            this.copecks = copecks;
        } else {
            this.copecks = 0;
        }
    }

    public long getRubles() {
        return rubles;
    }
    public byte getCopecks() {
        return copecks;
    }
}
