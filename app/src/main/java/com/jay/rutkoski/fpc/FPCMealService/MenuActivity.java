package com.jay.rutkoski.fpc.FPCMealService;

import android.content.Intent;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.*;
import android.widget.*;
import android.graphics.*;
import android.view.*;
import android.text.*;


import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private static final int CONTACTUS_ACTIVITY_REQUEST_CODE = 1;
    private static final int PAYNOW_ACTIVITY_REQUEST_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Menu");

        final TextView textView1 = findViewById(R.id.seg_mon);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView1.setBackgroundColor(Color.BLACK);
                textView1.setTextColor(Color.WHITE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    public void contactClicked(View v) {
        Intent intent = new Intent(MenuActivity.this, ContactUsActivity.class);
        startActivityForResult(intent, CONTACTUS_ACTIVITY_REQUEST_CODE);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    public void payClicked(View v) {
        Intent intent = new Intent(MenuActivity.this, PayNowActivity.class);
        startActivityForResult(intent, PAYNOW_ACTIVITY_REQUEST_CODE);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }
}
