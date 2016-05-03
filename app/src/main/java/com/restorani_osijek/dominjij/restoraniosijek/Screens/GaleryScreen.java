package com.restorani_osijek.dominjij.restoraniosijek.Screens;

import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

import com.restorani_osijek.dominjij.restoraniosijek.Podatci.Restorani;
import com.restorani_osijek.dominjij.restoraniosijek.R;
import com.restorani_osijek.dominjij.restoraniosijek.Tools.SwipeGestureDetector;
import com.restorani_osijek.dominjij.restoraniosijek.Tools.TouchImageView;


/**
 * Created by Igor on 26.4.2016..
 */
public class GaleryScreen extends AppCompatActivity{

    public int position, id;
    public ImageView imageView;
    public GestureDetector swipe;

    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galery_screen);

        //dohvaćanje informacija iz screen_2
        Bundle extras = getIntent().getExtras();
        //position se odnosi na restoran koji je odabran
        //id se odnosi na sliku koja je odabrana od tog restorana
        position = extras.getInt("POSITION");
        id = extras.getInt("IMAGE_ID");

        //postavljanje imageView-a na sliku koja je odabrana
        imageView = (ImageView)findViewById(R.id.galery_imageView);
        imageView.setImageResource(Restorani.getSveFotografije(position).get(id));
        //imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        //postavljanje slike na novu sliku nakon swipa-a
        //poziva se u onTouchEvent-u
        swipe = new GestureDetector(this, new SwipeGestureDetector(position, id, imageView));

        //postavljanje klase koja zoomira predanu fotografiju
        TouchImageView img = new TouchImageView(this);
        img.setImageResource(Restorani.getSveFotografije(position).get(id));
        img.setMaxZoom(3f);
        setContentView(img);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        swipe.onTouchEvent(event);
        return true;
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
