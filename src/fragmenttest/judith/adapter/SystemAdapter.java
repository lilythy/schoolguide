package fragmenttest.judith.adapter;

import fragmenttest.judith.activity.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SystemAdapter extends BaseAdapter{
	String[] img_itemTitles;
	int[] img_resids1;
	int[] img_resids2;
	int[] img_resids3;
	private Context context;
	
	public SystemAdapter(String[] imgitemtitles, int[] imgresids1, int[] imgresids2,int[] imgresids3,Context context) {
		this.img_itemTitles = imgitemtitles;
		this.img_resids1 = imgresids1;
		this.img_resids2 = imgresids2;
		this.img_resids3= imgresids3;
		this.context = context;
		}
	
	private View makeImgViewf(String imgitemtitles){
		LayoutInflater inflater = LayoutInflater.from(context);
		// 使用View的对象itemView与R.layout.item关联
	   View itemview = inflater.inflate(R.layout.scenery_items, null);
	// 通过findViewById()方法实例R.layout.item内各组件 
	TextView title=(TextView)itemview.findViewById(R.id.school_area);
	title.setText(imgitemtitles);
		
	ImageView firstImg1 = (ImageView)itemview.findViewById(R.id.firstImg1);
	ImageView firstImg2 = (ImageView)itemview.findViewById(R.id.firstImg2);
	ImageView firstImg3 = (ImageView)itemview.findViewById(R.id.firstImg3);
	ImageView twstImg1 = (ImageView)itemview.findViewById(R.id.twstImg1);
	ImageView twstImg2 = (ImageView)itemview.findViewById(R.id.twstImg2);
	//ImageView twstImg3 = (ImageView)itemview.findViewById(R.id.twstImg3);
	
	firstImg1.setImageResource(img_resids1[0]);
	firstImg2.setImageResource(img_resids1[1]);
	firstImg3.setImageResource(img_resids1[2]);
    twstImg1.setImageResource(img_resids1[3]);
    twstImg2.setImageResource(img_resids1[4]);
	
	return itemview;
	}
	private View makeImgViewt(String imgitemtitles){
		LayoutInflater inflater = LayoutInflater.from(context);
		// 使用View的对象itemView与R.layout.item关联
	   View itemview = inflater.inflate(R.layout.scenery_items, null);
	// 通过findViewById()方法实例R.layout.item内各组件 
	TextView title=(TextView)itemview.findViewById(R.id.school_area);
	title.setText(imgitemtitles);
		
	ImageView firstImg1 = (ImageView)itemview.findViewById(R.id.firstImg1);
	ImageView firstImg2 = (ImageView)itemview.findViewById(R.id.firstImg2);
	ImageView firstImg3 = (ImageView)itemview.findViewById(R.id.firstImg3);
	ImageView twstImg1 = (ImageView)itemview.findViewById(R.id.twstImg1);
	ImageView twstImg2 = (ImageView)itemview.findViewById(R.id.twstImg2);
	ImageView twstImg3 = (ImageView)itemview.findViewById(R.id.twstImg3);
	
	firstImg1.setImageResource(img_resids2[0]);
	firstImg2.setImageResource(img_resids2[1]);
	firstImg3.setImageResource(img_resids2[2]);
	twstImg1.setVisibility(View.GONE);
	twstImg2.setVisibility(View.GONE);
	twstImg3.setVisibility(View.GONE);
	return itemview;
	}
	private View makeImgViewth(String imgitemtitles){
		LayoutInflater inflater = LayoutInflater.from(context);
		// 使用View的对象itemView与R.layout.item关联
	   View itemview = inflater.inflate(R.layout.scenery_items, null);
	// 通过findViewById()方法实例R.layout.item内各组件 
	TextView title=(TextView)itemview.findViewById(R.id.school_area);
	title.setText(imgitemtitles);
		
	ImageView firstImg1 = (ImageView)itemview.findViewById(R.id.firstImg1);
	ImageView firstImg2 = (ImageView)itemview.findViewById(R.id.firstImg2);
	ImageView firstImg3 = (ImageView)itemview.findViewById(R.id.firstImg3);
	ImageView twstImg1 = (ImageView)itemview.findViewById(R.id.twstImg1);
	ImageView twstImg2 = (ImageView)itemview.findViewById(R.id.twstImg2);
	ImageView twstImg3 = (ImageView)itemview.findViewById(R.id.twstImg3);
	
	firstImg1.setImageResource(img_resids3[0]);
	firstImg2.setImageResource(img_resids3[1]);
	firstImg3.setImageResource(img_resids3[2]);
    twstImg1.setImageResource(img_resids3[3]);
    twstImg2.setImageResource(img_resids3[4]);
    twstImg3.setImageResource(img_resids3[5]);
	
	return itemview;
	}

	@Override
	public int getCount() {
		return img_itemTitles.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}
	

	@Override
	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(position == 0){
			convertView = makeImgViewf(img_itemTitles[position]);
		}
		else if(position == 1){
			convertView = makeImgViewt(img_itemTitles[position]);
		}
		else{
			convertView = makeImgViewth(img_itemTitles[position]);
		}
		return convertView;
		/*
		LayoutInflater inflater = LayoutInflater.from(context);
		// 使用View的对象itemView与R.layout.item关联
	   convertView = inflater.inflate(R.layout.scenery_items, parent);
	// 通过findViewById()方法实例R.layout.item内各组件 
	TextView title=(TextView)convertView.findViewById(R.id.school_area);
		
	ImageView firstImg1 = (ImageView)convertView.findViewById(R.id.firstImg1);
	ImageView firstImg2 = (ImageView)convertView.findViewById(R.id.firstImg2);
	ImageView firstImg3 = (ImageView)convertView.findViewById(R.id.firstImg3);
	ImageView twstImg1 = (ImageView)convertView.findViewById(R.id.twstImg1);
	ImageView twstImg2 = (ImageView)convertView.findViewById(R.id.twstImg2);
	ImageView twstImg3 = (ImageView)convertView.findViewById(R.id.twstImg3);
		if(position == 0){
			title.setText(img_itemTitles[position]);
			firstImg1.setImageResource(img_resids1[0]);
			firstImg2.setImageResource(img_resids1[1]);
			firstImg3.setImageResource(img_resids1[2]);
		    twstImg1.setImageResource(img_resids1[3]);
		    twstImg2.setImageResource(img_resids1[4]);
		   // twstImg3.setImageResource(img_resids1[5]);
		}
		else if (position==2){
			title.setText(img_itemTitles[position]);
			firstImg1.setImageResource(img_resids2[0]);
			firstImg2.setImageResource(img_resids2[1]);
			firstImg3.setImageResource(img_resids2[2]);
		   // twstImg1.setImageResource(img_resids2[3]);
		   // twstImg2.setImageResource(img_resids2[4]);
		   // twstImg3.setImageResource(img_resids2[5]);
		}
		else{
			title.setText(img_itemTitles[position]);
			firstImg1.setImageResource(img_resids3[0]);
			firstImg2.setImageResource(img_resids3[1]);
			firstImg3.setImageResource(img_resids3[2]);
		    twstImg1.setImageResource(img_resids3[3]);
		    twstImg2.setImageResource(img_resids3[4]);
		    twstImg3.setImageResource(img_resids3[5]);
		}
		*/
	}

}
