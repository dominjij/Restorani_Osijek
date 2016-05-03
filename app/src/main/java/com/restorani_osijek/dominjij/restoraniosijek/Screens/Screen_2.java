package com.restorani_osijek.dominjij.restoraniosijek.Screens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.restorani_osijek.dominjij.restoraniosijek.Podatci.Restorani;
import com.restorani_osijek.dominjij.restoraniosijek.R;

import java.util.ArrayList;

// ova klasa se pokreće nakon što se u lits view-u pritisne na neki od ponuđenh restorana

public class Screen_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_2);

        //dohvaćanje pozicije restorana o kojemu će se prikazati detaljne informacije
        Bundle extras = getIntent().getExtras();
        final int position = extras.getInt("POZICIJA");

        //namiještanje toolbara
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //postavljanje ime otvorenog restorana na toolbar
        getSupportActionBar().setTitle(Restorani.getImenaRestorana().get(position));
        //postavljanje onBackButton ikonice na toolbaru
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //postavljanje onclick lisentnera na ikonici back na toolbaru koja će korisnika vratiti na prethodni screen
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen_2.this.finish();
            }
        });



        //prikazivanje naslovne fotografije
        ImageView imageView_naslovna_fotografija = (ImageView)findViewById(R.id.imageView);
        imageView_naslovna_fotografija.setImageResource(Restorani.getNaslovneFotografije().get(position));

        //postavljanje Ratinga Restorana
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        Float rating = Restorani.getRating(position);
        ratingBar.setRating(rating);

        //dohvaćanje imena restorana i naziva restorana ovisno o poziciji koja je predana iz prvog screena
        String ime, adresa;
        ime = Restorani.getImenaRestorana().get(position);
        adresa = Restorani.getAdreseRestorana().get(position);

        //prikazivanje teksta s imenom restorana i adresom restorana
        TextView textView_ime_adresa = (TextView) findViewById(R.id.textView_naziv_adresa_restorana);
        textView_ime_adresa.setText(Html.fromHtml("<b>" + ime + " </b> <br> <small> " + adresa));

        //prikazivanje opisa restorana
        TextView textView_opis = (TextView)findViewById(R.id.textView_opis);
        String opis = Restorani.getOpisRestorana().get(position);
        textView_opis.setText(opis);


        //dinamičko unošenje slika u donji linearLayout
        //prikazuje sve slike osim naslovne slike od pojedinog restorana
        LinearLayout bottom_linear_layout_layout = (LinearLayout)findViewById(R.id.bottom_linear_layout);
        ArrayList<Integer> sveFotografije = Restorani.getSveFotografije(position);

        //unošenje svih slika iz polja sveFotografije u LinearLayout
        for(int i=0; i<sveFotografije.size(); i++) {

            ImageView dynamic_imageView;
            dynamic_imageView = new ImageView(Screen_2.this);
            dynamic_imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            dynamic_imageView.setPadding(10, 10, 10, 10);
            dynamic_imageView.setImageResource(sveFotografije.get(i));
            dynamic_imageView.requestLayout();
            dynamic_imageView.setId(i);

            //postavljanje onClickLisentnera koji će otvoriti galeriju slika od tog restorana na cijelom ekranu
            dynamic_imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //otvaranje galeryScreena i prenošenje informacije o slikama i restoranu
                    Intent intent = new Intent(Screen_2.this, GaleryScreen.class);
                    intent.putExtra("POSITION", position);
                    intent.putExtra("IMAGE_ID", v.getId());
                    startActivity(intent);
                }
            });

            bottom_linear_layout_layout.addView(dynamic_imageView);
            dynamic_imageView.getLayoutParams().width = 325;
            dynamic_imageView.getLayoutParams().height = 325;
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
