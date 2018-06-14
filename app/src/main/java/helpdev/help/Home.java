package helpdev.help;

import android.content.Intent;
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

    public void logar(View view){
        Intent startNewActivity = new Intent(this, Menu.class);
        startActivity(startNewActivity);
    }

}

