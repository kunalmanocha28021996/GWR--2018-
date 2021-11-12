package com.example.th3_sagittarian.gatewayrail;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class JNPT extends AppCompatActivity {
    TextView textset;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jnpt);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("KEY");
            }
        }

        textset = (TextView) findViewById(R.id.textsetjnpt);
        textset.setText(newString);

        BarChart barChart = (BarChart) findViewById(R.id.barchartjnpt);

        ArrayList<BarEntry> entries = new ArrayList<>();


        entries.add(new BarEntry(1200f, 0));
        entries.add(new BarEntry(1000f, 1));
        entries.add(new BarEntry(500f, 2));
        entries.add(new BarEntry(1200f, 3));
        entries.add(new BarEntry(1000f, 4));
        entries.add(new BarEntry(500f, 5));

        BarDataSet bardataset = new BarDataSet(entries, "");

        bardataset.setColors(new int[] {Color.GRAY, Color.CYAN,Color.GRAY, Color.CYAN,Color.GRAY, Color.CYAN });


        ArrayList<String> labels = new ArrayList<String>();
        labels.add("GHH  ");
        labels.add("");
        labels.add("SNL  ");
        labels.add("");
        labels.add("PIYALA   ");
        labels.add("");




        /*
        String[] aa = {"ghh","jhgfj","hjgj"};
*/

        BarData data = new BarData(labels, bardataset);

        barChart.setData(data); // set the data and list of lables into chart
        barChart.setDoubleTapToZoomEnabled(false);
        barChart.setPinchZoom(false);
        barChart.setScaleEnabled(false);


        data.setValueTextSize(12);
        barChart.setDrawValueAboveBar(false);

        barChart.setDescription("");  // set the description
        barChart.getXAxis().setTextSize(13f);
        barChart.animateY(5000);

        barChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {


            @Override
            public void onValueSelected(Entry e, int dataSetIndex, Highlight h){
                float x = e.getXIndex();
                if(x==0){
                    Intent intu = new Intent (JNPT.this,FinalTableJNPT.class);
                    intu.putExtra("KEY","GHH" );
                    intu.putExtra("KEY2","JNPT" );
                    startActivity(intu);

                }
                if(x==1){
                    Intent intu = new Intent (JNPT.this,FinalTableJNPT.class);
                    intu.putExtra("KEY","GHH" );
                    intu.putExtra("KEY2","JNPT" );
                    startActivity(intu);

                }
                if(x==2){
                    Intent intu1 = new Intent (JNPT.this,FinalTableJNPT.class);
                    intu1.putExtra("KEY","SNL" );

                    intu1.putExtra("KEY2","JNPT" );
                    startActivity(intu1);

                }

                if(x==3){
                    Intent intu1 = new Intent (JNPT.this,FinalTableJNPT.class);
                    intu1.putExtra("KEY","SNL" );

                    intu1.putExtra("KEY2","JNPT" );
                    startActivity(intu1);

                }

                if(x==4){
                    Intent intu1 = new Intent (JNPT.this,FinalTableJNPT.class);
                    intu1.putExtra("KEY","PIYALA");

                    intu1.putExtra("KEY2","JNPT" );
                    startActivity(intu1);

                }

                if(x==5){
                    Intent intu1 = new Intent (JNPT.this,FinalTableJNPT.class);
                    intu1.putExtra("KEY","PIYALA" );

                    intu1.putExtra("KEY2","JNPT" );
                    startActivity(intu1);

                }

            }

            @Override
            public void onNothingSelected() {

            }
        });


    }

    public void move(View view) {
        Intent intnt = new Intent(JNPT.this, Firstjnpt.class);
        startActivity(intnt);
        finish();
    }

    public void move1(View view) {
        Toast.makeText(this, "ALREADY VIEWING GRAPH VIEW", Toast.LENGTH_SHORT).show();

    }
}
