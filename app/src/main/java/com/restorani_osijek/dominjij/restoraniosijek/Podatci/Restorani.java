package com.restorani_osijek.dominjij.restoraniosijek.Podatci;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.restorani_osijek.dominjij.restoraniosijek.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * klasa u kojoj se unose informacije o restoranima
 */
public class Restorani extends Application{

    private Obijekt_restoran Rustika = new Obijekt_restoran();
    private Obijekt_restoran Strossmaer = new Obijekt_restoran();
    private Obijekt_restoran Sebastian = new Obijekt_restoran();
    private Obijekt_restoran Karaka = new Obijekt_restoran();
    private Obijekt_restoran Corner = new Obijekt_restoran();
    private Obijekt_restoran Bijelo_plavi = new Obijekt_restoran();
    private Obijekt_restoran Kompa = new Obijekt_restoran();
    private Obijekt_restoran Slavonska_kuca = new Obijekt_restoran();
    private Obijekt_restoran Kopika = new Obijekt_restoran();
    private Obijekt_restoran American_bar = new Obijekt_restoran();
    private Resources res;

    public static ArrayList<Obijekt_restoran> Lista_Restorana = new ArrayList<Obijekt_restoran>();

    public Restorani(Context context) {
        res = context.getResources();

        //unos podataka za restoran Rustika
        List<Integer> rustika_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.rustika_01, R.drawable.rustika_02, R.drawable.rustika_03, R.drawable.rustika_04));
        Rustika.setIme(res.getString(R.string.Rustika_ime));
        Rustika.setAdresa(res.getString(R.string.Rustika_adresa));
        Rustika.setOpis(res.getString(R.string.Rustika_opis));
        Rustika.setRating(4.8f);
        Rustika.setFotografije(rustika_fotografije);
        Lista_Restorana.add(Rustika);

        //unos podataka za restoran Strossmaer
        List<Integer> strossmayer_fotogafije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.strosmaer_01, R.drawable.strosmaer_02, R.drawable.strosmaer_03, R.drawable.strosmaer_04));
        Strossmaer.setIme(res.getString(R.string.Strossmaer_ime));
        Strossmaer.setAdresa(res.getString(R.string.Strossmaer_adresa));
        Strossmaer.setOpis(res.getString(R.string.Strossmaer_opis));
        Strossmaer.setRating(4f);
        Strossmaer.setFotografije(strossmayer_fotogafije);
        Lista_Restorana.add(Strossmaer);

        //unos podataka za Restoran Sebastian
        List<Integer> sebastian_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.sebastian_01, R.drawable.sebastian_02, R.drawable.sebastian_03, R.drawable.sebastian_04));
        Sebastian.setIme(res.getString(R.string.Sebastian_ime));
        Sebastian.setAdresa(res.getString(R.string.Sebastian_adresa));
        Sebastian.setOpis(res.getString(R.string.Sebastian_opis));
        Sebastian.setRating(4.4f);
        Sebastian.setFotografije(sebastian_fotografije);
        Lista_Restorana.add(Sebastian);

        //unos podataka za Restoran Karaka
        List<Integer> karaka_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.karaka_01, R.drawable.karaka_02, R.drawable.karaka_03, R.drawable.karaka_04));
        Karaka.setIme(res.getString(R.string.Karaka_ime));
        Karaka.setAdresa(res.getString(R.string.Karaka_adresa));
        Karaka.setOpis(res.getString(R.string.Karaka_opis));
        Karaka.setRating(4.7f);
        Karaka.setFotografije(karaka_fotografije);
        Lista_Restorana.add(Karaka);

        //unos podataka za Restoran Corner
        List<Integer> corner_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.corner_01, R.drawable.corner_02, R.drawable.corner_03, R.drawable.corner_04));
        Corner.setIme(res.getString(R.string.Corner_ime));
        Corner.setAdresa(res.getString(R.string.Corner_adresa));
        Corner.setOpis(res.getString(R.string.Corner_opis));
        Corner.setRating(4.8f);
        Corner.setFotografije(corner_fotografije);
        Lista_Restorana.add(Corner);

        //unos podataka za Restoran Bijelo plavi
        List<Integer> bijelo_plavi_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.bijelo_plavi_01, R.drawable.bijelo_plavi_02, R.drawable.bijelo_plavi_03, R.drawable.bijelo_plavi_04));
        Bijelo_plavi.setIme(res.getString(R.string.Bijelo_plavi_ime));
        Bijelo_plavi.setAdresa(res.getString(R.string.Bijelo_plavi_adresa));
        Bijelo_plavi.setOpis(res.getString(R.string.Bijelo_plavi_opis));
        Bijelo_plavi.setRating(4.8f);
        Bijelo_plavi.setFotografije(bijelo_plavi_fotografije);
        Lista_Restorana.add(Bijelo_plavi);

        //unos podataka za Restoran Kompa
        List<Integer> kompa_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.kompa_01, R.drawable.kompa_02, R.drawable.kompa_03, R.drawable.kompa_04));
        Kompa.setIme(res.getString(R.string.Kompa_ime));
        Kompa.setAdresa(res.getString(R.string.Kompa_adresa));
        Kompa.setOpis(res.getString(R.string.Kompa_opis));
        Kompa.setRating(4.6f);
        Kompa.setFotografije(kompa_fotografije);
        Lista_Restorana.add(Kompa);

        //unos podataka za Restoran Slavonska kuca
        List<Integer> slavonska_kuca_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.slavonska_kuca_01, R.drawable.slavonska_kuca_02, R.drawable.slavonska_kuca_03, R.drawable.slavonska_kuca_04));
        Slavonska_kuca.setIme(res.getString(R.string.Slavonska_kuca_ime));
        Slavonska_kuca.setAdresa(res.getString(R.string.Slavonska_kuca_adresa));
        Slavonska_kuca.setOpis(res.getString( R.string.Slavonska_kuca_opis));
        Slavonska_kuca.setRating(4.7f);
        Slavonska_kuca.setFotografije(slavonska_kuca_fotografije);
        Lista_Restorana.add(Slavonska_kuca);

        //unos podataka za Restoran Kopika
        List<Integer> kopika_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.kopika_01, R.drawable.kopika_02, R.drawable.kopika_03, R.drawable.kopika_04));
        Kopika.setIme(res.getString(R.string.Kopika_ime));
        Kopika.setAdresa(res.getString(R.string.Kopika_adresa));
        Kopika.setOpis(res.getString(R.string.Kopika_opis));
        Kopika.setRating(4f);
        Kopika.setFotografije(kopika_fotografije);
        Lista_Restorana.add(Kopika);

        //unos podataka za Restoran American bar
        List<Integer> american_bar_fotografije = new ArrayList<Integer>
                (Arrays.asList(R.drawable.american_bar_01, R.drawable.american_bar_02, R.drawable.american_bar_03, R.drawable.american_bar_04));
        American_bar.setIme(res.getString(R.string.American_bar_ime));
        American_bar.setAdresa(res.getString(R.string.American_bar_adresa));
        American_bar.setOpis(res.getString(R.string.American_bar_opis));
        American_bar.setRating(4.5f);
        American_bar.setFotografije(american_bar_fotografije);
        Lista_Restorana.add(American_bar);
    }



    // funkcija koja vraća popis imena svih restorana
    public static ArrayList<String> getImenaRestorana(){

        ArrayList<String> imenaRestorana = new ArrayList<String>();
        for (int i = 0; i < Lista_Restorana.size(); i++){
            imenaRestorana.add(Lista_Restorana.get(i).getIme());
        }
        return  imenaRestorana;
    }

    //funkcija koja vraća popis adresa svih restorana
    public static ArrayList<String> getAdreseRestorana(){
        ArrayList<String> adresaRestorana = new ArrayList<String>();

        for (int i = 0; i < Lista_Restorana.size(); i++){
            adresaRestorana.add(Lista_Restorana.get(i).getAdresa());
        }
        return  adresaRestorana;
    }

    //funkcija koja vraća naslovnu odnosno prvu fotografiju od svih restorana
    public static ArrayList<Integer> getNaslovneFotografije(){
        ArrayList<Integer> naslovneFotografijeRestorana = new ArrayList<Integer>();

        for (int i = 0; i < Lista_Restorana.size(); i++){
            naslovneFotografijeRestorana.add(Lista_Restorana.get(i).getFotografije().get(0));
        }
        return naslovneFotografijeRestorana;
    }

    //funkcija koja vraća opis restorana
    public static ArrayList<String> getOpisRestorana(){
        ArrayList<String> opis_restorana = new ArrayList<String>();

        for (int i = 0; i<Lista_Restorana.size(); i++){
            opis_restorana.add(Lista_Restorana.get(i).getOpis());
        }

        return opis_restorana;
    }


    //funkcija koja vraća sve slike restorana osim naslovne slike
    public static ArrayList<Integer> getSveFotografije(int position){

        ArrayList<Integer> sveFotografije = new ArrayList<Integer>();

        for(int i = 1; i<Lista_Restorana.get(position).getFotografije().size(); i++){
            sveFotografije.add(Lista_Restorana.get(position).getFotografije().get(i));
        }
        return sveFotografije;
    }

    public static Float getRating(int position){
        Float rating = Lista_Restorana.get(position).getRating();
        return rating;
    }

}
