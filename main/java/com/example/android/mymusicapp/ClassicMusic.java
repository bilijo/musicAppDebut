package com.example.android.mymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

//import static com.example.android.mymusicapp.R.id.Artist;

public class ClassicMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_music);

        //*********************************************************************
        // Find the View that shows a Classic Music artist
       // TextView classicArtist = (TextView) findViewById(R.id.listview_artist);

        // Set a click listener on that View
       /* classicArtist.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the Classic Artist ButtonView is clicked on.
            @Override
            public void onClick (View view){
                Intent classicArtistIntent = new Intent(ClassicMusic.this, ClassicArtist.class);

                startActivity(classicArtistIntent);
            }
        });*/

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<Artist> classicArtists = new ArrayList<>();

        classicArtists.add(new Artist("Beethoven", R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Berlioz",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Brahms",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Chopin",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Debussy",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Mozart",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Mendelsshon",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Ravel",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Tchaikovsky",  R.drawable.ic_play_arrow_black_48dp));
        classicArtists.add(new Artist("Vivaldi",  R.drawable.ic_play_arrow_black_48dp));

        // Create an {@link ArtistAdapter}, whose data source is a list of
        // {@link Artist}s. The adapter knows how to create list item views for each item
        // in the list.
        ArtistAdapter artistAdapter = new ArtistAdapter(this, classicArtists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_artist);
        listView.setAdapter(artistAdapter);


    }
}
