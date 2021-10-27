package es.joseljg.ciclodevidaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.i("estados", "estoy en el Activity2 en el estado oncreate");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("estados", "estoy en el Activity2 en el estado onstart");
    }
    //-----------------------------------------------------------------------------------------


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("estados", "estoy en el Activity2 en el estado onresume");
    }
    //--------------------------------------------------------------------------------------


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("estados", "estoy en el Activity2 en el estado onpause");
    }
    //---------------------------------------------------------------------------------------


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("estados", "estoy en el Activity2 en el estado onstop");
    }
    //---------------------------------------------------------------------------------------


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("estados", "estoy en el Activity2 en el estado ondestroy");
    }
    //---------------------------------------------------------------------------------------


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("estados", "estoy en el Activity2 en el estado onrestart");
    }
    //---------------------------------------------------------------------------------------
}