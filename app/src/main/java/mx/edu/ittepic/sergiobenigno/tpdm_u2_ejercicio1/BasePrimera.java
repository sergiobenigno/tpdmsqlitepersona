package mx.edu.ittepic.sergiobenigno.tpdm_u2_ejercicio1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BasePrimera extends SQLiteOpenHelper {
    public BasePrimera(Context context, String name,
                        SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta cuando se Instala y se ejecuta x 1ra vez la APP
        db.execSQL("CREATE TABLE PERSONA( IDPERSONA INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE VARCHAR(500), DOMICILIO VARCHAR(200) )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Se ejecuta SI y SOLO SI la versión cambió


    }
}
