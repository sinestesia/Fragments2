package es.pamp.fragments2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragmento fragmento1 = new Fragmento();
        Fragmento fragmento2 = new Fragmento();

        transaction.add(R.id.contenedor1, fragmento1);
        transaction.add(R.id.contenedor2, fragmento2);
        transaction.commit();


    }
}
