package helpdev.help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void FazerBO(View view){
        Intent startNewActivity = new Intent(this, Help.class);
        startActivity(startNewActivity);
    }

    public void VerMapa(View view){
        Intent abrirMapa = new Intent(this, Mapa.class);
        startActivity(abrirMapa);
    }

    public void abrirConfiguracoes(View view){
        Intent abreconfiguracoes = new Intent(this, Configuracao.class);
        startActivity(abreconfiguracoes);
    }

    public void SairMenu(View view){
        Intent sair_sistema = new Intent(this, Home.class);
        startActivity(sair_sistema);
    }
}
