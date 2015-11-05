package fragmenttest.judith.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ScrollView;

public class Academy_Activity extends Activity{
	private ScrollView mScrollView;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.academyintroduction);
		init();
}
	private void init() {
		// TODO Auto-generated method stub
		mScrollView=(ScrollView) findViewById(R.id.academyintr);  
        mScrollView.setOnTouchListener(new TouchListenerImpl());
	}
	private class TouchListenerImpl implements OnTouchListener{  
        @Override  
        public boolean onTouch(View view, MotionEvent motionEvent) {  
            switch (motionEvent.getAction()) {  
            case MotionEvent.ACTION_DOWN:  
  
                break;  
            case MotionEvent.ACTION_MOVE:  
                 int scrollY=view.getScrollY();  
                 int height=view.getHeight();  
                 int scrollViewMeasuredHeight=mScrollView.getChildAt(0).getMeasuredHeight();  
                 if(scrollY==0){  
                        System.out.println("滑动到了顶端 view.getScrollY()="+scrollY);  
                    }  
                 if((scrollY+height)==scrollViewMeasuredHeight){  
                        System.out.println("滑动到了底部 scrollY="+scrollY);  
                        System.out.println("滑动到了底部 height="+height);  
                        System.out.println("滑动到了底部 scrollViewMeasuredHeight="+scrollViewMeasuredHeight);  
                    }  
                break;  
  
            default:  
                break;  
            }  
            return false;  
        }  
          
    }; 
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
