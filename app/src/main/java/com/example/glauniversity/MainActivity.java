package com.example.glauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PieChart mPieChart = (PieChart) findViewById(R.id.piechart_one);

        mPieChart.addPieSlice(new PieModel("Freetime", 20, Color.parseColor("#FFA500")));
        mPieChart.addPieSlice(new PieModel("Sleep", 80, Color.parseColor("#32CD32")));

        mPieChart.startAnimation();
    }
}