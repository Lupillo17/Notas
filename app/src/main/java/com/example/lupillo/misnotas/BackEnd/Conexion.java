package com.example.lupillo.misnotas.BackEnd;
import android.content.Context;
import android.database.sqlite.*;

public class Conexion extends SQLiteOpenHelper {
    //La clase tiene que heredar de SQLiteOpenHelper
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME="Nota.db";

    //Columnas de la tabla NOTA
    public static final String [] COLUMNAS_NOTA = {
            "_id",
            "Titulo",
            "Descripcion",
            "ArchivoMultimedia",
            "Clasificacion",
            "FechaTerminacion",
            "Recordatorio",
            "Cumplida",
            "FechaResistro"
    };
    //Tabla NOTA
    public static final String [] TABLES_DB = {"Nota"};

    //Scrip para crear la tabla en la base de datos
    public static final String SQL_CREAR="create table Nota (_id integer primary key autoincrement,Titulo text , Descripcion text, ArchivoMultimedia text, Clasificacion text, FechaTerminacion text, Recordatorio text, Cumplida text,FechaResistro text);";


    public void onCreate(SQLiteDatabase db){
        //Ejecutamos la sentencia
        db.execSQL(SQL_CREAR);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public Conexion(Context context){
        //el parametro null hace referencia a un Cursor
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
}
