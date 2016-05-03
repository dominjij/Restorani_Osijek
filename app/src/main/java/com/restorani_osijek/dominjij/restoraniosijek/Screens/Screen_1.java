package com.restorani_osijek.dominjij.restoraniosijek.Screens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

import com.restorani_osijek.dominjij.restoraniosijek.Podatci.Restorani;
import com.restorani_osijek.dominjij.restoraniosijek.R;
import com.restorani_osijek.dominjij.restoraniosijek.Tools.ListViewAdapter;

import java.util.ArrayList;

/**
 *  prvi screen koji se pojavi nakon pokretanja aplikacije
 */
public class Screen_1 extends AppCompatActivity {

    // Polja u koje se spremju sva imena, adrese, i fotografije restorana
    public ArrayList<String> ime_restorana = new ArrayList<String>();
    public ArrayList<String> adresa_restorana = new ArrayList<String>();
    public ArrayList<Integer> naslovne_fotografije_restorana = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_1);

        // podatci se dohvaćaju iz klase Restorani pomoću funkcija koje vraćaju polja s imenima, adresama i naslovnim fotografijama
        ime_restorana = Restorani.getImenaRestorana();
        adresa_restorana = Restorani.getAdreseRestorana();
        naslovne_fotografije_restorana = Restorani.getNaslovneFotografije();

        //listViewAdapter dodjeljuje ime, adresu i naslovnu fotografiju svakom elementu u listView-u
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, ime_restorana, adresa_restorana, naslovne_fotografije_restorana);
        ListView listView = (ListView) findViewById(R.id.listView_screen_1);
        listView.setAdapter(listViewAdapter);

        //detekcija pritiska na element
        //nakon pritiska na bilo koji element otvara se Screen_2
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //definiranje koji screen će se otvoriti i kome ćemo slati informacije
                Intent intent = new Intent(Screen_1.this, Screen_2.class);

                //u Screen_2 šaljemo informaciju na koji se element pritisnulo
                intent.putExtra("POZICIJA", position);

                //pokretanje screen_2
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
