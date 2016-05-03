package com.restorani_osijek.dominjij.restoraniosijek.Tools;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.restorani_osijek.dominjij.restoraniosijek.R;
import java.util.List;

/**
 * klasa koja pomaže u kreiranju prvog screena
 * svakom elementu listView-a u prvom screenu predajemo layout "list_view_adapter_layout"
 * te za svaki element unosimo informacije koje su nam potrebne
 */
public class ListViewAdapter extends ArrayAdapter<String> {

    private Context context;
    private List<String> naziv;
    private List<String> opis;
    private List<Integer> slike;

    // konstruktor koji prima context screena, nazive restorana, opise restorana i slike restorana
    // naziv, slika i opis restorana biti će dodjeljena jednom elementu listView-a u prvom screenu

    public ListViewAdapter(Context context, List<String> imena_restorana, List<String> opis_restorana, List<Integer> fotografije_restorana) {
        super(context, R.layout.list_view_adapter_layout, imena_restorana);

        this.context = context;
        this.naziv = imena_restorana;
        this.opis = opis_restorana;
        this.slike = fotografije_restorana;
    }


    // postavljanje pojedinog elementa ListView-a na željeni izgled
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.list_view_adapter_layout, null);

        //privremene varijable u kojima se nalazi ime restorana i adresa restorana
        String ime = naziv.get(position);
        String adresa = opis.get(position);

        //postavljanje teksta koji sadrži ime restorana i ispod njega adresa restorana
        TextView textView = (TextView) view.findViewById(R.id.textView_naziv_restorana);
        textView.setText(Html.fromHtml("<b>" + ime + " </b> <br> <small> " + adresa));

        //postavljanje naslovne fotografije za element koji se nalazi u listView-u
        ImageView imageView = (ImageView) view.findViewById(R.id.naslovna_slika_ListView);
        imageView.setImageResource(slike.get(position));

        return view;
    }

}
