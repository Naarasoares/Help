package helpdev.help;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {

    private static final String CRIA_USUARIO = "CREATE TABLE Reclamacao (Id INTEGER NOT NULL , Nome varchar(144), " +
            "CPF varchar(11), Rua varchar(155), Bairro varchar(155), Cidade varchar(155), " +
            "Estado varchar(2), Descricao varchar(1000), email varchar(100), Tipo varchar(50), Data date, PRIMARY KEY (ID))";

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "HELP.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CRIA_USUARIO);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL(CRIA_USUARIO);
//        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}