package helpdev.help;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Reclamacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamacao);

        final Spinner spinner = (Spinner) findViewById(R.id.spn_Tipo);
        String[] tipos = new String[]{
                "Abuso Físico",
                "Abuso Emocional",
                "Maus-tratos",
                ""
        };
        final List<String> lista1 = new ArrayList<>(Arrays.asList(tipos));
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.activity_reclamacao,lista1);
        spinnerArrayAdapter.setDropDownViewResource(R.layout.activity_reclamacao);
        spinner.setAdapter(spinnerArrayAdapter);

        final Spinner spn_es = (Spinner) findViewById(R.id.spn_Estado);
        String[] estados = new String[]{
                "AC",
                "AL",
                "AP",
                "AM",
                "BA",
                "CE",
                "DF",
                "ES",
                "GO",
                "MA",
                "MT",
                "MS",
                "MG",
                "PA",
                "PB",
                "PR",
                "PE",
                "PI",
                "RJ",
                "RN",
                "RS",
                "RO",
                "RR",
                "SC",
                "SP",
                "SE",
                "TO"
        };
        final List<String> lista2 = new ArrayList<>(Arrays.asList(estados));
        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                this,R.layout.activity_reclamacao,lista2);
        adaptador.setDropDownViewResource(R.layout.activity_reclamacao);
        spinner.setAdapter(adaptador);
    }

    public void EnviarReclamacao(){

    }


}
