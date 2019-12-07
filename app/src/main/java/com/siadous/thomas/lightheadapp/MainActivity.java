package com.siadous.thomas.lightheadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        mRelativeLayout.setBackgroundColor(Color.WHITE);
        clickOnButton();
    }

    private void clickOnButton() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = ((ColorDrawable)mRelativeLayout.getBackground()).getColor();

                if(color == Color.WHITE || color == Color.BLUE) {
                    mRelativeLayout.setBackgroundColor(Color.RED);
                }
                else {
                    mRelativeLayout.setBackgroundColor(Color.BLUE);
                }
            }
        });
    }


    public void initUI() {
        mButton = findViewById(R.id.change_button);
        mRelativeLayout = findViewById(R.id.relative_layout_main_activity);
    }
}
