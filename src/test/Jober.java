package test;

public class Jober {
    String name;
    String doljnost;
    int zp;

    public Jober(String name, String doljnost, int zp) {
        this.name = name;
        this.doljnost = doljnost;
        this.zp = zp;
    }

    String getInfo(int i) {
        return "Name: " + name + ", Doljnost: " + doljnost + ", Zarplata in " + i + " mounth = " + zp * i + ".";
    }
}
