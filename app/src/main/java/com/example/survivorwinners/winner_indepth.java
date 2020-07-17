package com.example.survivorwinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class winner_indepth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_indepth);

        // Gets info from previous activity
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();

        // Converts extras into strings
        String winner_name = intent.getStringExtra(ScrollingActivity.WINNER_NAME);
        String winner_season = intent.getStringExtra(ScrollingActivity.WINNER_SEASON);
        int winner_photo = intent.getIntExtra(ScrollingActivity.WINNER_PHOTO, getResources().getIdentifier(ScrollingActivity.WINNER_PHOTO, "drawable", "package.name"));
        String votes_away = intent.getStringExtra(ScrollingActivity.VOTES_AWAY);
        String correct_votes = intent.getStringExtra(ScrollingActivity.CORRECT_VOTES);
        String times_played = intent.getStringExtra(ScrollingActivity.TIMES_PLAYED);
        // int winner_tribes = intent.getIntExtra(ScrollingActivity.WINNER_TRIBES, getResources().getIdentifier(ScrollingActivity.WINNER_TRIBES, "drawable", "package.name"));

        // Assigns textboxes and images to variables
        TextView name_placeholder = (TextView) findViewById(R.id.name_placeholder);
        TextView season_placeholder = (TextView)findViewById(R.id.season_placeholder);
        ImageView winner_photo_placeholder = (ImageView) findViewById(R.id.imageView);
        TextView votes_away_placeholder = (TextView) findViewById(R.id.votes_away_num);
        TextView correct_votes_placeholder = (TextView) findViewById(R.id.correct_votes_num);
        TextView times_played_placeholder = (TextView) findViewById(R.id.times_played_num);
        // ImageView winner_tribe_placeholder = (ImageView) findViewById(R.id.winner_tribe_placeholder);

        // Sets text based on information passed
        name_placeholder.setText(winner_name);
        season_placeholder.setText(winner_season);
        winner_photo_placeholder.setImageResource(winner_photo);
        votes_away_placeholder.setText(votes_away);
        correct_votes_placeholder.setText(correct_votes);
        times_played_placeholder.setText(times_played);
        // winner_tribe_placeholder.setImageResource(winner_tribes);
    }
}
