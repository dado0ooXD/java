package org.example;

import org.example.Exceptions.InvalidAdressException;
import org.example.Exceptions.InvalidAgeException;
import org.example.Exceptions.InvalidGenderException;
import org.example.Exceptions.InvalidMetersException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

try {
    Vlasnik vlasnik = new Vlasnik("Davud", "Dado",'m', 19);
    Restoran restoran = new Restoran("Restoran123", "Adresa90",10, 1000, false,vlasnik );
    Hrana hrana1 = new Hrana("Pizza", 600, 2000, Ljutina.LJUTO);
    Hrana hrana2 = new Hrana("Tortilja", 400, 1300, Ljutina.LJUTO);
    Hrana hrana3 = new Hrana("Palacinke", 300, 1100, Ljutina.SLATKO);
    Hrana hrana4 = new Hrana("Jaja", 150, 800, Ljutina.BLAGOLJUTO);
    Pice pice = new Pice("Kola", 150, false, 300);

    restoran.dodajProizvod(hrana1);
    restoran.dodajProizvod(hrana2);
    restoran.dodajProizvod(hrana3);
    restoran.dodajProizvod(pice);
    restoran.dodajProizvod(hrana4);


    System.out.println("Ljuti proizvodi sa više od 1000 kalorija: " + restoran.getLjutiProizvodi());
    System.out.println("Najskuplji proizvod: " + restoran.getNajskuplji().getNaziv());
    System.out.println("Proizvodi sortirani po kalorijama opadajuće: " + restoran.sortedByKalorije());




}
catch (InvalidGenderException | InvalidAgeException | InvalidAdressException | InvalidMetersException e){
    System.err.println("Greška prilikom kreiranja objekta: " + e.getMessage());
        }
    }
}