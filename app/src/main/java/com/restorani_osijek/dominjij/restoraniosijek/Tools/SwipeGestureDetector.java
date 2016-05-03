package com.restorani_osijek.dominjij.restoraniosijek.Tools;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.restorani_osijek.dominjij.restoraniosijek.Podatci.Restorani;

/**
 * Created by Igor on 26.4.2016..
 */
public class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener{
    int position;
    int id;
    ImageView imageView;

    public SwipeGestureDetector (int position, int id, ImageView imageView){
        this.position = position;
        this.id = id;
        this.imageView = imageView;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        try{
            // nakon pomaka prstom s ljieva na desno prebacuje sliku u desno
            if (e1.getX() - e2.getX() > 120 &&  Math.abs(velocityX) > 300){
                if (Restorani.Lista_Restorana.get(position).getFotografije().size() > id) {
                    id++;
                    imageView.setImageResource(Restorani.getSveFotografije(position).get(id));
                    return true;
                }
                else{
                    id=0;
                    imageView.setImageResource(Restorani.getSveFotografije(position).get(id));
                    return true;
                }
            }
            //nakon pomaka prstom s desna u lijevo prebacuje sliku u lijevo
            else if (e2.getX() - e1.getX() > 120 && Math.abs(velocityX) > 300){
                if (id > 0){
                    id--;
                    imageView.setImageResource(Restorani.getSveFotografije(position).get(id));
                    return true;
                }
                else {
                    id = Restorani.Lista_Restorana.get(position).getFotografije().size() -1;
                    imageView.setImageResource(Restorani.getSveFotografije(position).get(id));
                    return true;
                }
            }
        }
        catch (Exception e){return false;}
        return false;
    }
}
