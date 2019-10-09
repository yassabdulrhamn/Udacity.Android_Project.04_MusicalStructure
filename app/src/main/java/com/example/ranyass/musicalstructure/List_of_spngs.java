package com.example.ranyass.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List_of_spngs extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand","India", "China", "australia", "Portugle", "America", "NewZealand","India", "China", "australia", "Portugle", "America", "NewZealand"};
    int flags[] = {R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index,R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index,R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index, R.drawable.index};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_spngs);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);


        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Toast.makeText(List_of_spngs.this,"hi", Toast.LENGTH_LONG).show();
                }

                if (position == 1) {
                    Toast.makeText(List_of_spngs.this,"to u too", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
