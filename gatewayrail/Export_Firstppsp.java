package com.example.th3_sagittarian.gatewayrail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.FIRST_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.FOURTH_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.NAMER;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.SECOND_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.THIRD_COLUMN;

public class Export_Firstppsp extends AppCompatActivity {
    private ArrayList<HashMap<String, String>> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.export_activity_firstppsp);


        ListView listView=(ListView)findViewById(R.id.exportlistViewppsp);
        populateList();
        Export_ListViewAdapterppsp adapter=new Export_ListViewAdapterppsp(this, list);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                TextView textView = (TextView) view.findViewById(R.id.TextFirstppsp);
                String text = textView.getText().toString();
                if(text=="PPSP")
                {
                    Intent inu = new Intent(Export_Firstppsp.this,Export_FinalTablePPSP.class);
                    inu.putExtra("KEY","PPSP");
                    startActivity(inu);

                }
                if(text=="MDPT")
                {
                    Intent inu = new Intent(Export_Firstppsp.this,Export_FinalTablePPSP.class);
                    inu.putExtra("KEY","MDPT");
                    startActivity(inu);


                }
                if(text=="JNPT")
                {

                    Intent inu = new Intent(Export_Firstppsp.this,Export_FinalTablePPSP.class);
                    inu.putExtra("KEY","JNPT");
                    startActivity(inu);


                }

            }
        });


    }

    private void populateList() {

        String b = String.valueOf(1500);
        String c =String.valueOf(500);
        // TODO Auto-generated method stub

        list=new ArrayList<HashMap<String,String>>();

        HashMap<String,String> temp=new HashMap<String, String>();


        temp.put(SECOND_COLUMN, b);
        temp.put(THIRD_COLUMN, c);
        temp.put(FOURTH_COLUMN, "1500");

        HashMap<String,String> temp2=new HashMap<String, String>();

        temp2.put(SECOND_COLUMN, b);
        temp2.put(THIRD_COLUMN, c);
        temp2.put(FOURTH_COLUMN,"1500" );

        HashMap<String,String> temp3=new HashMap<String, String>();

        temp3.put(SECOND_COLUMN, b);
        temp3.put(THIRD_COLUMN, c);
        temp3.put(FOURTH_COLUMN,"1500" );


        ///////////////ffffffffffffff/////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////ffffffff/////////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////fff///fff///fff//////fff////////////////////////
////////////////fff///fff/////fff///fff////////////////////////////////
////////////////fff///fff///////fffff////////////////////////////////
////////////////fff///fff//////fff/fff///////////////////////////////
////////////////fff///fff/////fff///fff/////////////////////////////
////////////////fff///fff///fff///////fff///////////////////////////
        temp.put(NAMER, "1");
        temp2.put(NAMER, "2");
        temp3.put(NAMER, "3");

        temp.put(FIRST_COLUMN, "PPSP");
        temp2.put(FIRST_COLUMN, "MDPT");
        temp3.put(FIRST_COLUMN, "JNPT");

        ///////////////ffffffffffffff/////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////ffffffff/////////////////////////////////////
////////////////fff///////////////////////////////////////////
////////////////fff///fff///fff//////fff////////////////////////
////////////////fff///fff/////fff///fff////////////////////////////////
////////////////fff///fff///////fffff////////////////////////////////
////////////////fff///fff//////fff/fff///////////////////////////////
////////////////fff///fff/////fff///fff/////////////////////////////
////////////////fff///fff///fff///////fff///////////////////////////


        list.add(temp);
        list.add(temp2);
        list.add(temp3);

    }

    public void move(View view) {
        Toast.makeText(this, "ALREADY VIEWING TABULAR-VIEW", Toast.LENGTH_SHORT).show();
    }

    public void move1(View view) {

        Intent inuuu = new Intent(Export_Firstppsp.this, Export_Import2.class);
        inuuu.putExtra("KEY", "GHH");
        startActivity(inuuu);
        finish();

    }
}
