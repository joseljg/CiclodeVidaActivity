package es.joseljg.ciclodevidaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }

    public void sumar(View view) {
        String texto_numero1 = String.valueOf(edt_numero1.getText());
        numero1 = Integer.valueOf(texto_numero1);
        String texto_numero2 = String.valueOf(edt_numero1.getText());
        numero2 = Integer.valueOf(texto_numero2);
    }
}