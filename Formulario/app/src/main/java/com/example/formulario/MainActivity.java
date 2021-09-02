package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
@utor Ariel Diaz Bañol
Version 1.0
notacion pascal
formulario para la diligencia de los datos personales
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //variable del boton registro
 private Button ToRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToRegister = findViewById(R.id.ToRegister);
        ToRegister.setOnClickListener(this);
    }
/*
metodo onclick para llevarnos a la vista formulario en la cual se diligencia los datos
por medio del boton registrar
 */
    @Override
    public void onClick(View V) {
        if (V.getId() == R.id.ToRegister){
            Intent intent = new Intent(this,formulario.class);
                    startActivity(intent);
        }
    }
}