package com.example.th3_sagittarian.gatewayrail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.EIGHTH;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.FIFTH;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.FIRST_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.FOURTH;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.NINTH;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.SECOND_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.SEVENTH;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.SIXTH;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.TENTH;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.THIRD_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_FinalConstant.TUES;

public class Export_FinalTableMDPT extends AppCompatActivity {
    private ArrayList<HashMap<String, String>> list;
TextView textset,ts1;
    String newString,getNewString1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.export_finaltablesmdpt);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
                getNewString1=null;

            } else {
                newString = extras.getString("KEY");

            }
        }

        textset = (TextView) findViewById(R.id.exporttt);

        textset.setText(newString);


        ListView listView=(ListView)findViewById(R.id.exportlistViewfinal);
        populateList();
        Export_FinalListViewAdapter adapter=new Export_FinalListViewAdapter(this, list);
        listView.setAdapter(adapter);

    }

    private void populateList() {
        // TODO Auto-generated method stub

        list=new ArrayList<HashMap<String,String>>();

        HashMap<String,String> temp=new HashMap<String, String>();

        temp.put(SECOND_COLUMN, "200");
        temp.put(THIRD_COLUMN, "149");
        temp.put(FOURTH, "117");
        temp.put(FIFTH, "139");

        temp.put(SEVENTH    , "133");
        temp.put(EIGHTH        , "62");
        temp.put(NINTH        , "117");
        temp.put( TENTH      , "50");
        temp.put(TUES,"1329");

///////////////////////////////fix/////////////////////////////////////////////////////////////
///////////////////////////////fix/////////////////////////////////////////////////////////////
///////////////////////////////fix/////////////////////////////////////////////////////////////
///////////////////////////////fix/////////////////////////////////////////////////////////////
        temp.put(FIRST_COLUMN, "20");
        temp.put(SIXTH , "40");
///////////////////////////////fix/////////////////////////////////////////////////////////////
///////////////////////////////fix/////////////////////////////////////////////////////////////
///////////////////////////////fix/////////////////////////////////////////////////////////////
///////////////////////////////fix/////////////////////////////////////////////////////////////
        list.add(temp);
/*

        HashMap<String,String> temp2=new HashMap<String, String>();
        temp2.put(FIRST_COLUMN, "color");
        temp2.put(SECOND_COLUMN, "By ");
        temp2.put(THIRD_COLUMN, "Rs. ");
        temp2.put(FOURTH, "per ");
        temp2.put(FIFTH, "per");
        temp2.put(SIXTH , "per");
        temp2.put(SEVENTH    , "per");
        temp2.put(EIGHTH        , "per");
        temp2.put(NINTH        , "per");
        temp2.put( TENTH      , "per");

        list.add(temp2);

        HashMap<String,String> temp3=new HashMap<String, String>();
        temp3.put(FIRST_COLUMN, "colo");
        temp3.put(SECOND_COLUMN, "By");
        temp3.put(THIRD_COLUMN, "Rs. ");
        temp3.put(FOURTH, "per ");
        temp3.put(FIFTH, "per");
        temp3.put(SIXTH , "per");
        temp3.put(SEVENTH    , "per");
        temp3.put(EIGHTH        , "per");
        temp3.put(NINTH        , "per");
        temp3.put( TENTH      , "per");


        list.add(temp3);
*/




    }
}
