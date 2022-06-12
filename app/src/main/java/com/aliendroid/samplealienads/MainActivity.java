package com.aliendroid.samplealienads;

import static com.aliendroid.samplealienads.SettingAds.BACKUP_ADS;
import static com.aliendroid.samplealienads.SettingAds.BACKUP_ADS_BANNER;
import static com.aliendroid.samplealienads.SettingAds.BACKUP_ADS_INTERTITIAL;
import static com.aliendroid.samplealienads.SettingAds.BACKUP_ADS_REWARDS;
import static com.aliendroid.samplealienads.SettingAds.HIGH_PAYING_KEYWORD1;
import static com.aliendroid.samplealienads.SettingAds.HIGH_PAYING_KEYWORD2;
import static com.aliendroid.samplealienads.SettingAds.HIGH_PAYING_KEYWORD3;
import static com.aliendroid.samplealienads.SettingAds.HIGH_PAYING_KEYWORD4;
import static com.aliendroid.samplealienads.SettingAds.HIGH_PAYING_KEYWORD5;
import static com.aliendroid.samplealienads.SettingAds.INITIALIZE_SDK;
import static com.aliendroid.samplealienads.SettingAds.INITIALIZE_SDK_BACKUPADS;
import static com.aliendroid.samplealienads.SettingAds.INTERVAL;
import static com.aliendroid.samplealienads.SettingAds.MAIN_ADS_BANNER;
import static com.aliendroid.samplealienads.SettingAds.MAIN_ADS_INTERTITIAL;
import static com.aliendroid.samplealienads.SettingAds.MAIN_ADS_REWARDS;
import static com.aliendroid.samplealienads.SettingAds.NATIVE_ADS_ADMOB;
import static com.aliendroid.samplealienads.SettingAds.SELECT_ADS;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.aliendroid.alienads.AlienGDPR;
import com.aliendroid.alienads.AliendroidBanner;
import com.aliendroid.alienads.AliendroidInitialize;
import com.aliendroid.alienads.AliendroidIntertitial;
import com.aliendroid.alienads.AliendroidNative;
import com.aliendroid.alienads.AliendroidReward;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layAds = findViewById(R.id.layAds);
        FrameLayout nativeads = findViewById(R.id.laynative);
        RelativeLayout layAdsmall = findViewById(R.id.laysAdsmall);
        AlienGDPR.loadGdpr(MainActivity.this,SELECT_ADS,true);

        /*AliendroidBanner.MediumBanner(MainActivity.this, layAds,SettingAds.SELECT_ADS, SettingAds.MAIN_ADS_BANNER,HIGH_PAYING_KEYWORD1
        ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5);
        AliendroidBanner.SmallBanner(MainActivity.this, layAdsmall,SettingAds.SELECT_ADS, SettingAds.MAIN_ADS_BANNER,HIGH_PAYING_KEYWORD1
                ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5);
        AliendroidIntertitial.LoadIntertitial(MainActivity.this, SettingAds.SELECT_ADS, SettingAds.MAIN_ADS_INTERTITIAL,HIGH_PAYING_KEYWORD1
                ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5 );
        AliendroidNative.SmallNativeAdmob(MainActivity.this,SELECT_ADS, SettingAds.BACKUP_ADS, nativeads, NATIVE_ADS_ADMOB,MAIN_ADS_BANNER, HIGH_PAYING_KEYWORD1
                ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5);
        AliendroidReward.LoadReward(MainActivity.this, SELECT_ADS, MAIN_ADS_REWARDS );
        AlienOpenAds.ShowOpen(MainActivity.this);
         */

                AliendroidInitialize.SelectAdsAdmob(MainActivity.this,BACKUP_ADS,INITIALIZE_SDK_BACKUPADS);
               AliendroidBanner.SmallBannerAdmob(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER, HIGH_PAYING_KEYWORD1,
                        HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);
                AliendroidIntertitial.LoadIntertitialAdmob(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, HIGH_PAYING_KEYWORD1,
                        HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);
                AliendroidReward.LoadRewardAdmob(MainActivity.this,BACKUP_ADS,MAIN_ADS_REWARDS,BACKUP_ADS_REWARDS);
                AliendroidNative.MediumNative(MainActivity.this,layAdsmall,"",NATIVE_ADS_ADMOB,"",HIGH_PAYING_KEYWORD1,HIGH_PAYING_KEYWORD2,
                HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5);

    }

    public void munculiklan(View view){
                AliendroidIntertitial.ShowIntertitialAdmob(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL,
                        HIGH_PAYING_KEYWORD1, HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);
    }

    public void munculreward(View view){
        switch (SELECT_ADS) {
            case "ADMOB":
                AliendroidReward.ShowRewardAdmob(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "APPLOVIN-M":
                AliendroidReward.ShowRewardApplovinMax(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "MOPUB":
                AliendroidReward.ShowRewardMopub(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "GOOGLE-ADS":
                AliendroidReward.ShowRewardGoogleAds(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "UNITY":
                AliendroidReward.ShowRewardUnity(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;


        }
    }

    public void onResume(){
        super.onResume();
        if (AliendroidReward.unlockreward){
            Toast.makeText(getApplicationContext(), "OK Berhasil", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "gagal", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
        super.onBackPressed();
    }
}