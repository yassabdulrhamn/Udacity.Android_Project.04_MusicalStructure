package com.example.ranyass.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer[] FlagImage;
    private String LOG_TAG = "MainActivity";
    private String[] Country;
    private GridView CountryGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] Country = {"Australia","China","Finland",
                "France","Germany","Netherlands",
                "India","Italy","Japan",
                "Korea","Maxico","Norway",
                "Pakistan","Peru","Sweden",
                "Thailand","Turkey","UAE",
                "UK","Ukrain","USA"};


        CountryGrid = (GridView) findViewById(R.id.gridview);
        CountryAdapter ca = new CountryAdapter(this,Country);
        CountryGrid.setAdapter(ca);

        CountryGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                String a = Country[position];
                Toast.makeText(MainActivity.this, "Pos:" + position + " Country:" + a,
                        Toast.LENGTH_SHORT).show();

            }

        });
    }
}
