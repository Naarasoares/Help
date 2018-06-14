package helpdev.help;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {

    private static final String CRIA_USUARIO = "CREATE TABLE usuario (Nome varchar(144), RG varchar(12), CPF int, Cod_Endereco int, PRIMARY KEY (CPF), FOREIGN KEY (Cod_Endereco) REFERENCES endereco(Cod_Endereco))";
    private static final String CRIA_SERVICO = "CREATE TABLE servico (Cod_Servico int, Tipo int, Cod_Endereco int, Data date, PRIMARY KEY (Registro), FOREIGN KEY (Cod_Endereco) REFERENCES endereco(Cod_Endereco))";
    private static final String CRIA_SERVIDOR = "CREATE TABLE servidor (Cod_Servico int, CPF_Autoridade int, FOREIGN KEY (Cod_Servico) REFERENCES servico(Cod_Servico), FOREIGN KEY (CPF_Autoridade) REFERENCES usuario(CPF))";
    private static final String CRIA_EMERGENCIA = "CREATE TABLE emergencia (Cod_Emergecia int, Cod_Endereco int, Tipo int, Descricao text, FOREIGN KEY (Cod_Endereco) REFERENCES endereco(Cod_Endereco))";
    private static final String CRIA_OCORRENCIA = "CREATE TABLE ocorrencia (Cod_Ocorrencia int, Tipo varchar(144), Cod_Endereco int, Data date, Descricao text, PRIMARY KEY (Cod_Ocorrencia), FOREIGN KEY (Cod_Endereco) REFERENCES endereco(Cod_Endereco))";
    private static final String CRIA_ENDERECO = "CREATE TABLE endereco (Cod_Endereco int, Logradouro varchar(144), Numero int, Bairro varchar(144), Cidade varchar(144), Estado varchar(144), CEP varchar(144), Complemento varchar(144), PRIMARY KEY (Cod_Endereco))";

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "HELP.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CRIA_USUARIO);
        db.execSQL(CRIA_SERVICO);
        db.execSQL(CRIA_SERVIDOR);
        db.execSQL(CRIA_EMERGENCIA);
        db.execSQL(CRIA_OCORRENCIA);
        db.execSQL(CRIA_ENDERECO);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL(CRIA_USUARIO);
//        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}