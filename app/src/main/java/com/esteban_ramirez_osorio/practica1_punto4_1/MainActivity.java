package com.esteban_ramirez_osorio.practica1_punto4_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tValor, tRaya,tRaya2,tRaya3;
    private Spinner sColor1,sColor2,sColor3;
    private String value1, prueba = "",value="1",value2="0",value3="2";
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tRaya = (TextView) findViewById(R.id.tRaya);
        tRaya2 = (TextView) findViewById(R.id.tRaya2);
        tRaya3=(TextView) findViewById(R.id.tRaya3);
        tValor = (TextView) findViewById(R.id.tValor);
        sColor1 = (Spinner) findViewById(R.id.sColor1);
        sColor2 = (Spinner) findViewById(R.id.sColor2);
        sColor3 =(Spinner) findViewById((R.id.sColor3));
        b = (Button) findViewById(R.id.boton);
///////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.colors1, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sColor1.setAdapter(adapter);

        sColor1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                value = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.colors2, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sColor2.setAdapter(adapter1);

        sColor2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                value2 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.colors3, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sColor3.setAdapter(adapter2);

        sColor3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                value3 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ///////////////////////////////////////////////////////////////////////////////////////////
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                switch (value) {
                    case "negro":
                        tRaya.setBackgroundColor(Color.BLACK);
                        value1="0";
                        break;
                    case "cafe":
                        tRaya.setBackgroundColor(Color.rgb(118, 60, 40));
                        value1="1";
                        break;
                    case "rojo":
                        tRaya.setBackgroundColor(Color.RED);
                        value1="2";
                        break;
                    case "naranja":
                        tRaya.setBackgroundColor(Color.rgb(244, 70, 17));
                        value1="3";
                        break;
                    case "amarillo":
                        tRaya.setBackgroundColor(Color.YELLOW);
                        value1="4";
                        break;
                    case "verde":
                        tRaya.setBackgroundColor(Color.GREEN);
                        value1="5";
                        break;
                    case "azul":
                        tRaya.setBackgroundColor(Color.BLUE);
                        value1="6";
                        break;
                    case "morado":
                        tRaya.setBackgroundColor(Color.rgb(140, 86, 138));
                        value1="7";
                        break;
                    case "gris":
                        tRaya.setBackgroundColor(Color.rgb(156, 156, 156));
                        value1="8";
                        break;
                    case "blanco":
                        tRaya.setBackgroundColor(Color.WHITE);
                        value1="9";
                        break;
                }

                switch (value2) {
                    case "negro":
                        tRaya2.setBackgroundColor(Color.BLACK);
                        value2="0";
                        break;
                    case "cafe":
                        tRaya2.setBackgroundColor(Color.rgb(118, 60, 40));
                        value2="1";
                        break;
                    case "rojo":
                        tRaya2.setBackgroundColor(Color.RED);
                        value2="2";
                        break;
                    case "naranja":
                        tRaya2.setBackgroundColor(Color.rgb(244, 70, 17));
                        value2="3";
                        break;
                    case "amarillo":
                        tRaya2.setBackgroundColor(Color.YELLOW);
                        value2="4";
                        break;
                    case "verde":
                        tRaya2.setBackgroundColor(Color.GREEN);
                        value2="5";
                        break;
                    case "azul":
                        tRaya2.setBackgroundColor(Color.BLUE);
                        value2="6";
                        break;
                    case "morado":
                        tRaya2.setBackgroundColor(Color.rgb(140, 86, 138));
                        value2="7";
                        break;
                    case "gris":
                        tRaya2.setBackgroundColor(Color.rgb(156, 156, 156));
                        value2="8";
                        break;
                    case "blanco":
                        tRaya2.setBackgroundColor(Color.WHITE);
                        value2="9";
                        break;
                }

                switch (value3) {
                    case "negro":
                        tRaya3.setBackgroundColor(Color.BLACK);
                        value3="0";
                        break;
                    case "cafe":
                        tRaya3.setBackgroundColor(Color.rgb(118, 60, 40));
                        value3="1";
                        break;
                    case "rojo":
                        tRaya3.setBackgroundColor(Color.RED);
                        value3="2";
                        break;
                    case "naranja":
                        tRaya3.setBackgroundColor(Color.rgb(244, 70, 17));
                        value3="3";
                        break;
                    case "amarillo":
                        tRaya3.setBackgroundColor(Color.YELLOW);
                        value3="4";
                        break;
                    case "verde":
                        tRaya3.setBackgroundColor(Color.GREEN);
                        value3="5";
                        break;
                    case "azul":
                        tRaya3.setBackgroundColor(Color.BLUE);
                        value3="6";
                        break;
                    case "morado":
                        tRaya3.setBackgroundColor(Color.rgb(140, 86, 138));
                        value3="7";
                        break;
                    case "gris":
                        tRaya3.setBackgroundColor(Color.rgb(156, 156, 156));
                        value3="8";
                        break;
                    case "blanco":
                        tRaya3.setBackgroundColor(Color.WHITE);
                        value3="9";
                        break;
                }

                tValor.setText(value1+"."+value2+"E"+value3+"ohm");
            }
        });


    }
}
