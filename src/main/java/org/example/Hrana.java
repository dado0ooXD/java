package org.example;

public class Hrana extends Proizvod implements Comparable<Hrana> {
  private String naziv;
  private double cena;
  private double brojKalorija;
  private Ljutina stepenLjutine;


  public Hrana(String naziv, double cena, double brojKalorija, Ljutina stepenLjutine) {
    super(naziv, cena);
    this.brojKalorija = brojKalorija;
    this.stepenLjutine = stepenLjutine;
  }


  public double getBrojKalorija() {
    return brojKalorija;
  }

  public void setBrojKalorija(double brojKalorija) {
    this.brojKalorija = brojKalorija;
  }


  public Ljutina getStepenLjutine() {
    return stepenLjutine;
  }

  public void setStepenLjutine(Ljutina stepenLjutine) {
    this.stepenLjutine = stepenLjutine;
  }

  public int compareTo(Hrana other) {
return Double.compare(this.brojKalorija, other.brojKalorija);
  }

  public String toString() {
    return "Naziv = " + getNaziv() +" Cena = " + getCena() + " Broj kalorija = " + brojKalorija + " Stepen ljutine = " + stepenLjutine;
  }

}
