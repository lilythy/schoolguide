package fragmenttest.judith.activity;

import java.util.ArrayList;
import java.util.List;

import fragmenttest.judith.adapter.AdapterPager;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
	private static final String TAG= "main";
	private List<Fragment> fragments = new ArrayList<Fragment>();
	private TextView bottom_text, bottom_info_text;
	private ViewPager viewPager;
	private static LinearLayout  bottom_layout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*
		//actionbar
				ActionBar actionbar = getActionBar();
				//设置action bar 的 navigation mode
				actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
				//添加actionbar的tabs
				ActionBar.Tab PersonalTab = actionbar.newTab().setText("Fargment A");
				ActionBar.Tab InformationTab = actionbar.newTab().setText("Fargment B");
				ActionBar.Tab SystemTab = actionbar.newTab().setText("Fargment C");
				// 实例化 fragment action bar 是用 fragment 来显示的
				Fragment personFragment = new FragmentPersonal();
				Fragment informationFragment = new FragmentInformation();
				Fragment systemFragment = new FragmentSystem();
				//对 tabs 设置监听事件
			  PersonalTab.setTabListener(new MyTabsListener(personFragment));
			  InformationTab.setTabListener(new MyTabsListener(informationFragment));
			  SystemTab.setTabListener(new MyTabsListener(systemFragment));
		*/
		InitView();
		
	}
	

	private void InitView() {
		// TODO Auto-generated method stub
		Log.d(TAG, "InitView");
		//bottom_layout = (LinearLayout) findViewById(R.id.bottom_layout);
		//bottom_text = (TextView) findViewById(R.id.bottom_text);
		//bottom_info_text = (TextView)findViewById(R.id.bottom_info_text);
		
		fragments.add(new FragmentPersonal());
		fragments.add(new FragmentInformation());
		fragments.add(new FragmentSystem());
		
		viewPager = (ViewPager)findViewById(R.id.vPager);
		viewPager.setAdapter(new AdapterPager(getSupportFragmentManager(),fragments));
		viewPager.setCurrentItem(0);
		viewPager.setOnPageChangeListener(new MyOnPageChangeListener());
	}

public class MyOnPageChangeListener implements OnPageChangeListener{

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
	}
	
}
}
