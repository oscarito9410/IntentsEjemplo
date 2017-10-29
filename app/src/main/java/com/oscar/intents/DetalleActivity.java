package com.oscar.intents;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DetalleActivity extends AppCompatActivity {

    private Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //Serializable
        if(getIntent().hasExtra("user")) {
            user=(Usuario)getIntent().getSerializableExtra("user");
            Toast.makeText(this,user.toString(),Toast.LENGTH_LONG).show();
        }

        //Dato*dato
        if(getIntent().hasExtra("nombre")){
            Toast.makeText(this,getIntent().getStringExtra("nombre"),Toast.LENGTH_SHORT).show();
        }
        if(getIntent().hasExtra("tel")){
            Toast.makeText(this,getIntent().getStringExtra("tel"),Toast.LENGTH_SHORT).show();
        }

        if(getIntent().hasExtra("maill")){
            Toast.makeText(this,getIntent().getStringExtra("maill"),Toast.LENGTH_SHORT).show();
        }
    }

    public void llamar(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+user.getTelefononumber()));
        startActivity(i);
    }

    public void mapear(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("google.navigation:q="+user.getLugartrabajo()));
        startActivity(i);
    }

    public void buscarweb(View view) {
        Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
        i.putExtra(SearchManager.QUERY,user.getHobi());
        startActivity(i);
    }

    public void mailsend(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+user.getEmail()));
        intent.putExtra(Intent.EXTRA_SUBJECT,"Titulo email");
        intent.putExtra(Intent.EXTRA_TEXT,"Cuerpo del mensaje");
        startActivity(intent);
    }
}
