package com.andresflores.taxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    Switch PasajeroOTaxistaSwitch;
    Button mRegisterButton;



  /*  public void Seleccione2(View view) {

         Intent ActivityRegister2 = new Intent(this,ActivityRegister.class);
        startActivity(ActivityRegister2);





      String PasajeroOTaxista= "pasajero";

        if (PasajeroOTaxistaSwitch.isChecked()){

            PasajeroOTaxista ="taxista";

        }

    } */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // PasajeroOTaxistaSwitch = (Switch) findViewById(R.id.TaxistaOPasajeroSwitch);
        mRegisterButton = (Button) findViewById(R.id.button2);

         getSupportActionBar().hide();




            mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });


    }
}
