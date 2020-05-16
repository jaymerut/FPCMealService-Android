package com.jay.rutkoski.fpc.FPCMealService;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ContactUsActivity extends AppCompatActivity {

    private static final int MENU_ACTIVITY_REQUEST_CODE = 0;
    private static final int PAYNOW_ACTIVITY_REQUEST_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        setTitle("Contact Us");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    public void menuClicked(View v) {
        Intent intent = new Intent(ContactUsActivity.this, MenuActivity.class);
        startActivityForResult(intent, MENU_ACTIVITY_REQUEST_CODE);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    public void payClicked(View v) {
        Intent intent = new Intent(ContactUsActivity.this, PayNowActivity.class);
        startActivityForResult(intent, PAYNOW_ACTIVITY_REQUEST_CODE);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }
}
