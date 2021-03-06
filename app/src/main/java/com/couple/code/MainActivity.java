package com.couple.code;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.home_menu)
    ImageView homeMenu;
    @BindView(R.id.btn_calendar)
    Button btnCalendar;
    @BindView(R.id.btn_calculator)
    Button btnCalculator;
    @BindView(R.id.btn_weather)
    Button btnWeather;
    @BindView(R.id.btn_express)
    Button btnExpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnCalculator.setOnClickListener(this);
        btnCalendar.setOnClickListener(this);
        btnWeather.setOnClickListener(this);
        btnExpress.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()){
            case R.id.btn_calendar:

                intent = new Intent(this,CalendarActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_express:
                intent = new Intent(this,ExpressActivity.class);
                startActivity(intent);
                break;
        }
    }
}
