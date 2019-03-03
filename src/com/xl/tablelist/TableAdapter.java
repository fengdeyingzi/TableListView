package com.xl.tablelist;


import android.app.*;
import android.content.*;
import android.graphics.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import android.graphics.drawable.*;
import android.widget.LinearLayout.LayoutParams;

public class TableAdapter extends BaseAdapter
{
	


	private List<String[]> mData;
	private Context context;
	private LayoutInflater mInflater;

	public TableAdapter(Context context)
	{
		this.mInflater = LayoutInflater.from(context);
		
		this.mData=new ArrayList<String[]>();
		this.context = context;
	}



	public void onClick(View p1)
	{
		mData.remove(	p1.getId());

		notifyDataSetChanged();

	}
	public void add(String text[])
	{
		mData.add(text);
		
	}
	

	
	public void remove(int pos)
	{
		mData.remove(pos);
	}

	public void clear()
	{
		mData.clear();
	}



	public int getCount()
	{
		return mData.size();
	}

	public String[] getItem(int arg0)
	{
		return mData.get(arg0);
	}

	

	public long getItemId(int arg0)
	{
		return arg0;
	}
	//显示按钮
	public void isVisibility()
	{

	}

	public List<String[]>getData()
	{
		return mData;
	}


	public View getView(int position, View convertView, ViewGroup parent)
	{
		

        LinearLayout layout_item = new LinearLayout(context);
		layout_item.setOrientation(LinearLayout.HORIZONTAL);
		layout_item.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
		layout_item.setDividerDrawable(context.getDrawable(R.drawable.divi_h));
		
		
		for(String text:mData.get(position)){
		TextView textView = new TextView(context);
		textView.setGravity(Gravity.CENTER);
		LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT,1.0f);
		textView.setText(text);
		textView.setTextSize(18);
		layout_item.addView(textView,layoutparams);
		}
		
		return layout_item;
	}
}
