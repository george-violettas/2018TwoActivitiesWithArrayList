package com.example.georgevio.a2apctivities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class activ2 extends AppCompatActivity {
    Button btnBack;
    Button bttnAdd;
    ListView List1 ;
    ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ2);

        List1 = (ListView) findViewById(R.id.List1);

        // Create and populate a List of planet names.
        String[] planets = new String[] { "Mercury","Venus"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll( Arrays.asList(planets) );

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, planetList);

        // Set the ArrayAdapter as the ListView's adapter.
        List1.setAdapter( listAdapter );

        btnBack = (Button)findViewById(R.id.bttnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        bttnAdd = (Button)findViewById(R.id.bttnAdd);
        bttnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listAdapter.add( "Ceres" );
                List1.setAdapter( listAdapter );
            }
        });
    }
}
