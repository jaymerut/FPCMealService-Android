package com.jay.rutkoski.fpc.FPCMealService;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class PayNowActivity extends AppCompatActivity {

    private static final int MENU_ACTIVITY_REQUEST_CODE = 0;
    private static final int CONTACTUS_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_now);
        setTitle("Pay Now");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    public void menuClicked(View v) {
        Intent intent = new Intent(PayNowActivity.this, MenuActivity.class);
        startActivityForResult(intent, MENU_ACTIVITY_REQUEST_CODE);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    public void contactClicked(View v) {
        Intent intent = new Intent(PayNowActivity.this, ContactUsActivity.class);
        startActivityForResult(intent, CONTACTUS_ACTIVITY_REQUEST_CODE);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

}
