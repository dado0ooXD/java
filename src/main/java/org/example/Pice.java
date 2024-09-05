package org.example;

public class Pice extends Proizvod implements Comparable<Pice> {
    private String naziv;
    private double cena;
    private boolean isAlcoholic;
    private double deciliters;

    public Pice(String naziv, double cena, boolean isAlcoholic, double deciliters) {
        super(naziv, cena);
        this.isAlcoholic = isAlcoholic;
        this.deciliters = deciliters;
    }


    public boolean getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public double getDeciliters() {
        return deciliters;
    }

    public void setDeciliters(double deciliters) {
        this.deciliters = deciliters;
    }

    public int compareTo(Pice other) {
        if (this.isAlcoholic && !other.isAlcoholic) {
            return 1;
        } else if (!this.isAlcoholic && other.isAlcoholic) {
            return -1;
        } else {
            return Double.compare(this.deciliters, other.deciliters);
        }

    }

    public String toString() {
        return "Naziv = " + getNaziv() + " Cena = " + getCena() + " Alkoholno = " + isAlcoholic + " Decilitri = " + deciliters;
    }
}