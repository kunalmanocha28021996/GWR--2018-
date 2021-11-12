package com.example.th3_sagittarian.gatewayrail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Export extends AppCompatActivity {
    String PPSP = "GHH";
    String MDPT = "SNL";
    String JNPT = "Piyala";
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_export);

        Button b1 = (Button) findViewById(R.id.exportft);
        Button b2 = (Button) findViewById(R.id.exportfg);

        BarChart barChart = (BarChart) findViewById(R.id.exportbarchart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(1500f, 0));
        entries.add(new BarEntry(1000f, 1));
        entries.add(new BarEntry(500f, 2));

        BarDataSet bardataset = new BarDataSet(entries, "");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("GHH");
        labels.add("SNL");
        labels.add("Piyala");
        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of lables into chart
        data.setValueTextSize(12);
        barChart.setDescription("");  // set the description
        barChart.getXAxis().setTextSize(18f);
        bardataset.setColors(ColorTemplate.LIBERTY_COLORS);
        barChart.setDrawValueAboveBar(false);

        barChart.animateY(5000);

        barChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
                float x = e.getXIndex();
                if(x==0){
                    Intent intu = new Intent (Export.this,Export_Import2.class);
                    intu.putExtra("KEY",PPSP );
                    startActivity(intu);

                }
                if(x==1){
                    Intent intu = new Intent (Export.this,Export_MDPT.class);
                    intu.putExtra("KEY",MDPT );
                    startActivity(intu);

                }
                if(x==2){
                    Intent intu1 = new Intent (Export.this,Export_JNPT.class);
                    intu1.putExtra("KEY",JNPT );
                    startActivity(intu1);

                }


            }

            @Override
            public void onNothingSelected() {

            }
        });
/*

barChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {

    @Override
    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
        float x = e.getXIndex();
        if (x==0){
            Toast.makeText(MainActivity.this, "00", Toast.LENGTH_SHORT).show();

*/
/*
/            Intent intu = new Intent (MainActivity.this,Import2.class);
            intu.putExtra("KEY",PPSP );
            startActivity(intu);
*//*


        }
        if (x==1){
            Toast.makeText(MainActivity.this, "11", Toast.LENGTH_SHORT).show();
        }
        if (x==2){
            Toast.makeText(MainActivity.this, "22", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onNothingSelected() {

    }
});

*/

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Export.this, "ALREADY VIEWING GRAPH-VIEW", Toast.LENGTH_SHORT).show();
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Export.this, "OKAY", Toast.LENGTH_SHORT).show();
                Intent inu = new Intent(Export.this, Export_TxtView.class);
                startActivity(inu);
                finish();
            }
        });
    }
}
