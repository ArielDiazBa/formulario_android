package com.example.formulario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class formulario extends AppCompatActivity implements View.OnClickListener {
    /*
    variables aplicando notacion de pascal
    Id nombre de variable para el campo identificacion
    Name nombre de variable para el campo nombre
    Surname nombre de variable para el campo primer apellido
    SecondSurname nombre de varieble para el campo segundo apellido
    Save nombre de variable para el boton guardar
     */
private EditText Id;
private EditText Name;
private EditText Surname;
private EditText SecondSurname;
private Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Id = findViewById(R.id.Id);
        Name = findViewById(R.id.Name);
        Surname = findViewById(R.id.Surname);
        SecondSurname = findViewById(R.id.SecondSurname);
        Save = findViewById(R.id.Save);
        Save.setOnClickListener(this);
    }
/*
metodo onclick para realizar el guardado de los datos del formulario
 */
    @Override
    public void onClick(View V) {
        if (V.getId()== R.id.Save){
            String id = Id.getText().toString();
            String name = Name.getText().toString();
            String surname = Surname.getText().toString();
            String secondsurname = SecondSurname.getText().toString();
            if (id.isEmpty()){
                Toast.makeText(this,"Error al validar la identificacion",Toast.LENGTH_LONG).show();
                return;
            }
            if (name.isEmpty()){
                Toast.makeText(this,"Error al validar el nombre",Toast.LENGTH_LONG).show();
                return;
            }
            if (surname.isEmpty()){
                Toast.makeText(this,"Error la validar el primer apellido",Toast.LENGTH_LONG).show();
                return;
            }
            if (secondsurname.isEmpty()){
                Toast.makeText(this,"Error al validar el segundo apellido",Toast.LENGTH_LONG).show();
                return;
            }
            limpiarCampos();
            Toast.makeText(this,"Restro exitoso",Toast.LENGTH_LONG).show();
        }
    }
    //metodo para limpiar los campos al guardar los datos
 private void limpiarCampos(){
        Id.setText("");
        Name.setText("");
        Surname.setText("");
        SecondSurname.setText("");
        Id.requestFocus();
}
}