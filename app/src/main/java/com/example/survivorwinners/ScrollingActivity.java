package com.example.survivorwinners;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String WINNER_NAME = "com.example.survivorwinners.WINNER_NAME";
    public static final String WINNER_SEASON = "com.example.survivorwinners.WINNER_SEASON";
    public static final String WINNER_PHOTO = "com.example.survivorwinners.WINNER_PHOTO";
    public static final String VOTES_AWAY = "com.example.survivorwinners.VOTES_AWAY";
    public static final String CORRECT_VOTES = "come.example.survivorwinners.CORRECT_VOTES";
    public static final String TIMES_PLAYED = "come.example.survivorwinners.TIMES_PLAYED";
    public static final String WINNER_TRIBES = "com.example.survivorwinners.WINNER_TRIBES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.widthPixels;

        final LinearLayout rl = (LinearLayout) findViewById(R.id.linlayout);


        // Assigns all buttons to a name
        ImageButton button1 = (ImageButton) findViewById(R.id.s1);
        ImageButton button2 = (ImageButton) findViewById(R.id.s2);
        ImageButton button3 = (ImageButton) findViewById(R.id.s3);
        ImageButton button4 = (ImageButton) findViewById(R.id.s4);
        ImageButton button5 = (ImageButton) findViewById(R.id.s5);
        ImageButton button6 = (ImageButton) findViewById(R.id.s6);
        ImageButton button7 = (ImageButton) findViewById(R.id.s7);
        ImageButton button8 = (ImageButton) findViewById(R.id.s8);
        ImageButton button9 = (ImageButton) findViewById(R.id.s9);
        ImageButton button10 = (ImageButton) findViewById(R.id.s10);
        ImageButton button11 = (ImageButton) findViewById(R.id.s11);
        ImageButton button12 = (ImageButton) findViewById(R.id.s12);
        ImageButton button13 = (ImageButton) findViewById(R.id.s13);
        ImageButton button14 = (ImageButton) findViewById(R.id.s14);
        ImageButton button15 = (ImageButton) findViewById(R.id.s15);
        ImageButton button16 = (ImageButton) findViewById(R.id.s16);
        ImageButton button17 = (ImageButton) findViewById(R.id.s17);
        ImageButton button18 = (ImageButton) findViewById(R.id.s18);
        ImageButton button19 = (ImageButton) findViewById(R.id.s19);
        ImageButton button20 = (ImageButton) findViewById(R.id.s20);
        ImageButton button21 = (ImageButton) findViewById(R.id.s21);
        ImageButton button22 = (ImageButton) findViewById(R.id.s22);
        ImageButton button23 = (ImageButton) findViewById(R.id.s23);
        ImageButton button24 = (ImageButton) findViewById(R.id.s24);
        ImageButton button25 = (ImageButton) findViewById(R.id.s25);
        ImageButton button26 = (ImageButton) findViewById(R.id.s26);
        ImageButton button27 = (ImageButton) findViewById(R.id.s27);
        ImageButton button28 = (ImageButton) findViewById(R.id.s28);
        ImageButton button29 = (ImageButton) findViewById(R.id.s29);
        ImageButton button30 = (ImageButton) findViewById(R.id.s30);
        ImageButton button31 = (ImageButton) findViewById(R.id.s31);
        ImageButton button32 = (ImageButton) findViewById(R.id.s32);
        ImageButton button33 = (ImageButton) findViewById(R.id.s33);

        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) button1.getLayoutParams();
        params.height = height * width / params.width;
        params.width = width;

        button1.setLayoutParams(params);

        // When any of the buttons are pressed, calls on a function to open new activity
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        // Declares all variables that are going to be sent to the other activity
        String name = "Void";
        String season = "Void";
        String votes_away = "Void";
        String correct_votes = "Void";
        String times_played = "Void";

        // Declares which activity to go to
        Intent intent = new Intent(this, winner_indepth.class);

        // Assigns values to variables depending on which button was clicked
        switch (view.getId()){
            case R.id.s1:
                name = getString(R.string.s1winner);
                season = getString(R.string.s1);
                votes_away = getString(R.string.s1votes_away);
                correct_votes = getString(R.string.s1correct_votes);
                times_played = getString(R.string.s1times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.hatch2);
                // intent.putExtra(WINNER_TRIBES, R.drawable.hatchtribe);
                break;
            case R.id.s2:
                name = getString(R.string.s2winner);
                season = getString(R.string.s2);
                votes_away = getString(R.string.s2votes_away);
                correct_votes = getString(R.string.s2correct_votes);
                times_played = getString(R.string.s2times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.tina2);
                // intent.putExtra(WINNER_TRIBES, R.drawable.tinatribe);
                break;
            case R.id.s3:
                name = getString(R.string.s3winner);
                season = getString(R.string.s3);
                votes_away = getString(R.string.s3votes_away);
                correct_votes = getString(R.string.s3correct_votes);
                times_played = getString(R.string.s3times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.ethan2);
                break;
            case R.id.s4:
                name = getString(R.string.s4winner);
                season = getString(R.string.s4);
                votes_away = getString(R.string.s4votes_away);
                correct_votes = getString(R.string.s4correct_votes);
                times_played = getString(R.string.s4times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.vecepia2);
                break;
            case R.id.s5:
                name = getString(R.string.s5winner);
                season = getString(R.string.s5);
                votes_away = getString(R.string.s5votes_away);
                correct_votes = getString(R.string.s5correct_votes);
                times_played = getString(R.string.s5times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.brian2);
                break;
            case R.id.s6:
                name = getString(R.string.s6winner);
                season = getString(R.string.s6);
                votes_away = getString(R.string.s6votes_away);
                correct_votes = getString(R.string.s6correct_votes);
                times_played = getString(R.string.s6times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.jenna2);
                break;
            case R.id.s7:
                name = getString(R.string.s7winner);
                season = getString(R.string.s7);
                votes_away = getString(R.string.s7votes_away);
                correct_votes = getString(R.string.s7correct_votes);
                times_played = getString(R.string.s7times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.sandra2);
                break;
            case R.id.s8:
                name = getString(R.string.s8winner);
                season = getString(R.string.s8);
                votes_away = getString(R.string.s8votes_away);
                correct_votes = getString(R.string.s8correct_votes);
                times_played = getString(R.string.s8times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.amber2);
                break;
            case R.id.s9:
                name = getString(R.string.s9winner);
                season = getString(R.string.s9);
                votes_away = getString(R.string.s9votes_away);
                correct_votes = getString(R.string.s9correct_votes);
                times_played = getString(R.string.s9times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.chrisd2);
                break;
            case R.id.s10:
                name = getString(R.string.s10winner);
                season = getString(R.string.s10);
                votes_away = getString(R.string.s10votes_away);
                correct_votes = getString(R.string.s10correct_votes);
                times_played = getString(R.string.s10times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.tom2);
                break;
            case R.id.s11:
                name = getString(R.string.s11winner);
                season = getString(R.string.s11);
                votes_away = getString(R.string.s11votes_away);
                correct_votes = getString(R.string.s11correct_votes);
                times_played = getString(R.string.s11times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.danni2);
                break;
            case R.id.s12:
                name = getString(R.string.s12winner);
                season = getString(R.string.s12);
                votes_away = getString(R.string.s12votes_away);
                correct_votes = getString(R.string.s12correct_votes);
                times_played = getString(R.string.s12times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.aras2);
                break;
            case R.id.s13:
                name = getString(R.string.s13winner);
                season = getString(R.string.s13);
                votes_away = getString(R.string.s13votes_away);
                correct_votes = getString(R.string.s13correct_votes);
                times_played = getString(R.string.s13times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.yul2);
                break;
            case R.id.s14:
                name = getString(R.string.s14winner);
                season = getString(R.string.s14);
                votes_away = getString(R.string.s14votes_away);
                correct_votes = getString(R.string.s14correct_votes);
                times_played = getString(R.string.s14times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.earl2);
                break;
            case R.id.s15:
                name = getString(R.string.s15winner);
                season = getString(R.string.s15);
                votes_away = getString(R.string.s15votes_away);
                correct_votes = getString(R.string.s15correct_votes);
                times_played = getString(R.string.s15times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.todd2);
                break;
            case R.id.s16:
                name = getString(R.string.s16winner);
                season = getString(R.string.s16);
                votes_away = getString(R.string.s16votes_away);
                correct_votes = getString(R.string.s16correct_votes);
                times_played = getString(R.string.s16times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.parvati2);
                break;
            case R.id.s17:
                name = getString(R.string.s17winner);
                season = getString(R.string.s17);
                votes_away = getString(R.string.s17votes_away);
                correct_votes = getString(R.string.s17correct_votes);
                times_played = getString(R.string.s17times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.bob2);
                break;
            case R.id.s18:
                name = getString(R.string.s18winner);
                season = getString(R.string.s18);
                votes_away = getString(R.string.s18votes_away);
                correct_votes = getString(R.string.s18correct_votes);
                times_played = getString(R.string.s18times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.jt2);
                break;
            case R.id.s19:
                name = getString(R.string.s19winner);
                season = getString(R.string.s19);
                votes_away = getString(R.string.s19votes_away);
                correct_votes = getString(R.string.s19correct_votes);
                times_played = getString(R.string.s19times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.nataliew2);
                break;
            case R.id.s20:
                name = getString(R.string.s20winner);
                season = getString(R.string.s20);
                votes_away = getString(R.string.s20votes_away);
                correct_votes = getString(R.string.s20correct_votes);
                times_played = getString(R.string.s20times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.sandrahvv2);
                break;
            case R.id.s21:
                name = getString(R.string.s21winner);
                season = getString(R.string.s21);
                votes_away = getString(R.string.s21votes_away);
                correct_votes = getString(R.string.s21correct_votes);
                times_played = getString(R.string.s21times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.fabio2);
                break;
            case R.id.s22:
                name = getString(R.string.s22winner);
                season = getString(R.string.s22);
                votes_away = getString(R.string.s22votes_away);
                correct_votes = getString(R.string.s22correct_votes);
                times_played = getString(R.string.s22times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.rob2);
                break;
            case R.id.s23:
                name = getString(R.string.s23winner);
                season = getString(R.string.s23);
                votes_away = getString(R.string.s23votes_away);
                correct_votes = getString(R.string.s23correct_votes);
                times_played = getString(R.string.s23times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.sophie2);
                break;
            case R.id.s24:
                name = getString(R.string.s24winner);
                season = getString(R.string.s24);
                votes_away = getString(R.string.s24votes_away);
                correct_votes = getString(R.string.s24correct_votes);
                times_played = getString(R.string.s24times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.kim2);
                break;
            case R.id.s25:
                name = getString(R.string.s25winner);
                season = getString(R.string.s25);
                votes_away = getString(R.string.s25votes_away);
                correct_votes = getString(R.string.s25correct_votes);
                times_played = getString(R.string.s25times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.denise2);
                break;
            case R.id.s26:
                name = getString(R.string.s26winner);
                season = getString(R.string.s26);
                votes_away = getString(R.string.s26votes_away);
                correct_votes = getString(R.string.s26correct_votes);
                times_played = getString(R.string.s26times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.cochran2);
                break;
            case R.id.s27:
                name = getString(R.string.s27winner);
                season = getString(R.string.s27);
                votes_away = getString(R.string.s27votes_away);
                correct_votes = getString(R.string.s27correct_votes);
                times_played = getString(R.string.s27times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.tyson2);
                break;
            case R.id.s28:
                name = getString(R.string.s28winner);
                season = getString(R.string.s28);
                votes_away = getString(R.string.s28votes_away);
                correct_votes = getString(R.string.s28correct_votes);
                times_played = getString(R.string.s28times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.tony2);
                break;
            case R.id.s29:
                name = getString(R.string.s29winner);
                season = getString(R.string.s29);
                votes_away = getString(R.string.s29votes_away);
                correct_votes = getString(R.string.s29correct_votes);
                times_played = getString(R.string.s29times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.nataliea2);
                break;
            case R.id.s30:
                name = getString(R.string.s30winner);
                season = getString(R.string.s30);
                votes_away = getString(R.string.s30votes_away);
                correct_votes = getString(R.string.s30correct_votes);
                times_played = getString(R.string.s30times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.mike2);
                break;
            case R.id.s31:
                name = getString(R.string.s31winner);
                season = getString(R.string.s31);
                votes_away = getString(R.string.s31votes_away);
                correct_votes = getString(R.string.s31correct_votes);
                times_played = getString(R.string.s31times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.jeremy2);
                break;
            case R.id.s32:
                name = getString(R.string.s32winner);
                season = getString(R.string.s32);
                votes_away = getString(R.string.s32votes_away);
                correct_votes = getString(R.string.s32correct_votes);
                times_played = getString(R.string.s32times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.michele2);
                break;
            case R.id.s33:
                name = getString(R.string.s33winner);
                season = getString(R.string.s33);
                votes_away = getString(R.string.s33votes_away);
                correct_votes = getString(R.string.s33correct_votes);
                times_played = getString(R.string.s33times_played);
                intent.putExtra(WINNER_PHOTO, R.drawable.adam2);
                break;
        }



        // Adds all variables that need to be sent to the intent
        intent.putExtra(WINNER_NAME, name);
        intent.putExtra(WINNER_SEASON, season);
        intent.putExtra(VOTES_AWAY, votes_away);
        intent.putExtra(CORRECT_VOTES, correct_votes);
        intent.putExtra(TIMES_PLAYED, times_played);

        // Opens new activity
        startActivity(intent);
    }

}
