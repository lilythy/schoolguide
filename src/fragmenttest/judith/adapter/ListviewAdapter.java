package fragmenttest.judith.adapter;

import fragmenttest.judith.activity.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListviewAdapter extends BaseAdapter{

	String[] itemTitles;
	String[] itemTexts;
	int[] resids;
	private Context context;
	
	public ListviewAdapter(String[] itemtitles, String[] itemtexts,
			int[] resids, Context context) {
		this.itemTitles = itemtitles;
		this.itemTexts = itemtexts;
		this.resids = resids;
		this.context = context;
	}
	
	private View makeItem0View(String itemtitles, String itemtexts,
			int resids  ){
		LayoutInflater inflater = LayoutInflater.from(context);
		// 使用View的对象itemView与R.layout.item关联
	   View itemview = inflater.inflate(R.layout.item1, null);
	// 通过findViewById()方法实例R.layout.item内各组件 
	TextView title=(TextView)itemview.findViewById(R.id.academy);
	title.setText(itemtitles);
	TextView text=(TextView)itemview.findViewById(R.id.item1text);
	text.setText(itemtexts);
	ImageView image = (ImageView) itemview.findViewById(R.id.unfold); 	 
	image.setImageResource(resids); 
	
	return itemview;		
	}

	private View makeItemView(String itemtitles, String itemtexts,
			int resids) {
		LayoutInflater inflater = LayoutInflater.from(context);
			
		// 使用View的对象itemView与R.layout.item关联
		View itemview = inflater.inflate(R.layout.items, null);
		// 通过findViewById()方法实例R.layout.items内各组件 
		TextView title=(TextView)itemview.findViewById(R.id.itemtitle);
		title.setText(itemtitles);
		TextView text=(TextView)itemview.findViewById(R.id.itemcontect);
		text.setText(itemtexts);
		ImageView image = (ImageView) itemview.findViewById(R.id.images); 	 
		image.setImageResource(resids); 
		
		return itemview;
	}
	
	private View makeItemlsView(String itemtitles, String itemtexts,
			int resids  ){
		LayoutInflater inflater = LayoutInflater.from(context);
		// 使用View的对象itemView与R.layout.item关联
	   View itemview = inflater.inflate(R.layout.itemlast, null);
	// 通过findViewById()方法实例R.layout.item内各组件 
	/*TextView name=(TextView)itemview.findViewById(R.id.name);
	name.setText(itemtitles);
	TextView text=(TextView)itemview.findViewById(R.id.text);
	text.setText(itemtexts);
	ImageView image = (ImageView) itemview.findViewById(R.id.pic); 	 
	image.setImageResource(resids); */
	
	return itemview;		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return itemTitles.length;
	}

	@Override
	public View getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(position == 0) {
			convertView = makeItem0View(itemTitles[position], itemTexts[position], resids[position]);
		}else if(position == itemTitles.length -1) {
			convertView = makeItemlsView(itemTitles[position], itemTexts[position], resids[position]);
		}else {
			convertView = makeItemView(itemTitles[position], itemTexts[position], resids[position]);
		}
		
		return convertView;
	}	

}

