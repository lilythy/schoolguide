package fragmenttest.judith.adapter;

import java.util.List;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AdapterPager extends FragmentPagerAdapter{
	private List<Fragment> fragments;
	public AdapterPager(FragmentManager fm,List<Fragment> fragments) {
		super(fm);
		this.fragments =fragments;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return( fragments==null||fragments.size()==0)?null:fragments.get(arg0);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragments==null?0:fragments.size();
	}

}
