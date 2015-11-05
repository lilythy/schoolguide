package fragmenttest.judith.activity;

import fragmenttest.judith.adapter.ListviewAdapter;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class FragmentInformation extends Fragment 
//implements OnItemClickListener
{
	private static final String TAG = "InforFragment";
	//private Intent psIntent0,psIntent1,psIntent2,psIntent3;
	ListView listView;
    String[] itemTitles = {"ѧ����Ϣ","������","����","��Խ��","�ξ�" ,"��ɺ","����","����ѫ","����","���","����","����",
    		"�μ�","�¼ѻ�","�ƽ�","Ф����","������","������","����","½����","����","���ι���"};
    String[] itemTexts = { "��®У�����ܹ�169��","�����ˣ��ż�1��","�����ˣ��ܿ�1��","۶���ˣ������2��","�����ˣ������1��",
    		"�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��",
    		"�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��"
    		,"�����ˣ��ż�1��","�����ˣ��ż�1��","�����ˣ��ż�1��","2013_05_08"};
    int[] resIds = {R.drawable.arrow,R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,
    		R.drawable.photo5,R.drawable.photo6,R.drawable.photo7,R.drawable.photo8,R.drawable.photo9,R.drawable.photo10,
    		R.drawable.photo11,R.drawable.photo12,R.drawable.photo13,R.drawable.photo14,R.drawable.photo15,
    		R.drawable.photo16,R.drawable.photo17,R.drawable.photo18,R.drawable.photo19,R.drawable.photo20,R.drawable.gift};
	
	private View infoView;
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
		Log.d(TAG, "onCreateView");
		infoView =  inflater.inflate(R.layout.info_main, container, false);
		return infoView;
    }
	
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "onActivityCreated");

		listView = (ListView)infoView.findViewById(R.id.mylist);
		
		listView.setAdapter(new ListviewAdapter(itemTitles, itemTexts,resIds,getActivity().getApplicationContext()));
		//listView.setOnItemClickListener(this);
	}

	/*
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        parent.getItemAtPosition(position);
		switch(position){
		case 0:
		{
		    psIntent0 = new Intent(getActivity().getApplicationContext(), AboutWeChatActivity.class);
		    startActivity(psIntent0);
		}
		    break;
		case 1:
		{
			psIntent1 = new Intent(getActivity().getApplicationContext(), AboutWeChatActivity.class);
			startActivity(psIntent1);
		}
			break;
	    case 2:
	    {
	    	psIntent2 = new Intent(getActivity().getApplicationContext(), AboutWeChatActivity.class);
			startActivity(psIntent2);
	    }
			break;
	    case 3:{
	    	psIntent3 = new Intent(getActivity().getApplicationContext(), AboutWeChatActivity.class);
			startActivity(psIntent3);
	    }
			break;
		}
		
	}
	*/
}
