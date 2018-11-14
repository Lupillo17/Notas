package com.example.lupillo.misnotas;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.example.lupillo.misnotas.BackEnd.Conexion;
import com.example.lupillo.misnotas.BackEnd.Nota;
import com.example.lupillo.misnotas.FrontEnd.NotaDAO;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView lsv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lsv=findViewById(R.id.lsv);
        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this,AgregarNota.class);
                i.putExtra("kaka","Hola");
                startActivity(i);
            }
        });
        cargar();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.agregar:
                Intent i = new Intent(MainActivity.this,AgregarNota.class);
                i.putExtra("kaka","Hola");
                startActivity(i);
                break;
        }
        return true;
    }

    public void cargar(){
        NotaDAO dao = new NotaDAO(this);
        List<Nota> lst =  dao.getAll();
        for (Nota item: lst
                ) {
            Log.d("NOTA: " ,  item.getTitulo());
            Log.d("NOTA: " , item.getDescripcion());
        }
        Cursor c =  dao.getAllC();
        SimpleCursorAdapter adp = new SimpleCursorAdapter(
                this, android.R.layout.simple_list_item_1 ,
                c , Conexion.COLUMNAS_NOTA,
                new int[]{android.R.id.text2,android.R.id.text1},
                SimpleCursorAdapter.NO_SELECTION

        );

        lsv.setAdapter(adp);
    }

    @Override
    public void onResume() {
        super.onResume();
        cargar();
    }
}

