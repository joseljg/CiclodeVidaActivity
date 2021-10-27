package es.joseljg.ciclodevidaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//-----------------------------------------------------------
    EditText edt_numero1 = null;
    EditText edt_numero2 = null;
    TextView txt_suma = null;
    int numero1 = 0;
    int numero2 = 0;
    int suma = 0;
//-----------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //----------------------------------------------------
        edt_numero1 = (EditText) findViewById(R.id.edt_numero1);
        edt_numero2 = (EditText) findViewById(R.id.edt_numero2);
        txt_suma = (TextView) findViewById(R.id.txt_suma);
        //----------------------------------------------------
        Log.i("estados", "estoy en el mainActivity en el estado oncreate");
    }
//----------------------------------------------------------------------------------------

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("estados", "estoy en el mainActivity en el estado onstart");
    }
 //-----------------------------------------------------------------------------------------


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("estados", "estoy en el mainActivity en el estado onresume");
    }
    //--------------------------------------------------------------------------------------


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("estados", "estoy en el mainActivity en el estado onpause");
    }
    //---------------------------------------------------------------------------------------


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("estados", "estoy en el mainActivity en el estado onstop");
    }
    //---------------------------------------------------------------------------------------


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("estados", "estoy en el mainActivity en el estado ondestroy");
    }
    //---------------------------------------------------------------------------------------


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("estados", "estoy en el mainActivity en el estado onrestart");
    }
    //---------------------------------------------------------------------------------------

    public void sumar(View view) {
        String texto_numero1 = String.valueOf(edt_numero1.getText());
        numero1 = Integer.valueOf(texto_numero1);
        String texto_numero2 = String.valueOf(edt_numero2.getText());
        numero2 = Integer.valueOf(texto_numero2);
        suma = numero1 + numero2;
        txt_suma.setText(String.valueOf(suma));
    }

    public void siguiente(View view) {
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}