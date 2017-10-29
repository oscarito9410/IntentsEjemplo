package com.oscar.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class InicioActivity extends AppCompatActivity {

    private static final String TAG = "InicioActivity";//LOGT

    private EditText etNombre,etNumerotel, etEmail,etHobi,etLugart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        etNombre=(EditText)findViewById(R.id.etNombre);
        etNumerotel=(EditText) findViewById(R.id.etNumerotel);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etHobi=(EditText)findViewById(R.id.etHobi);
        etLugart=(EditText)findViewById(R.id.etLugart);
    }

    //onclick OK
    public void accion(View view) {
        if(etNombre.getText().toString().isEmpty())
        {
            etNombre.setError("Ingresa nombre");
            etNombre.requestFocus();
        }
        else
        if(etNumerotel.getText().toString().isEmpty())
        {
            etNumerotel.setError("Ingresa telefono");
            etNumerotel.requestFocus();
        }
        else
        if(etEmail.getText().toString().isEmpty())
        {
            etEmail.setError("Ingresa e-mail");
            etEmail.requestFocus();
        }
        else
        if(etHobi.getText().toString().isEmpty())
        {
            etHobi.setError("Ingresa hobi");
            etHobi.requestFocus();
        }
        else
        if(etLugart.getText().toString().isEmpty())
        {
            etLugart.setError("Ingresa lugar de trabajo");
            etLugart.requestFocus();
        }
        else
        {
            Usuario user = new Usuario();
            user.setNombre(etNombre.getText().toString());
            user.setTelefononumber(etNumerotel.getText().toString());
            user.setEmail(etEmail.getText().toString());
            user.setLugartrabajo(etLugart.getText().toString());
            user.setHobi(etHobi.getText().toString());
            Log.i(TAG,user.toString());

            Intent i=new Intent(this,DetalleActivity.class);
            //Serializable
            Bundle bun = new Bundle();
            bun.putSerializable("user",user);
            i.putExtras(bun);

            //Dato x dato
            i.putExtra("nombre",user.getNombre());
            i.putExtra("tel",user.getTelefononumber());
            i.putExtra("maill",user.getEmail());
            i.putExtra("hobii",user.getHobi());
            i.putExtra("lugarr",user.getLugartrabajo());


            startActivity(i);

        }







    }
}
