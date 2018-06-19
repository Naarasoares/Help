package helpdev.help;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Reclamacao extends AppCompatActivity {
    TextView nome, cpf, email, data, endereco, bairro, cidade, descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamacao);

        final Spinner spinner = (Spinner) findViewById(R.id.spn_Tipo);
        String[] tipos = new String[]{
                "Abuso Físico",
                "Abuso Emocional",
                "Maus-tratos"
        };
        final List<String> lista1 = new ArrayList<>(Arrays.asList(tipos));
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.activity_reclamacao,lista1);
        spinnerArrayAdapter.setDropDownViewResource(R.layout.activity_reclamacao);
        spinner.setAdapter(spinnerArrayAdapter);

        final Spinner spn_es = findViewById(R.id.spn_Estado);
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
        spn_es.setAdapter(adaptador);
    }

    public void EnviarReclamacao(View view){
        SQLiteDatabase mydatabase = openOrCreateDatabase("Help",MODE_PRIVATE,null);
        nome = findViewById(R.id.edt_Nome);
        descricao = findViewById(R.id.edt_Descricao);
        endereco = findViewById(R.id.edt_Endereco);
        data = findViewById(R.id.edt_Data);
        Spinner mySpinner= findViewById(R.id.spn_Estado);
        Spinner mySpinner2= findViewById(R.id.spn_Tipo);
        bairro = findViewById(R.id.edt_Bairro);
        cidade = findViewById(R.id.edt_Cidade);
        cpf = findViewById(R.id.edt_CPF);
        email = findViewById(R.id.edt_mail);

        String input1 = nome.getText().toString();
        String input2 = descricao.getText().toString();
        String input3 = endereco.getText().toString();
        String input4 = data.getText().toString();
        String input5 = mySpinner2.getSelectedItem().toString();
        String input6 = mySpinner.getSelectedItem().toString();
        String input7 = bairro.getText().toString();
        String input8 = cpf.getText().toString();
        String input9 = cidade.getText().toString();
        String input10 = email.getText().toString();

        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS " +
                "Reclamacao (Id int NOT NULL, Nome varchar(144), \" +\n" +
                "            \"CPF varchar(11), Rua varchar(155), Bairro varchar(155), Cidade varchar(155), \" +\n" +
                "            \"Estado varchar(2), Descricao varchar(1000), email varchar(100), Tipo varchar(50), Data date, PRIMARY KEY (ID))");
        mydatabase.execSQL("INSERT INTO Reclamacao VALUES(inpu1, input8, input3, " +
                "input7, input9, input6, input2, " +
                "input10, input5, input4);");
        Intent Volta_Menu = new Intent(this, Menu.class);
        startActivity(Volta_Menu);
    }


}
