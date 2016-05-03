package com.restorani_osijek.dominjij.restoraniosijek.Podatci;

import java.util.List;

/**
 * objekt Restoran koji će sadržavati sve informacije koje su potrebne za jedan restoran
 * funkcije set služe za postavljanje informacija o pojedinom restoranu
 * funkcije get služe za čitanje informacija o pojedinom restoranu
 */
public class Obijekt_restoran {

    private String ime;
    private String adresa;
    private String opis;
    private Float rating;
    private List<Integer> fotografije;

    // konstruktor koji definira varijablje koje se moraju unesti za pojedini restoran
    /*
    public Restoran (String ime, String adresa, String opis, float rating, List<Integer> fotografije){
        this.ime = ime;
        this.adresa = adresa;
        this.opis = opis;
        this.rating = rating;
        this.fotografije = fotografije;

    }*/


    //funkcije za dohvaćanje podataka iz objekta Restoran

    public String getIme() {
        return ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getOpis() {
        return opis;
    }

    public Float getRating() {
        return rating;
    }

    public List<Integer> getFotografije() {
        return fotografije;
    }


    //funkcije za unos podataka u obijekt Restoran

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void setFotografije(List<Integer> fotografije) {
        this.fotografije = fotografije;
    }
}
