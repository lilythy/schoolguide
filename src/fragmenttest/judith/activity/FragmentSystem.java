package fragmenttest.judith.activity;

import fragmenttest.judith.adapter.SystemAdapter;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentSystem extends Fragment{
	private static final String TAG = "FragmentSystem";
	ListView listView;
	String[] img_itemTitles = {"Ú‘«≈‘∞√¿æ∞","¬Û¬Æ‘∞∑Áπ‚","∑„¡÷‘∞æ∞…´"};
	int[] img_resids1 = {R.drawable.jiao_lake,R.drawable.jiaohu_corner,R.drawable.jiaohu,
			R.drawable.weast_lake,R.drawable.rise};
	int[] img_resids2 = {R.drawable.green_in_kiosks,R.drawable.jimmy_lu,R.drawable.music_square};
	int[] img_resids3 = {R.drawable.blue_court,R.drawable.deer_park,R.drawable.east_garden,
			R.drawable.myrtle_park,R.drawable.song_crest,R.drawable.tea_garden};
	
	private View systemview;
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
		Log.d(TAG, "onCreateView");
		systemview =  inflater.inflate(R.layout.scenery_main, container, false);
		return systemview;
    }
	
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "onActivityCreated");

		listView = (ListView)systemview.findViewById(R.id.scenery_list);
		
		listView.setAdapter(new SystemAdapter(img_itemTitles, img_resids1,img_resids2,img_resids3,getActivity().getApplicationContext()));
	}
}
