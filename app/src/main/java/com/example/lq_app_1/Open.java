package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Open extends AppCompatActivity {
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view) {
        openDrawer(drawerLayout);

    }

    public void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void ClickLogo(View view) {
        closeDrawer(drawerLayout);
    }

    public void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {

            drawerLayout.closeDrawer(GravityCompat.START);
        }



    }
    public void ClickHome(View view){
        recreate();
    }
    public void ClickFeedback(View view){
        redirectActivity(this,FeedBack_drawar.class);
    }

    public void ClickRateUs(View view){
        redirectActivity(this,Rate_drawar.class);
    }

    public void ClickPolicy(View view){
        redirectActivity(this,Privacy_Policy_drawar.class);
    }

    public void ClickDeveloper(View view){
        redirectActivity(this,FeedBack_drawar.class);
    }

    public void ClickShareLink(View view){
        redirectActivity(this,Share_drawar.class);
    }
    public static  void redirectActivity(Activity activity,Class aClass){
        Intent intent  =new Intent(activity,aClass);
        activity.startActivity(intent);

    }


    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
}