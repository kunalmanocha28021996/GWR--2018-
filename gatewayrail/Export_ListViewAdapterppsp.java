package com.example.th3_sagittarian.gatewayrail;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.FIRST_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.FOURTH_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.NAMER;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.SECOND_COLUMN;
import static com.example.th3_sagittarian.gatewayrail.Export_Constantsppsp.THIRD_COLUMN;

public class Export_ListViewAdapterppsp extends BaseAdapter{

	public ArrayList<HashMap<String, String>> list;
	Activity activity;
	
	public Export_ListViewAdapterppsp(Activity activity,ArrayList<HashMap<String, String>> list){
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
		TextView txtFirst;
		TextView txtSecond;
		TextView txtThird;
		TextView txtFourth;
		TextView namer;

	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
	
		ViewHolder holder;
		
		LayoutInflater inflater=activity.getLayoutInflater();
		
		if(convertView == null){
			
			convertView=inflater.inflate(R.layout.export_colmn_rowppsp, null);
			holder=new ViewHolder();
			holder.namer=(TextView) convertView.findViewById(R.id.namer);
			holder.txtFirst=(TextView) convertView.findViewById(R.id.TextFirstppsp);
			holder.txtSecond=(TextView) convertView.findViewById(R.id.TextSecondppsp);
			holder.txtThird=(TextView) convertView.findViewById(R.id.TextThirdppsp);
			holder.txtFourth=(TextView) convertView.findViewById(R.id.TextFourthppsp);
			
			convertView.setTag(holder);
		}else{
			
			holder=(ViewHolder) convertView.getTag();
		}
		
		HashMap<String, String> map=list.get(position);
		holder.namer.setText(map.get(NAMER));
		holder.txtFirst.setText(map.get(FIRST_COLUMN));
		holder.txtSecond.setText(map.get(SECOND_COLUMN));
		holder.txtThird.setText(map.get(THIRD_COLUMN));
		holder.txtFourth.setText(map.get(FOURTH_COLUMN));

		return convertView;
	}

}