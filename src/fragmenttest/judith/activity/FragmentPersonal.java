package fragmenttest.judith.activity;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import fragmenttest.judith.activity.Carhandle_Activity;
import fragmenttest.judith.activity.R;
import fragmenttest.judith.activity.FeesActivity;
import fragmenttest.judith.activity.Dormitry_Activity;
import fragmenttest.judith.activity.SchoolIntroduct;
import fragmenttest.judith.activity.Academy_Activity;
import fragmenttest.judith.activity.SchoolMap_Activity;

public class FragmentPersonal  extends Fragment implements OnClickListener{
	private Intent intent0,intent1,intent2,intent3,intent4,intent5;
	private RelativeLayout school_intro,academy_instro,schoolcard,
	fees_layout,dormitry_layout,school_map_layout;
	
	private View personalView;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
		personalView=inflater.inflate(R.layout.fragmentpager, container, false);
		return personalView;
    }

    public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		school_intro = (RelativeLayout)personalView.findViewById(R.id.school_intro);
		academy_instro = (RelativeLayout)personalView.findViewById(R.id.academy_instro);
		schoolcard = (RelativeLayout)personalView.findViewById(R.id.schoolcard);
		fees_layout = (RelativeLayout)personalView.findViewById(R.id.fees_layout);
		dormitry_layout = (RelativeLayout)personalView.findViewById(R.id.dormitry_layout);
		school_map_layout = (RelativeLayout)personalView.findViewById(R.id.school_map_layout);

		school_intro.setOnClickListener(this);
		academy_instro.setOnClickListener(this);
		schoolcard.setOnClickListener(this);
		fees_layout.setOnClickListener(this);
		dormitry_layout.setOnClickListener(this);
		school_map_layout.setOnClickListener(this);
    }
    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		switch(id){
		case R.id.school_intro:
			intent0 = new Intent(getActivity().getApplicationContext(),SchoolIntroduct.class);
			startActivity(intent0);
			break;
		case R.id.academy_instro:
			intent1 = new Intent(getActivity().getApplicationContext(),Academy_Activity.class);
			startActivity(intent1);
			break;
		case R.id.schoolcard:
			intent2 = new Intent(getActivity().getApplicationContext(),Carhandle_Activity.class);
			startActivity(intent2);
			break;
		case R.id.fees_layout:
			intent3= new Intent(getActivity().getApplicationContext(),FeesActivity.class);
			startActivity(intent3);
			break;
		case R.id.dormitry_layout:
			intent4= new Intent(getActivity().getApplicationContext(),Dormitry_Activity.class);
			startActivity(intent4);
			break;
		case R.id.school_map_layout:
			intent5= new Intent(getActivity().getApplicationContext(),SchoolMap_Activity.class);
			startActivity(intent5);
			break;
	    }
	}
}
