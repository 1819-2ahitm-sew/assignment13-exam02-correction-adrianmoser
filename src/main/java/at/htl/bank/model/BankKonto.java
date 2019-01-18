package at.htl.bank.model;

public class BankKonto {

    private String name;
    protected double KontoStand;

    public BankKonto(String name) {
        this.name = name;
    }

    public BankKonto(String name, double kontoStand) {
        this.name = name;
        KontoStand = kontoStand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKontoStand() {
        return KontoStand;
    }

    public void einzahlen(double betrag) {
        this.KontoStand += betrag;
    }

    public void abheben(double betrag) {
        this.KontoStand -= betrag;
    }
}
