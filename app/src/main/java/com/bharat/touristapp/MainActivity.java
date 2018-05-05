package com.bharat.touristapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Monument> monumentArrayList = new ArrayList<>();

        monumentArrayList.add(new Monument(R.drawable.gujrimahal,"Gujri Mahal","14th-century sandstone palace & mosque"));
        monumentArrayList.add(new Monument(R.drawable.firozpalace,"Firoz Palace","Remains of a 14th-century royal palace"));
        monumentArrayList.add(new Monument(R.drawable.jindaltower,"Jindal Tower","Lookout platform with expansive views"));
        monumentArrayList.add(new Monument(R.drawable.opjindalpark,"OP Jindal Park","Park for kids and adults"));
        monumentArrayList.add(new Monument(R.drawable.townpark,"Town Park","Park with exercise & play areas"));
        monumentArrayList.add(new Monument(R.drawable.bluebirdlake,"Blue Bird Lake","Lake"));


        final MonumentAdapter monumentAdapter = new MonumentAdapter(getApplicationContext(),R.layout.list_item_format,monumentArrayList);


        ListView listOfMonuments = findViewById(R.id.listView);
        listOfMonuments.setAdapter(monumentAdapter);

        listOfMonuments.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Monument monument = (Monument) monumentAdapter.getItem(i);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/?api=1&query="+monument.getmTitle()+",Hisar"));
                startActivity(intent);
            }
        });

    }
}
