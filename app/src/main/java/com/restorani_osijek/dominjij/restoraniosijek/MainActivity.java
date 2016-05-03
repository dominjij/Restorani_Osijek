package com.restorani_osijek.dominjij.restoraniosijek;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import com.restorani_osijek.dominjij.restoraniosijek.Podatci.Restorani;
import com.restorani_osijek.dominjij.restoraniosijek.Screens.Screen_1;

/**
 * Main activity pokrece se prije svih activity-a
 * ovdje se pokrece splash screen
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pokretanje videa iz raw foldera
        final VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash));
        videoView.start();

        //osluškivanje kada je video završio
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                //pokretanje klase Restorani koja unosi sve potrebne podatke za restorane
                Restorani restorani = new Restorani(getApplicationContext());

                // pokretanje prvog screena preko intenta
                Intent intent = new Intent(MainActivity.this, Screen_1.class);
                startActivity(intent);

                //zatvaranje activitia kako se korisnik na njega nebi vise mogao vratiti
                finish();
            }
        });
    }
}
