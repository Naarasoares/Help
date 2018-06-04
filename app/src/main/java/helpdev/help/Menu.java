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
        Intent startNewActivity = new Intent(this, Menu.class);
        startActivity(startNewActivity);
    }
}
