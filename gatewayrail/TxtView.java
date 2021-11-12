package com.example.th3_sagittarian.gatewayrail;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import static com.example.th3_sagittarian.gatewayrail.Constants.FIRST_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Constants.SECOND_COLUMN;



public class TxtView extends AppCompatActivity {
    TextView TV_Header;
    Typeface font;
    Button btn_Get;
    ListView LV_Country;
//    SimpleAdapter ADAhere;
    private ArrayList<HashMap<String, String>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_view);


        final ListView listView=(ListView)findViewById(R.id.listView1);
        populateList();
        final ListViewAdapter adapter=new ListViewAdapter(this, list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                TextView textView = (TextView) view.findViewById(R.id.TextFirst);
                String text = textView.getText().toString();
                if(text=="PPSP")
                {
                 Intent inu = new Intent(TxtView.this,Firstppsp.class);

                    startActivity(inu);

                }
                if(text=="MDPT")
                {
                    Intent inu = new Intent(TxtView.this,Firstmdpt.class);
                    startActivity(inu);


                }
                if(text=="JNPT")
                {

                    Intent inu = new Intent(TxtView.this,Firstjnpt.class);
                    startActivity(inu);


                }

            }
        });


    }

    private void populateList() {
        // TODO Auto-generated method stub

        list=new ArrayList<HashMap<String,String>>();

        HashMap<String,String> temp=new HashMap<String, String>();
        temp.put(SECOND_COLUMN, "1500");

        HashMap<String,String> temp2=new HashMap<String, String>();
        temp2.put(SECOND_COLUMN, "1000");

        HashMap<String,String> temp3=new HashMap<String, String>();
        temp3.put(SECOND_COLUMN, "500");



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


        temp.put(FIRST_COLUMN, "PPSP");
        temp2.put(FIRST_COLUMN, "MDPT");
        temp3.put(FIRST_COLUMN, "JNPT");



        list.add(temp);
        list.add(temp2);
        list.add(temp3);


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

    }

    public void futu1(View view) {

        Intent inu = new Intent(TxtView.this, Import.class);
        startActivity(inu);
        finish();

    }

    public void futu(View view) {

        Toast.makeText(this, "ALREADY VIEWING TABLE-VIEW", Toast.LENGTH_SHORT).show();
    }



}
