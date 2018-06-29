package helpdev.help;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        db = new DBHelper(this);
    }

    public void Chamar_Ambulancia(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL);
        String p = "tel:190";
        i.setData(Uri.parse(p));
        startActivity(i);
    }

    public void Chamar_Policia(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL);
        String p = "tel:192";
        i.setData(Uri.parse(p));
        startActivity(i);
    }

    public void Abrir_Mapa(View view){
        Intent Abre_Mapa = new Intent(this, Mapa.class);
        startActivity(Abre_Mapa);
    }

    public void Abrir_Reclamacoes(View view){
        Intent Abre_Mapa = new Intent(this, Reclamacao.class);
        startActivity(Abre_Mapa);
    }

    public void Abrir_Hist_Reclamacoes(View view){
        Intent Abre_Mapa = new Intent(this, Reclamacao.class);
        startActivity(Abre_Mapa);
    }

}

