package com.xl.tablelist;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
	ListView listview;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		listview = (ListView) findViewById(R.id.mainListView);
		
		TableAdapter adapter = new TableAdapter(this);
		adapter.add(new String[]{"查看详情","联系客服"});
		adapter.add(new String[]{"订单完成","修理清单","预约"});
		adapter.add(new String[]{"类型","数量","单价"});
		
		listview.setAdapter(adapter);
		
    }
}
