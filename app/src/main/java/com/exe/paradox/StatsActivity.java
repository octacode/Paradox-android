package com.exe.paradox;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import az.plainpie.PieView;
import az.plainpie.animation.PieAngleAnimation;
import az.plainpie.animation.PieStrokeWidthAnimation;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_stats);
        setSupportActionBar(toolbar);

        PieView pieView = (PieView) findViewById(R.id.pieView);
        pieView.setInnerText("A");

        PieAngleAnimation animation = new PieAngleAnimation(pieView);
        animation.setDuration(2000); //This is the duration of the animation in millis
        pieView.startAnimation(animation);
        pieView.setPercentageBackgroundColor(Color.RED);
        pieView.setPieInnerPadding(50);

        pieView.setInnerTextVisibility(View.VISIBLE);

        //fetch the level number and if 12 questions then 2/12
        pieView.setInnerText("Level 9");

        pieView.setPercentageTextSize(35);
    }
}
