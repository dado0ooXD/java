package org.example;

import org.example.Exceptions.InvalidAdressException;
import org.example.Exceptions.InvalidMetersException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restoran {
    private String naziv;
    private String adresa;
    private double kvadratniMetri;
    private double brojLjudi;
    private boolean basta;
    private Vlasnik vlasnik;
    private List<Proizvod> proizvodi;


    public Restoran(String naziv, String adresa, double kvadratniMetri, double brojLjudi, boolean basta, Vlasnik vlasnik) throws InvalidAdressException, InvalidMetersException {
        if(!adresa.matches("[A-Z].*\\d.*")) {
            throw new InvalidAdressException("Adresa nije validna");
        }

        if(kvadratniMetri <= 0) {
            throw  new InvalidMetersException("Kvadratni metri moraju biti veci od 0");
        }

        this.naziv = naziv;
        this.adresa = adresa;
        this.kvadratniMetri = kvadratniMetri;
         this.brojLjudi = brojLjudi;
         this.basta = basta;
         this.vlasnik = vlasnik;
         this.proizvodi = new ArrayList<>();
    }

    public void dodajProizvod (Proizvod proizvod) {
        proizvodi.add(proizvod);
    }


    public List<Hrana> getLjutiProizvodi() {
        List<Hrana> ljutiProizvodi = new ArrayList<>();
        for(Proizvod proizvod: proizvodi) {
            if(proizvod instanceof Hrana hrana) {
                if(hrana.getBrojKalorija() > 1000 && hrana.getStepenLjutine().equals(Ljutina.LJUTO)){
                    ljutiProizvodi.add(hrana);
                }
            }
        }
        return  ljutiProizvodi;
    }


    public Proizvod getNajskuplji() {
        return proizvodi.stream().max(Comparator.comparing(Proizvod::getCena)).orElse(null);
    }

    public List<Hrana> sortedByKalorije() {
        List<Hrana> hranaProizvodi = new ArrayList<>();
for(Proizvod proizvod: proizvodi) {
    if(proizvod instanceof Hrana hrana) {
        hranaProizvodi.add(hrana);
    }
}
hranaProizvodi.sort(Comparator.comparing(Hrana::getBrojKalorija).reversed());
    return  hranaProizvodi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
this.adresa = adresa;
    }

    public double getKvadratniMetri() {
        return kvadratniMetri;
    }

    public void setKvadratniMetri(double kvadratniMetri) {
        this.kvadratniMetri = kvadratniMetri;
    }

    public double getBrojLjudi() {
        return brojLjudi;
    }

    public void setBrojLjudi(double brojLjudi) {
        this.brojLjudi = brojLjudi;
    }

    public boolean getBasta() {
        return basta;
    }

    public void setBasta(boolean basta) {
        this.basta = basta;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

}
