package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the now playing category
        TextView playing = (TextView) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayingActivity}
                Intent numbersIntent = new Intent(MainActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songscategory is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the lyrics category
        TextView lyrics = (TextView) findViewById(R.id.lyircs);

        // Set a click listener on that View
        lyrics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Lyrics category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LyricsActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, LyricsActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });



    }
}