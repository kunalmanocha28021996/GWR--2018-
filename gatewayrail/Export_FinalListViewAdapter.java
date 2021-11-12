package com.example.th3_sagittarian.gatewayrail;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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

public class Export_FinalListViewAdapter extends BaseAdapter{

	public ArrayList<HashMap<String, String>> list;
	Activity activity;

	public Export_FinalListViewAdapter(Activity activity, ArrayList<HashMap<String, String>> list){
		super();
		this.activity=activity;
		this.list=list;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	private class ViewHolder{
		TextView t1;
		TextView t2;
		TextView t3;
		TextView t4;
		TextView t5;
		TextView t6;
		TextView t7;
		TextView t8;
		TextView t9;
		TextView t0;
		TextView tueses;

	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
	
		ViewHolder holder;
		
		LayoutInflater inflater=activity.getLayoutInflater();
		
		if(convertView == null){
			
			convertView=inflater.inflate(R.layout.export_finalcolumn_row, null);
			holder=new ViewHolder();

			holder.tueses=(TextView) convertView.findViewById(R.id.tueses);
			holder.t1=(TextView) convertView.findViewById(R.id.final1);
			holder.t2=(TextView) convertView.findViewById(R.id.final2);
			holder.t3=(TextView) convertView.findViewById(R.id.final3);
			holder.t4=(TextView) convertView.findViewById(R.id.final4);
			holder.t5=(TextView) convertView.findViewById(R.id.final5);
			holder.t6=(TextView) convertView.findViewById(R.id.final6);
			holder.t7=(TextView) convertView.findViewById(R.id.final7);
			holder.t8=(TextView) convertView.findViewById(R.id.final8);
			holder.t9=(TextView) convertView.findViewById(R.id.final9);
			holder.t0=(TextView) convertView.findViewById(R.id.final0);
			convertView.setTag(holder);
		}else{
			
			holder=(ViewHolder) convertView.getTag();
		}
		
		HashMap<String, String> map=list.get(position);
		holder.t1.setText(map.get(FIRST_COLUMN));
		holder.t2.setText(map.get(SECOND_COLUMN));
		holder.t3.setText(map.get(THIRD_COLUMN));
		holder.t4.setText(map.get(FOURTH));
		holder.t5.setText(map.get(FIFTH));
		holder.t6.setText(map.get(SIXTH));
		holder.t7.setText(map.get(SEVENTH));
		holder.t8.setText(map.get(EIGHTH));
		holder.t9.setText(map.get(NINTH));
		holder.t0.setText(map.get(TENTH));
		holder.tueses.setText(map.get(TUES));

		return convertView;
	}

}