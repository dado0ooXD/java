package org.example;

import org.example.Exceptions.InvalidAgeException;
import org.example.Exceptions.InvalidGenderException;

public class Vlasnik {
    private String ime;
    private String prezime;
    private char pol;
    private double godine;
    public Vlasnik(String ime, String prezime, char pol, double godine) throws InvalidGenderException, InvalidAgeException {

        if(pol != 'm' && pol != 'z') {
            throw new InvalidGenderException("Pol mora biti m-muski ili z-zenski");
        }

        if(godine <= 0) {
            throw new InvalidGenderException("Godine moraju biti vece od 0");
        }

        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public double getGodine() {
        return godine;
    }

    public void setGodine(double godine) {
        this.godine = godine;
    }

}
