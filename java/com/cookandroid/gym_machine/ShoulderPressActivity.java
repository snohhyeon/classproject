package com.cookandroid.gym_machine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;


public class ShoulderPressActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulder_press);


        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        final ArrayList<String> items = new ArrayList<String>() ;
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, items) ;

        final ListView listview = (ListView) findViewById(R.id.list) ;
        listview.setAdapter(adapter) ;

        Button addButton = (Button) findViewById(R.id.btnReserve);
        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int count;
                count = adapter.getCount();

                items.add("예약자" + Integer.toString(1));

                adapter.notifyDataSetChanged();
            }
        });
    }
}


